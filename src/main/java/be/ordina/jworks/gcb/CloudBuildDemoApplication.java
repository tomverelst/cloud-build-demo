package be.ordina.jworks.gcb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CloudBuildDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudBuildDemoApplication.class, args);
    }

    @Controller
    public static class HelloController {


        @GetMapping
        public String get(){
            return "Hello, Cloud Build!";
        }

    }

}
