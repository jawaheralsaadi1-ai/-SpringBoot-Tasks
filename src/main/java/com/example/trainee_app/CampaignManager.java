package com.example.trainee_app;

import java.util.ArrayList;

//--This class will manage all marketing campaign operations--
public class CampaignManager {

    // create collection to store data
    private ArrayList<Campaign> campaigns = new ArrayList<>();

    // Initialize collection with sample data
    public CampaignManager() {
        campaigns.add(new Campaign("C101", "Summer Sale", "Instagram", 500));
        campaigns.add(new Campaign("C102", "Black Friday", "Google Ads", 1000));
        campaigns.add(new Campaign("C103", "Email Promo", "Email", 300));
    }
}