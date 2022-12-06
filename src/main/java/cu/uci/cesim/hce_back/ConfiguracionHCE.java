package cu.uci.cesim.hce_back;

import controllers.SendAndReceiveMessage;
import cu.uci.cesim.hce_back.HISConnector.SendAndReceiveMessage_Imp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class ConfiguracionHCE {


    @Bean
    @Scope("singleton")
    public SendAndReceiveMessage sendAndReceiveMessage_imp(){
        return new SendAndReceiveMessage_Imp(/*Initializer.fillData().getReceivers(), Initializer.fillData().getHandlers()*/);
    }
}
