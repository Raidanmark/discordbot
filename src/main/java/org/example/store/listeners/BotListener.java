package org.example.store.listeners;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class BotListener extends ListenerAdapter {

    @Override

    public void onMessageReceived(MessageReceivedEvent event) {
        if (shouldIgnore(event)) {
            return;
        }

        String chatId = event.getChannel().getId();
        String message = event.getMessage().getContentRaw();

    }


    private boolean shouldIgnore(MessageReceivedEvent event) {

        return event.getAuthor().isBot();
    }
}
