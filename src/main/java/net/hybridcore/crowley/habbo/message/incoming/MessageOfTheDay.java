package net.hybridcore.crowley.habbo.message.incoming;

import net.hybridcore.crowley.Crowley;
import net.hybridcore.crowley.habbo.game.GameSession;
import net.hybridcore.crowley.habbo.message.ClientMessage;
import net.hybridcore.crowley.habbo.message.IncomingMessage;
import net.hybridcore.crowley.habbo.message.ServerMessage;

/**
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <crowlie@hybridcore.net> wrote this file. As long as you retain this notice you
 * can do whatever you want with this stuff. If we meet some day, and you think
 * this stuff is worth it, you can buy me a beer in return Crowley.
 */
public class MessageOfTheDay implements IncomingMessage {

    public void handle(GameSession gameSession, ClientMessage message) {
        gameSession.sendMessage(
                new ServerMessage(810)
                .append(true)
                .appendString(Crowley.getConfiguration().getString("net.hybridcore.crowley.habbo.message.incoming.MessageOfTheDay"))
        );
    }
}
