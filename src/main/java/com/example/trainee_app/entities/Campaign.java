package com.example.trainee_app.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "campaigns")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Campaign ID is required")
    @Column(name = "campaign_code", nullable = false, unique = true)
    private String campaignId;

    @NotBlank(message = "Campaign name is required")
    @Column(nullable = false)
    private String campaignName;

    @NotBlank(message = "Platform is required")
    @Column(nullable = false)
    private String platform;

    @Min(value = 0, message = "Budget cannot be negative")
    @Column(nullable = false)
    private double budget;

    //  No-arg constructor required by JPA
    public Campaign() {}

    public Campaign(String campaignId, String campaignName, String platform, double budget) {
        this.campaignId   = campaignId;
        this.campaignName = campaignName;
        this.platform     = platform;
        this.budget       = budget;
    }

    //  Getters
    public Long   getId()            { return id;           }
    public String getCampaignId()    { return campaignId;   }
    public String getCampaignName()  { return campaignName; }
    public String getPlatform()      { return platform;     }
    public double getBudget()        { return budget;       }

    //  Setters
    public void setId(Long id)                      { this.id           = id;           }
    public void setCampaignId(String campaignId)    { this.campaignId   = campaignId;   }
    public void setCampaignName(String campaignName){ this.campaignName = campaignName; }
    public void setPlatform(String platform)        { this.platform     = platform;     }
    public void setBudget(double budget)            { this.budget       = budget;       }
}
