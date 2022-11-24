package com.testing.ConfigFile;


import com.testing.HISConnector.ReceiverApp_Imp;
import controllers.ReceiverApplication;
import entity.App;
import entity.AppReceiver;
import entity.AppSender;
import entity.KeyWrapper;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.security.Key;
import java.util.*;

public class Initializer {

    private final ArrayList<Sender> senders = new ArrayList<Sender>();

    public String read() {
        File file = null;
        try {
            file = new File(new ClassPathResource("initializer_data.txt").getFile().toURI());

            Scanner sc = null;

            sc = new Scanner(file);

            sc.useDelimiter("\\Z");
            return sc.next();

        } catch (IOException e) {
            System.err.println("File not found");
        }
        return "";
    }

    public Data fillData() {
        String out = read();
        System.out.println(out);
        String[] raw = out.split(",");

        String name = raw[0];
        int port = Integer.parseInt(raw[1]);
        String facility = raw[2];

        String senderraw = raw[3].substring(1, raw[3].length() - 1);
        if (senderraw.contains("&")) {
            String[] sl = senderraw.split("&");
            for (String s : sl) {
                fillSender(s);
            }
        } else {
            fillSender(senderraw);
        }

        KeyWrapper kw = new KeyWrapper(name);
        AppReceiver app = new AppReceiver(name, port, facility, null);
        SortedMap<KeyWrapper, AppReceiver> config = new TreeMap<>();
        SortedMap<String, AppSender> appS = new TreeMap<>();


        for (Sender x : senders) {
            AppSender s = new AppSender(x.getName(), x.getPort(), x.getFacility(), x.getAddress());
            appS.put(x.getName(), s);
        }

        app.setSenders(appS);
        config.put(new KeyWrapper(app.getName()), app);
        SortedMap<KeyWrapper, ReceiverApplication> handlers = new TreeMap<>();
        handlers.put(kw, new ReceiverApp_Imp(app));

        return new Data(config, handlers);

    }

    public void fillSender(String raw) {
        String[] sr = raw.split(";");
        String sn = sr[0];
        String sa = sr[1];
        int sp = Integer.parseInt(sr[2]);
        String sf = sr[3];
        boolean hltOverHttp, tls, idis, erp;
        hltOverHttp = sr[4].equalsIgnoreCase("true");
        tls = sr[5].equalsIgnoreCase("true");
        idis = sr[6].equalsIgnoreCase("true");
        erp = sr[7].equalsIgnoreCase("true");
        Sender x = new Sender(sn, sa, sp, sf, hltOverHttp, tls, idis, erp);
        senders.add(x);
    }


}
