package com.focusmate.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "app_user")
public class User extends PanacheEntityBase {
    @Id
    public UUID id = UUID.randomUUID();

    @Column(unique = true, nullable = false)
    public String email;

    public String displayName;

    @Column(nullable = false)
    public Instant createdAt = Instant.now();
}
