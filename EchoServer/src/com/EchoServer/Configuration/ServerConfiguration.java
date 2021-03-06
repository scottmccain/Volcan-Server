/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EchoServer.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MonkeyBreath
 */
public class ServerConfiguration {
    
    public static class Server {
        
        public static Security CreateSecurity() {
            return new Security();
        }

        private Security security;
        private int port;

        public int getPort() {
            return port;
        }

        public void setPort(int value) {
            port = value;
        }

        public Security getSecurity() {
            return security;
        }

        public void setSecurity(Security value) {
            security = value;
        }

        public static class Security {
            private Boolean useSSL;
            private String keystoreFile;
            private String keystorePassword;

            public Boolean getUseSSL() {
                return useSSL;
            }

            public void setUseSSL(Boolean value) {
                useSSL = value;
            }

            public String getKeyStoreFile() {
                return keystoreFile;
            }

            public void setKeyStoreFile(String value) {
                keystoreFile = value;
            }

            public String getKeyStorePassword() {
                return keystorePassword;
            }

            public void setKeyStorePassword(String value) {
                keystorePassword = value;
            }
        }
    }
    
    public static Server CreateServer() {
        return new Server();
    }
    
    private final List<Server> servers = new ArrayList<Server>();
    
    public void addServer(Server server) {
        servers.add(server);
    }
    
    public List<Server> getServers() {
        return servers;
    }

}
