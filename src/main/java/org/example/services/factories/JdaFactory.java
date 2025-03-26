package org.example.services.factories;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.example.model.listeners.BotListener;

public class JdaFactory {
    public static JDA createJDA(String token, BotListener listener) {
        try {
            return JDABuilder.createDefault(token)
                    .enableIntents(GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT)
                    .addEventListeners(listener)
                    .build();
        } catch (Exception e) {
            throw new RuntimeException("Error creating JDA", e);
        }
    }
}
