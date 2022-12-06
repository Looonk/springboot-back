package cu.uci.cesim.hce_back.ConfigFile;


import ca.uhn.hl7v2.protocol.ReceivingApplication;
import cu.uci.cesim.hce_back.HISConnector.ReceiverApp_Imp;
import entity.AppReceiver;
import entity.AppSender;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Initializer {

    //private final ArrayList<Sender> senders = new ArrayList<Sender>();

    public static String read() {
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

    public static Data fillData() {

        ArrayList<Sender> senders = new ArrayList<Sender>();

        String out = read();
        String[] raw = out.split(",");

        String name = raw[0];
        int port = Integer.parseInt(raw[1]);
        String facility = raw[2];

        String senderraw = raw[3].substring(1, raw[3].length() - 1);
        if (senderraw.contains("&")) {
            String[] sl = senderraw.split("&");
            for (String s : sl) {
                senders.add(fillSender(s));
            }
        } else {
            senders.add(fillSender(senderraw));
        }


        AppReceiver app = new AppReceiver(name, port, facility, null);

        SortedMap<String, AppReceiver> config = new TreeMap<>();

        SortedMap<String, ReceivingApplication> handlers = new TreeMap<>();
        handlers.put(app.getName(), new ReceiverApp_Imp(app));



        SortedMap<String, AppSender> appS = new TreeMap<>();
        for (Sender x : senders) {
            AppSender s = new AppSender(x.getName(), x.getPort(), x.getFacility(), x.getAddress());
            appS.put(x.getName(), s);
        }
        app.setSenders(appS);
        app.setCloud(true);
        config.put(app.getName(), app);


        return new Data(config, handlers);

    }

    public static Sender fillSender(String raw) {
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
        return new Sender(sn, sa, sp, sf, hltOverHttp, tls, idis, erp);
        //senders.add(x);
    }


}
