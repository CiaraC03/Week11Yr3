package ie.atu.userservicewk4;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "confirmation-service", url = "http://confirmation-service:8081")
public interface RegistrationServiceClient {
    @PostMapping("/confirm")
    String someDetails(@RequestBody UserDetails userDetails);

}
