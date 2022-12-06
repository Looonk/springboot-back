package cu.uci.cesim.hce_back;


import controllers.SendAndReceiveMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HCE_BackApplication implements CommandLineRunner {

    @Autowired
    private SendAndReceiveMessage hl7App;

    @Autowired
    public static void main(String[] args) {
        SpringApplication.run(HCE_BackApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if(hl7App == null)
            System.out.println("NOOOOOO");
        else System.out.println("YESSSSSSSS");
    }
}
