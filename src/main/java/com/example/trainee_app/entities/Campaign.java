package com.example.trainee_app.entities;

public class Campaign {
//Declaring variables
    private String campaignId;
    private String campaignName;
    private String platform;
    private double budget;


    // Constructor - to initialize all fields
    public Campaign(String campaignId, String campaignName, String platform, double budget) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.platform = platform;
        this.budget = budget;
    }
        // Getter Method
        public String getCampaignId() {
            return campaignId;
        }

        public String getCampaignName() {
            return campaignName;
        }

        public String getPlatform() {
            return platform;
        }

        public double getBudget() {
            return budget;
        }

    }

