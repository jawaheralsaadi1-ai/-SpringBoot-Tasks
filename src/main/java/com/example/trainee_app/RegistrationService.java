package com.example.trainee_app;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


    @Service
    public class RegistrationService {

        // declaring collection — simulates database using HashMap
        private Map<Integer, EventRegistration> registrations = new HashMap<>();
}
