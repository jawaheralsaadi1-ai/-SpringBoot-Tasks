package com.example.trainee_app.service;

import com.example.trainee_app.controller.CampaignController;
import com.example.trainee_app.entities.Campaign;

public class AddCampaignService {
    public static void main(String[] args) {
        CampaignController manager1 = new CampaignController();
        // Display existing campaigns before POST operation
        System.out.println("\n--- Existing Campaigns ---");
        manager1.displayCampaigns();
        System.out.println("--------------------------");

        // Test POST operation — create new campaign and pass to manager
        Campaign newCampaign1 = new Campaign("C104", "Ramadan Offer", "Facebook Ads", 700);
        System.out.println("\nNew Campaign : "
                + newCampaign1.getCampaignId()
                + " → " + newCampaign1.getCampaignName()
                + " → " + newCampaign1.getPlatform()
                + " → " + newCampaign1.getBudget());

        // Perform POST operation via manager
        System.out.println("\n" + manager1.addCampaign(newCampaign1));

        // Display updated campaign list after POST operation
        System.out.println("\n--- Updated Campaign List ---");
        manager1.displayCampaigns();
        System.out.println("-----------------------------");

    }
}