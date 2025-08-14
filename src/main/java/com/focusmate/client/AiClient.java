package com.focusmate.client;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import com.focusmate.client.dto.ChatRequest;
import com.focusmate.client.dto.ChatResponse;

@RegisterRestClient(configKey = "ai-provider")
@RegisterClientHeaders(AiClientHeaders.class)
@Path("/chat/completions")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface AiClient {
    @POST
    Uni<ChatResponse> chat(ChatRequest request);
}
