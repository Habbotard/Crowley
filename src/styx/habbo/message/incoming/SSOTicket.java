package styx.habbo.message.incoming;

import styx.habbo.game.Session;
import styx.habbo.message.ClientMessage;
import styx.habbo.message.IncomingMessage;

/**
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <crowlie@hybridcore.net> wrote this file. As long as you retain this notice you
 * can do whatever you want with this stuff. If we meet some day, and you think
 * this stuff is worth it, you can buy me a beer in return Crowley.
 */
public class SSOTicket implements IncomingMessage {
    public void handle(Session session, ClientMessage message) {
        String ssoTicket = message.readString();
    }
}
