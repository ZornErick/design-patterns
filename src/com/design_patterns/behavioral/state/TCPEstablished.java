package com.design_patterns.behavioral.state;

public class TCPEstablished extends TCPState {
    @Override
    public void close(TCPConnection connection) {
        System.out.println("Closing established connection");
        changeState(connection, new TCPClosed());
    }
}
