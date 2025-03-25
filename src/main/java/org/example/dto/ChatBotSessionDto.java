package org.example.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatBotSessionDto {
    @NonNull
    Long id;

    @NonNull
    String channelId;

    String status;

}
