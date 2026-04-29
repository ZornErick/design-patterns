package com.design_patterns.behavioral.state;

public abstract class TCPState {
    public void open(TCPConnection connection) {
        System.out.println("Operation 'open' not allowed in this state");
    }

    public void close(TCPConnection connection) {
        System.out.println("Operation 'close' not allowed in this state");
    }

    public void acknowledge(TCPConnection connection) {
        System.out.println("Operation 'acknowledge' not allowed in this state");
    }

    protected void changeState(TCPConnection connection, TCPState state) {
        connection.changeState(state);
    }
}
