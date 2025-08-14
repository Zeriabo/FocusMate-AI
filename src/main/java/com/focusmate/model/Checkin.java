package com.focusmate.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "checkin")
public class Checkin extends PanacheEntityBase {
    @Id
    public UUID id = UUID.randomUUID();

    @Column(nullable = false)
    public UUID userId;

    public Integer mood;
    public Integer energy;
    public Integer focus;

    @Column(nullable = false)
    public Instant createdAt = Instant.now();
}
