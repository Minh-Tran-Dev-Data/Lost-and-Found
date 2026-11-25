package com.example.lostandfound.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "item_images")
public class ItemImage {
//    SELECT `item_posts`.`id`,
//            `item_posts`.`user_id`,
//            `item_posts`.`category_id`,
//            `item_posts`.`location_id`,
//            `item_posts`.`post_type`,
//            `item_posts`.`title`,
//            `item_posts`.`description`,
//            `item_posts`.`incident_at`,
//            `item_posts`.`status`,
//            `item_posts`.`reviewed_by`
//    FROM `lost_found`.`item_posts`;
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name ="category_id" )
    private Long categoryId;
    @Column(name = "location_id" )
    private Long locationId;
    @Column (name = "post_type")
    private String postType;
    @Column (name = "title")
    private String title;
    @Column (name = "description")
    private String description;
    @Column (name = "incident_at" )
    private LocalDateTime incidentAt;
    @Column (name =  "status")
    private String status;
    @Column (name = "reviewed_by" )
    private Long reviewBy;

    public Long getId() {
        return id;
    }

    public ItemImage setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public ItemImage setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public ItemImage setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Long getLocationId() {
        return locationId;
    }

    public ItemImage setLocationId(Long locationId) {
        this.locationId = locationId;
        return this;
    }

    public String getPostType() {
        return postType;
    }

    public ItemImage setPostType(String postType) {
        this.postType = postType;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ItemImage setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ItemImage setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDateTime getIncidentAt() {
        return incidentAt;
    }

    public ItemImage setIncidentAt(LocalDateTime incidentAt) {
        this.incidentAt = incidentAt;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ItemImage setStatus(String status) {
        this.status = status;
        return this;
    }

    public Long getReviewBy() {
        return reviewBy;
    }

    public ItemImage setReviewBy(Long reviewBy) {
        this.reviewBy = reviewBy;
        return this;
    }
}
