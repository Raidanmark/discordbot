package org.example.factories;

import org.example.dto.ChatBotSessionDto;
import org.example.store.entities.ChatBotSessionEntity;
import org.springframework.stereotype.Component;

@Component
public class ChatBotSessionFactory {
    public ChatBotSessionDto makeChatBotSessionDto(ChatBotSessionEntity entity) {
        return ChatBotSessionDto.builder()
                .id(entity.getId())
                .status(entity.getStatus())
                .channelId(entity.getChannelId())
                .build();
    }
}
