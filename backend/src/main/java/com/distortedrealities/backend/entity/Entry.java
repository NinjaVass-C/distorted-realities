package com.distortedrealities.backend.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

/**
 *
 * Organization: Distorted Realities
 * Author: Connor Vass
 * Created: February 2nd, 2025
 *
 * Description: Entry entity for each post/entry,
 * contains data about author, approver, post status,
 * and actual data about the post
 */



@Entity
public class Entry {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;
    @ManyToOne
    @JoinColumn(name = "approver_id")
    private User approver;
    private Boolean approvalStatus;
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;
    private LocalDateTime updatedAt;

    public Entry() {

    }

    public User getApprover() {
        return approver;
    }

    public void setApprover(User approver) {
        this.approver = approver;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Boolean getApprovalStatus() {
        return approvalStatus;
    }
    public void setApprovalStatus(Boolean approvalStatus) {
        this.approvalStatus = approvalStatus;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }
    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }



}
