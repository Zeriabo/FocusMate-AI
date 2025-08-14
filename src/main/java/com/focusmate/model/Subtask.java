package com.focusmate.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "subtask")
public class Subtask extends PanacheEntityBase {
    @Id
    public UUID id = UUID.randomUUID();

    @Column(nullable = false)
    public UUID taskId;

    @Column(nullable = false, length = 500)
    public String title;

    @Column(nullable = false)
    public boolean done = false;
}
