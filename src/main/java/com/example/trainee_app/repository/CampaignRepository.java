package com.example.trainee_app.repository;

import com.example.trainee_app.entities.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign, Long> {
boolean existsByCampaignId(String campaignId);
java.util.Optional<Campaign> findByCampaignId(String campaignId);
// Custom query: find all campaigns by platform
java.util.List<Campaign> findByPlatformIgnoreCase(String platform);
}
