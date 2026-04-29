package com.design_patterns.behavioral.state;

public class TCPClosed extends TCPState {
    @Override
    public void open(TCPConnection connection) {
        System.out.println("Opening connection");
        changeState(connection, new TCPListen());
    }
}
