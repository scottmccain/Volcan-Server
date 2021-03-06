/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TCPChat.View;

import com.TCPChat.Controller.TCPChatController;
import com.TCPChat.Model.StatusEnum;
import com.TCPChat.Model.TCPChatModel;
import com.mvc.view.AbstractViewPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;

/**
 *
 * @author MonkeyBreath
 */
public class TCPChatView extends AbstractViewPanel {

    private final TCPChatModel model;
    
    /**
     * Creates new form TCPChatView
     */
    public TCPChatView(TCPChatModel model) {
        this.model = model;
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        statusBar = new javax.swing.JPanel();
        statusColor = new javax.swing.JTextField(1);
        statusField = new javax.swing.JLabel();
        optionsPane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ipField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        portField = new javax.swing.JTextField();
        btnConnect = new javax.swing.JButton();
        btnDisconnect = new javax.swing.JButton();
        chatPane = new javax.swing.JPanel();
        chatLine = new javax.swing.JTextField();
        chatTextPane = new javax.swing.JScrollPane();
        chatText = new javax.swing.JTextArea();

        setLayout(new java.awt.BorderLayout());

        statusBar.setPreferredSize(new java.awt.Dimension(561, 20));
        statusBar.setLayout(new java.awt.BorderLayout());

        statusColor.setBackground(new java.awt.Color(204, 0, 51));
        statusColor.setEditable(false);
        statusColor.setPreferredSize(new java.awt.Dimension(9, 20));
        statusBar.add(statusColor, java.awt.BorderLayout.WEST);

        statusField.setText("Disconnected");
        statusField.setPreferredSize(new java.awt.Dimension(64, 24));
        statusBar.add(statusField, java.awt.BorderLayout.EAST);

        add(statusBar, java.awt.BorderLayout.SOUTH);

        optionsPane.setPreferredSize(new java.awt.Dimension(375, 200));
        java.awt.GridBagLayout optionsPaneLayout = new java.awt.GridBagLayout();
        optionsPaneLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        optionsPaneLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        optionsPane.setLayout(optionsPaneLayout);

        jLabel3.setText("Host Address:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        optionsPane.add(jLabel3, gridBagConstraints);

        ipField.setPreferredSize(new java.awt.Dimension(130, 20));
        ipField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipFieldActionPerformed(evt);
            }
        });
        ipField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ipFieldFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        optionsPane.add(ipField, gridBagConstraints);

        jLabel2.setText("Port:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        optionsPane.add(jLabel2, gridBagConstraints);

        portField.setPreferredSize(new java.awt.Dimension(130, 20));
        portField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portFieldActionPerformed(evt);
            }
        });
        portField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                portFieldFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        optionsPane.add(portField, gridBagConstraints);

        btnConnect.setText("Connect");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        optionsPane.add(btnConnect, gridBagConstraints);

        btnDisconnect.setText("Disconnect");
        btnDisconnect.setEnabled(false);
        btnDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisconnectActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 8;
        optionsPane.add(btnDisconnect, gridBagConstraints);

        add(optionsPane, java.awt.BorderLayout.WEST);

        chatPane.setPreferredSize(new java.awt.Dimension(200, 200));
        chatPane.setLayout(new java.awt.BorderLayout());

        chatLine.setEnabled(false);
        chatLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatLineActionPerformed(evt);
            }
        });
        chatPane.add(chatLine, java.awt.BorderLayout.SOUTH);

        chatText.setColumns(10);
        chatText.setEditable(false);
        chatText.setRows(20);
        chatText.setPreferredSize(new java.awt.Dimension(84, 275));
        chatTextPane.setViewportView(chatText);

        chatPane.add(chatTextPane, java.awt.BorderLayout.CENTER);

        add(chatPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        // TODO add your handling code here:
        
        ActionEvent bubbleEvent = new ActionEvent(evt.getSource(), 0, TCPChatController.ELEMENT_CONNECT_ACTION);
        this.fireAction(bubbleEvent);
    }//GEN-LAST:event_btnConnectActionPerformed

    private void btnDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisconnectActionPerformed
        ActionEvent bubbleEvent = new ActionEvent(evt.getSource(), 0, TCPChatController.ELEMENT_DISCONNECT_ACTION);
        this.fireAction(bubbleEvent);
    }//GEN-LAST:event_btnDisconnectActionPerformed

    private void chatLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatLineActionPerformed
        model.setChatEntry(chatLine.getText());

        ActionEvent bubbleEvent = new ActionEvent(evt.getSource(), 0, TCPChatController.ELEMENT_SEND_ACTION);
        this.fireAction(bubbleEvent);
    }//GEN-LAST:event_chatLineActionPerformed

    private void ipFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipFieldActionPerformed
        model.setHost(ipField.getText());
    }//GEN-LAST:event_ipFieldActionPerformed

    private void portFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portFieldActionPerformed
        // TODO add your handling code here:
        int port;
        
        try {
            port = Integer.parseInt(portField.getText());
            model.setPort(port);
        } catch(NumberFormatException ex) {
            
        }
            
    }//GEN-LAST:event_portFieldActionPerformed

    private void portFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_portFieldFocusLost
        // TODO add your handling code here:
        int port;
        
        try {
            port = Integer.parseInt(portField.getText());
            model.setPort(port);
        } catch(NumberFormatException ex) {
            
        }        
    }//GEN-LAST:event_portFieldFocusLost

    private void ipFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ipFieldFocusLost
        // TODO add your handling code here:
        model.setHost(ipField.getText());
    }//GEN-LAST:event_ipFieldFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConnect;
    private javax.swing.JButton btnDisconnect;
    private javax.swing.JTextField chatLine;
    private javax.swing.JPanel chatPane;
    private javax.swing.JTextArea chatText;
    private javax.swing.JScrollPane chatTextPane;
    private javax.swing.JTextField ipField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel optionsPane;
    private javax.swing.JTextField portField;
    private javax.swing.JPanel statusBar;
    private javax.swing.JTextField statusColor;
    private javax.swing.JLabel statusField;
    // End of variables declaration//GEN-END:variables

    private String lastError;

    @Override
    public void modelPropertyChange(PropertyChangeEvent pce) {
        if( pce.getPropertyName().equals(TCPChatController.ELEMENT_STATUS_PROPERTY )) {
            StatusEnum value = (StatusEnum) pce.getNewValue();
            UpdateStatus(value);
        } else if( pce.getPropertyName().equals(TCPChatController.ELEMENT_HOST_PROPERTY )) {
            ipField.setText((String) pce.getNewValue());
        } else if( pce.getPropertyName().equals(TCPChatController.ELEMENT_PORT_PROPERTY )) {
            portField.setText(pce.getNewValue().toString());
        } else if( pce.getPropertyName().equals(TCPChatController.ELEMENT_CHAT_ENTRY_PROPERTY )) {
            chatLine.setText(pce.getNewValue().toString());
        } else if( pce.getPropertyName().equals(TCPChatController.ELEMENT_INCOMMING_MESSAGE_PROPERTY )) {
            
            // add line to output window
            String output = (String) pce.getNewValue();
            if( !output.equals("") ) {
                chatText.append(output);
            }
        } else if( pce.getPropertyName().equals(TCPChatController.ELEMENT_LAST_ERROR_PROPERTY )) {
            lastError = (String) pce.getNewValue();
        }
    }

    private void UpdateStatus(StatusEnum value) {
        
        switch(value) {
            
            case Handshaking:
                btnConnect.setEnabled(false);
                btnDisconnect.setEnabled(false);
                
                ipField.setEnabled(false);
                portField.setEnabled(false);
                
                chatLine.setEnabled(false);
                statusColor.setBackground(Color.orange);                
                statusField.setText("Handshaking...");                
                break;
                
            case Error:
                btnConnect.setEnabled(true);
                btnDisconnect.setEnabled(false);
                
                ipField.setEnabled(true);
                portField.setEnabled(true);
         
                chatLine.setText(""); chatLine.setEnabled(false);
                statusColor.setBackground(Color.red);
                statusField.setText("Error - " + lastError);
                
                break;
                
            case Connected:
                btnConnect.setEnabled(false);
                btnDisconnect.setEnabled(true);
                
                ipField.setEnabled(false);
                portField.setEnabled(false);
                
                chatLine.setEnabled(true);
                chatLine.grabFocus();
                statusColor.setBackground(Color.green);                
                statusField.setText("Connected");
                break;
                
            case Connecting:
                btnConnect.setEnabled(false);
                btnDisconnect.setEnabled(false);

                ipField.setEnabled(false);
                portField.setEnabled(false);
                
                chatLine.setEnabled(false);
                statusColor.setBackground(Color.orange);                
                statusField.setText("Connecting");
                break;
                
            case Disconnected:
                btnConnect.setEnabled(true);
                btnDisconnect.setEnabled(false);
                
                ipField.setEnabled(true);
                portField.setEnabled(true);
         
                chatLine.setText(""); chatLine.setEnabled(false);
                statusColor.setBackground(Color.red);
                statusField.setText("Disconnected");
                break;
                
            case Disconnecting:
                btnConnect.setEnabled(false);
                btnDisconnect.setEnabled(false);
                
                ipField.setEnabled(false);
                portField.setEnabled(false);
                
                chatLine.setEnabled(false);
                statusColor.setBackground(Color.orange);    
                statusField.setText("Disconnecting");
                break;
        }
        
        statusField.setToolTipText(statusField.getText());
        repaint();
    }
}
