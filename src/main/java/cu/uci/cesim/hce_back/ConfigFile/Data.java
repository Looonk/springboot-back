package cu.uci.cesim.hce_back.ConfigFile;

import ca.uhn.hl7v2.protocol.ReceivingApplication;
import entity.AppReceiver;

import java.util.SortedMap;


public class Data {


    private SortedMap<String, AppReceiver> receivers;

    public SortedMap<String, AppReceiver> getReceivers() {
        return receivers;
    }

    public void setReceivers(SortedMap<String, AppReceiver> receivers) {
        this.receivers = receivers;
    }

    public SortedMap<String, ReceivingApplication> getHandlers() {
        return handlers;
    }

    public void setHandlers(SortedMap<String, ReceivingApplication> handlers) {
        this.handlers = handlers;
    }

    private SortedMap<String, ReceivingApplication> handlers;


    public Data(SortedMap<String, AppReceiver> receivers, SortedMap<String, ReceivingApplication> handlers) {
        this.receivers = receivers;
        this.handlers = handlers;
    }


}
