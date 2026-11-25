package com.example.lostandfound.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "categories")
public class Category {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Getter
    @Column(name = "name",nullable = false)
    private String name;
    @Getter
    @Column(name = "description")
    private String description;
    @Column(name = "is_active",nullable = false)
    private Boolean isActive;
    @Getter
    @CreationTimestamp
    @Column(name = "create_at",updatable = false)
    private LocalDateTime createAt;

    public Category setId(Long id) {
        this.id = id;
        return this;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    public Category setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getActive() {
        return isActive;
    }

    public Category setActive(Boolean active) {
        isActive = active;
        return this;
    }

    public Category setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
        return this;
    }
}
