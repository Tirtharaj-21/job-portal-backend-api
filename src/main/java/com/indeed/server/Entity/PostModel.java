package com.indeed.server.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "posts")
@Data
public class PostModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotEmpty
    private String profile;

    @NotNull
    private String type;

    @NotNull
    private String description;

    @NotNull
    private String experience;

    @NotNull
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "post_technologies", joinColumns = @JoinColumn(name = "post_id"))
    @Column(name = "technology", nullable = false)
    private List<String> technology;

    @NotNull
    private String salary;

    private Instant createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = Instant.now();
    }
}