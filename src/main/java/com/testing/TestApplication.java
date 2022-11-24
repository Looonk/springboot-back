package com.testing;


import com.testing.ConfigFile.Data;
import com.testing.ConfigFile.Initializer;
import com.testing.HISConnector.SendAndReceiveMessage_Imp;
import entity.KeyWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TestApplication {


    private static Initializer init;
    private SendAndReceiveMessage_Imp sender;

    @Autowired
    public static void main(String[] args) {

        Data data = init.fillData();
        //sender.startServerIn(new KeyWrapper("HCE Nube"));

        SpringApplication.run(TestApplication.class, args);
    }

}
