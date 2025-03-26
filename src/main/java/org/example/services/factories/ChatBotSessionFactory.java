package org.example.services.factories;

import org.example.services.dto.ChatBotSessionDto;
import org.example.model.entities.ChatBotSessionEntity;
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
