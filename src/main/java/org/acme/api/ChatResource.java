package org.acme.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.ai.ChatBot;

@Path("/chat")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class ChatResource {

    private final ChatBot chatBot;
    private final ChatMemory chatMemory;

    @Inject
    public ChatResource(ChatBot chatBot, ChatMemory chatMemory) {
        this.chatBot = chatBot;
        this.chatMemory = chatMemory;
    }

    @POST
    public String mesage(String question) {
        System.out.println("Chat ID: " + chatMemory.chatId() + ": " + question);
        return chatBot.chat(chatMemory.chatId(), question);
    }

}