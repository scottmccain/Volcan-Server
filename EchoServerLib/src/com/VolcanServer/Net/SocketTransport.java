/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VolcanServer.Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

/**
 *
 * @author Monkeybone
 */
public class SocketTransport implements NetworkTransport {
    
    private Socket socket = null;
    public SocketTransport(Socket socket) {
        this.socket = socket;
    }

    public SocketTransport() {
    }

    @Override
    public SocketAddress getSocketAddress() {
        return socket.getRemoteSocketAddress();
    }

    @Override
    public boolean getIsConnected() {
        return socket != null && socket.isConnected();
    }

    @Override
    public InputStream getInStream() throws IOException {
        return socket.getInputStream();
    }

    @Override
    public OutputStream getOutStream() throws IOException {
        return socket.getOutputStream();
    }

    @Override
    public int getReceiveTimeout() throws SocketException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setReceiveTimeout(int value) throws SocketException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setSendTimeout(int value) throws SocketException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getSendTimeout() throws SocketException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void open(InetAddress address, int port) throws IOException {
        if( !getIsConnected() ) {
            socket = new Socket(address, port);
        }
    }

    @Override
    public void open(String address, int port) throws UnknownHostException, IOException {
        if( !getIsConnected() ) {
            socket = new Socket(address, port);
        }
    }

    @Override
    public void close(boolean force) throws IOException {
        if( getIsConnected() )
            socket.close();
    }
}
