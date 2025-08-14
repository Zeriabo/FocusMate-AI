package com.focusmate.client.dto;

import java.util.List;
import java.util.Map;

public class ChatRequest {
    public String model = "gpt-4o-mini";
    public List<Map<String, String>> messages;
    public double temperature = 0.3;
}
