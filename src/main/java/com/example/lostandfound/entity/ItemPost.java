package com.example.lostandfound.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "item_posts")
public class ItemPost {
    @Id
    @GeneratedValue()
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "category_id")
    private Long categoryId;
    @Column(name = "location_id")
    private Long locationId;
    @Column(name = "post_type")
    private String postType;
    @Column(name = "tittle")
    private String tittle;
    @Column(name = "description")
    private String description;
    @Column(name = "incident_at")
    private LocalDateTime incidentAt;
    @Column(name = "status")
    private String status;
    @Column(name = "review_by")
    private Long reviewBy;

    public Long getId() {
        return id;
    }

    public ItemPost setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public ItemPost setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public ItemPost setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Long getLocationId() {
        return locationId;
    }

    public ItemPost setLocationId(Long locationId) {
        this.locationId = locationId;
        return this;
    }

    public String getPostType() {
        return postType;
    }

    public ItemPost setPostType(String postType) {
        this.postType = postType;
        return this;
    }

    public String getTittle() {
        return tittle;
    }

    public ItemPost setTittle(String tittle) {
        this.tittle = tittle;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ItemPost setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDateTime getIncidentAt() {
        return incidentAt;
    }

    public ItemPost setIncidentAt(LocalDateTime incidentAt) {
        this.incidentAt = incidentAt;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ItemPost setStatus(String status) {
        this.status = status;
        return this;
    }

    public Long getReviewBy() {
        return reviewBy;
    }

    public ItemPost setReviewBy(Long reviewBy) {
        this.reviewBy = reviewBy;
        return this;
    }
}
