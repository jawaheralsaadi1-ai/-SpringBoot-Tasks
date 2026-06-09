package com.example.trainee_app;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    // Inject service layer — controller handles request/response only
    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

}
