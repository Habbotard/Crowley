package net.hybridcore.crowley.habbo.messages.incoming.global;

import net.hybridcore.crowley.Crowley;
import net.hybridcore.crowley.habbo.game.GameSession;
import net.hybridcore.crowley.habbo.messages.ClientMessage;
import net.hybridcore.crowley.habbo.messages.IncomingMessage;
import net.hybridcore.crowley.habbo.messages.outgoing.global.CurrentTimeComposer;

/**
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <crowlie@hybridcore.net> wrote this file. As long as you retain this notice you
 * can do whatever you want with this stuff. If we meet some day, and you think
 * this stuff is worth it, you can buy me a beer in return Crowley.
 */
public class CurrentDateMessageEvent implements IncomingMessage {
    public void handle(GameSession gameSession, ClientMessage message) {
        Crowley.getExecutorService().execute(new CurrentTimeComposer(gameSession));
    }
}
