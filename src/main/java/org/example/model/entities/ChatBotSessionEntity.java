package org.example.model.entities;

import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "chat_bot_session")
public class ChatBotSessionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    Long id;

    String status;

    @Column(unique = true)
    String channelId;


}
