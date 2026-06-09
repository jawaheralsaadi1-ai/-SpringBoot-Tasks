package com.example.trainee_app;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


    @Service
    public class RegistrationService {

        // declaring collection — simulates database using HashMap
        private Map<Integer, EventRegistration> registrations = new HashMap<>();


        // Initialize sample data
        public RegistrationService() {
            registrations.put(101, new EventRegistration(101, "Ahmed"));
            registrations.put(102, new EventRegistration(102, "Sara"));
            registrations.put(103, new EventRegistration(103, "John"));
            registrations.put(104, new EventRegistration(104, "Fatima"));
            registrations.put(105, new EventRegistration(105, "Omar"));
        }
        // Bulk DELETE Method
        public String deleteMultipleByIds(List<Integer> ids) {
            List<Integer> deletedIds  = new ArrayList<>();
            List<Integer> notFoundIds = new ArrayList<>();

            // Loop through each requested id and check existence
            for (int id : ids) {
                if (registrations.containsKey(id)) {
                    registrations.remove(id);
                    deletedIds.add(id);
                } else {
                    notFoundIds.add(id);
                }
            }

            return "Bulk Deletion Completed\n"
                    + "Total Requested     : " + ids.size()          + "\n"
                    + "Deleted Successfully: " + deletedIds.size()   + "\n"
                    + "Deleted IDs         : " + deletedIds          + "\n"
                    + "Not Found IDs       : " + notFoundIds;
        }

    }
