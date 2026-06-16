package com.example.trainee_app.service;

import com.example.trainee_app.entities.Campaign;
import com.example.trainee_app.repository.CampaignRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AddCampaignService {

    private final CampaignRepository campaignRepository;

    public AddCampaignService(CampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }

    // ── CREATE — prevents duplicate campaignId ──
    public Campaign createCampaign(Campaign campaign) {
        if (campaignRepository.existsByCampaignId(campaign.getCampaignId())) {
            throw new RuntimeException("Campaign ID already exists: " + campaign.getCampaignId());
        }
        return campaignRepository.save(campaign);
    }

    // ── READ ALL ──
    public List<Campaign> getAllCampaigns() {
        return campaignRepository.findAll();
    }

    // ── READ ALL PAGED ──
    public Page<Campaign> getAllCampaignsPaged(Pageable pageable) {
        return campaignRepository.findAll(pageable);
    }

    // ── READ BY DB ID ──
    public Optional<Campaign> getCampaignById(Long id) {
        return campaignRepository.findById(id);
    }

    // ── READ BY BUSINESS CODE ──
    public Optional<Campaign> getCampaignByCode(String campaignId) {
        return campaignRepository.findByCampaignId(campaignId);
    }

    // ── FILTER BY PLATFORM ──
    public List<Campaign> getCampaignsByPlatform(String platform) {
        return campaignRepository.findByPlatformIgnoreCase(platform);
    }

    // ── UPDATE ──
    public Campaign updateCampaign(Long id, Campaign updatedCampaign) {
        Campaign existing = campaignRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Campaign not found with id: " + id));
        existing.setCampaignName(updatedCampaign.getCampaignName());
        existing.setPlatform(updatedCampaign.getPlatform());
        existing.setBudget(updatedCampaign.getBudget());
        return campaignRepository.save(existing);
    }

    // ── DELETE ──
    public void deleteCampaign(Long id) {
        if (!campaignRepository.existsById(id)) {
            throw new RuntimeException("Campaign not found with id: " + id);
        }
        campaignRepository.deleteById(id);
    }
}
