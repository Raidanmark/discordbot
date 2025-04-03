package org.example;

import net.dv8tion.jda.api.JDA;
import org.example.services.listeners.BotListener;
import org.example.services.factories.JdaFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication
                .run(Application.class, args);
    }

    Config config = new Config();
    BotListener botListener = new BotListener();
    JDA jda = JdaFactory.createJDA(config.getDiscordToken(), botListener);
}
