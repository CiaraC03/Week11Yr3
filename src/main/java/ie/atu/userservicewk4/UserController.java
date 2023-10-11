package ie.atu.userservicewk4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

public class UserController {
    private RegistrationServiceClient registrationServiceClient;
    private UserDetails userDetails;

    //Injecting feign client interface
    @Autowired
    public UserController(RegistrationServiceClient registrationServiceClient, UserDetails userDetails)
    {
        this.registrationServiceClient = registrationServiceClient;
        this.userDetails = userDetails;
    }

    @PostMapping("/confirm-and-register")
    public Map<String, String> confirmAndRegister(@RequestBody UserDetails userDetails)
    {
        String confirm = registrationServiceClient.someDetails(userDetails);
        Map<String, String> responseMessage = new HashMap<>();
        responseMessage.put("message", confirm);
        return responseMessage;
    }




}
