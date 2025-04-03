package org.example.services.listeners;

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

        if (isCommand(message)) {

            //Call REST request (String chatId, String source [this will be from client], String message)
        }



    }


    private boolean shouldIgnore(MessageReceivedEvent event) {
        return event.getAuthor().isBot();
    }

    private boolean isCommand(String commandText) {

        return commandText.startsWith("!");
    }


}
