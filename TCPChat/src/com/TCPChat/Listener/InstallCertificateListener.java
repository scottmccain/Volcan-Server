/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TCPChat.Listener;

import com.TCPChat.Event.InstallCertificateEvent;
import java.util.EventListener;

/**
 *
 * @author MonkeyBreath
 */
public abstract interface InstallCertificateListener extends EventListener {
    void InstallCertificate(InstallCertificateEvent evt);
}
