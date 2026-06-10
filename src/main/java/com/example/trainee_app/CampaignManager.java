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

    // Create POST method — validates id, checks duplicate, adds campaign if valid
    public String addCampaign(Campaign campaign) {

        // Check if campaign ID already exists
        for (Campaign c : campaigns) {
            if (c.getCampaignId().equalsIgnoreCase(campaign.getCampaignId())) {
                return "Campaign ID already exists.\n"
                        + "No campaign was created.";
            }
        }

        // No duplicate found — add campaign to collection
        campaigns.add(campaign);

        return "Campaign Created Successfully.\n"
                + "Campaign ID   : " + campaign.getCampaignId()   + "\n"
                + "Campaign Name : " + campaign.getCampaignName() + "\n"
                + "Platform      : " + campaign.getPlatform()     + "\n"
                + "Budget        : " + campaign.getBudget()       + "\n"
                + "Status        : Active";

    }

    // Display all active campaigns in the collection
    public void displayCampaigns() {
        if (campaigns.isEmpty()) {
            System.out.println("  No campaigns found.");
            return;
        }
        for (Campaign campaign : campaigns) {
            System.out.println("  - " + campaign.getCampaignId()
                    + " → " + campaign.getCampaignName()
                    + " → " + campaign.getPlatform()
                    + " → " + campaign.getBudget());
        }
    }
}

