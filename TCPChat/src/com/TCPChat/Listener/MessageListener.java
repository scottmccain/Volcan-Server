/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TCPChat.Listener;

import com.TCPChat.Event.MessageEvent;
import java.util.EventListener;

/**
 *
 * @author MonkeyBreath
 */
public abstract interface MessageListener extends EventListener {
    public void MessageReceived(MessageEvent evt);
}
