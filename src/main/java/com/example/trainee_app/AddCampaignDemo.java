package com.example.trainee_app;

public class AddCampaignDemo {
    public static void main(String[] args) {
    CampaignManager manager1 = new CampaignManager();

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

    }
}