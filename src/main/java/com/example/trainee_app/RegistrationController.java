package com.example.trainee_app;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RegistrationController {

    // Inject service layer — controller handles request/response only
    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    // Create DELETE endpoint
    @DeleteMapping("/registrations")
    public String deleteRegistrations(@RequestParam String ids) {

        // Parse comma-separated string into List<Integer>
        List<Integer> idList = Arrays.stream(ids.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        return registrationService.deleteMultipleByIds(idList);
    }
}


