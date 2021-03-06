package net.hybridcore.crowley.habbo.messages.incoming.friendlist;

import net.hybridcore.crowley.Crowley;
import net.hybridcore.crowley.habbo.game.GameSession;
import net.hybridcore.crowley.habbo.messages.ClientMessage;
import net.hybridcore.crowley.habbo.messages.IncomingMessage;
import net.hybridcore.crowley.habbo.messages.outgoing.friendlist.HabboSearchResultComposer;

/**
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <crowlie@hybridcore.net> wrote this file. As long as you retain this notice you
 * can do whatever you want with this stuff. If we meet some day, and you think
 * this stuff is worth it, you can buy me a beer in return Crowley.
 */
public class HabboSearchMessageEvent implements IncomingMessage {
    public void handle(GameSession gameSession, ClientMessage clientMessage) {
        Crowley.getExecutorService().execute(new HabboSearchResultComposer(gameSession, clientMessage));
    }
}
