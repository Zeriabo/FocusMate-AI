package com.focusmate.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "task")
public class Task extends PanacheEntityBase {
    @Id
    public UUID id = UUID.randomUUID();

    @Column(nullable = false)
    public UUID userId;

    @Column(nullable = false, length = 500)
    public String title;

    @Column(columnDefinition = "TEXT")
    public String description;

    @Column(nullable = false, length = 32)
    public String status = "PENDING";

    public Instant dueAt;
    @Column(nullable = false)
    public Instant createdAt = Instant.now();
}
