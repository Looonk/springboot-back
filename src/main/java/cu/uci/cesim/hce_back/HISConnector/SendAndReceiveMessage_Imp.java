package cu.uci.cesim.hce_back.HISConnector;

import ca.uhn.hl7v2.protocol.ReceivingApplication;
import controllers.SendAndReceiveMessage;
import cu.uci.cesim.hce_back.ConfigFile.Initializer;
import entity.AppReceiver;
import org.springframework.stereotype.Component;

import java.util.SortedMap;

@Component("hl7App")
public class SendAndReceiveMessage_Imp extends SendAndReceiveMessage {


    /*
    @Autowired
    public SendAndReceiveMessage_Imp() {
        super(Initializer.fillData().getReceivers(), Initializer.fillData().getHandlers(), null);
    }
    */

    public SendAndReceiveMessage_Imp(SortedMap<String, AppReceiver> receivers, SortedMap<String, ReceivingApplication> handlers) {
        super(receivers,handlers);
    }
    public SendAndReceiveMessage_Imp() {
        super(Initializer.fillData().getReceivers(), Initializer.fillData().getHandlers());
    }

}
