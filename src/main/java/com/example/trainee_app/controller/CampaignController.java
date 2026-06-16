package com.example.trainee_app.controller;

import com.example.trainee_app.entities.Campaign;
import com.example.trainee_app.service.AddCampaignService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/campaigns")
public class CampaignController {

    private  AddCampaignService campaignService;

    public CampaignController() {
        this.campaignService = campaignService;
    }

    // ── POST /campaigns ──
    @PostMapping
    public ResponseEntity<Campaign> create(@Valid @RequestBody Campaign campaign) {
        return ResponseEntity.ok(campaignService.createCampaign(campaign));
    }

    // ── GET /campaigns ──
    @GetMapping
    public ResponseEntity<List<Campaign>> getAll() {
        return ResponseEntity.ok(campaignService.getAllCampaigns());
    }

    // ── GET /campaigns/paged ──
    @GetMapping("/paged")
    public ResponseEntity<Page<Campaign>> getAllPaged(
            @RequestParam(defaultValue = "0")  int page,
            @RequestParam(defaultValue = "5")  int size,
            @RequestParam(defaultValue = "id") String sortBy) {
        PageRequest pageRequest = PageRequest.of(page, size, Sort.by(sortBy));
        return ResponseEntity.ok(campaignService.getAllCampaignsPaged(pageRequest));
    }

    // ── GET /campaigns/{id} ──
    @GetMapping("/{id}")
    public ResponseEntity<Campaign> getById(@PathVariable Long id) {
        return campaignService.getCampaignById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // ── GET /campaigns/code/{campaignId} — find by business code like "C101" ──
    @GetMapping("/code/{campaignId}")
    public ResponseEntity<Campaign> getByCode(@PathVariable String campaignId) {
        return campaignService.getCampaignByCode(campaignId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // ── GET /campaigns/platform?name=Instagram ──
    @GetMapping("/platform")
    public ResponseEntity<List<Campaign>> getByPlatform(@RequestParam String name) {
        return ResponseEntity.ok(campaignService.getCampaignsByPlatform(name));
    }

    // ── PUT /campaigns/{id} ──
    @PutMapping("/{id}")
    public ResponseEntity<Campaign> update(@PathVariable Long id,
                                           @Valid @RequestBody Campaign campaign) {
        return ResponseEntity.ok(campaignService.updateCampaign(id, campaign));
    }

    // ── DELETE /campaigns/{id} ──
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        campaignService.deleteCampaign(id);
        return ResponseEntity.ok("Campaign deleted successfully.");
    }
}
