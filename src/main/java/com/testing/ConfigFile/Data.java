package com.testing.ConfigFile;

import controllers.ReceiverApplication;
import entity.AppReceiver;
import entity.KeyWrapper;

import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class Data {



    private SortedMap<KeyWrapper, AppReceiver> receivers = new TreeMap<>();

    public SortedMap<KeyWrapper, AppReceiver> getReceivers() {
        return receivers;
    }

    public void setReceivers(SortedMap<KeyWrapper, AppReceiver> receivers) {
        this.receivers = receivers;
    }

    public SortedMap<KeyWrapper, ReceiverApplication> getHandlers() {
        return handlers;
    }

    public void setHandlers(SortedMap<KeyWrapper, ReceiverApplication> handlers) {
        this.handlers = handlers;
    }

    private SortedMap<KeyWrapper, ReceiverApplication> handlers = new TreeMap<>();



    public Data(SortedMap<KeyWrapper, AppReceiver> receivers, SortedMap<KeyWrapper, ReceiverApplication> handlers) {
        this.receivers = receivers;
        this.handlers = handlers;
    }


}
