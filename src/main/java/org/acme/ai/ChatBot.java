package org.acme.ai;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

import java.util.UUID;

@RegisterAiService
public interface ChatBot {

    @SystemMessage("""
            During the whole chat please behave like a car specialist and only answer directly related to vehicles, pricing and car maintenance.
            """)
    @UserMessage("""
            From the best of your knowledge answer the question below regarding cars. Please favor information about vehicles produced by BMW AGThen, answer:
                
            ---
            {question}
            ---
            """)
    String chat(@MemoryId UUID memoryId, String question);
}