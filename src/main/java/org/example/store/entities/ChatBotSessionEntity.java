package org.example.store.entities;

import jakarta.persistence.*;
import lombok.*;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;


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
