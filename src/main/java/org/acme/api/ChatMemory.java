package org.acme.api;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@ApplicationScoped
public class ChatMemory {

    private final UUID chatId = UUID.randomUUID();

    /**
     * We have the memory of a single chat
     *
     * @return The chat ID
     */
    public UUID chatId() {
        return chatId;
    }
}
