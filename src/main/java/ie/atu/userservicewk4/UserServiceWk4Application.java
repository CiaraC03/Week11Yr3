package ie.atu.userservicewk4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UserServiceWk4Application {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceWk4Application.class, args);
    }

}
