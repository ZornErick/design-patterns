package com.design_patterns.behavioral.state;

public class TCPListen extends TCPState {
    @Override
    public void acknowledge(TCPConnection connection) {
        System.out.println("Connection acknowledged");
        changeState(connection, new TCPEstablished());
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("Closing while listening");
        changeState(connection, new TCPClosed());
    }
}
