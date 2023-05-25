package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Service;

class Start {
    public static void main(String[] args) {
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
        
        //CheckLogIn c = context.getBean(CheckLogIn.class);
        //System.out.println(c.name);
        
        //SpringApplication.exit(context);
    }
}

@SpringBootApplication
class Setup {
    
}

@Service @Indexed
class CheckLogIn {
    String name = "iCoffee";
}