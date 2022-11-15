package com.testing.connector;

import java.util.SortedMap;

import ca.uhn.hl7v2.protocol.ReceivingApplication;
import controllers.SendAndReceiveMessage;
import entity.AppReceiver;
import entity.ComponentConnection;
import entity.KeyWrapper;

public class SendAndReceiveMessage_Imp extends SendAndReceiveMessage {

    public SendAndReceiveMessage_Imp(SortedMap<KeyWrapper, AppReceiver> arg0,
            SortedMap<KeyWrapper, ReceivingApplication> arg1, ComponentConnection arg2) {
        super(arg0, arg1, arg2);
        // TODO Auto-generated constructor stub
    }

   

}
