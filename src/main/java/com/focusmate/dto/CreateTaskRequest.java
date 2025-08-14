package com.focusmate.dto;

import java.util.Optional;

public class CreateTaskRequest {
    public String title;
    public String description;
    public boolean aiBreakdown = true;
    public Optional<String> dueAtIso = Optional.empty();
}
