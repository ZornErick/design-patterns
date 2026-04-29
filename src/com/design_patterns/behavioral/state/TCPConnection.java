package com.design_patterns.behavioral.state;

public class TCPConnection {
    private TCPState state;

    public TCPConnection() {
        this.state = new TCPClosed();
    }

    public void open() {
        state.open(this);
    }

    public void close() {
        state.close(this);
    }

    public void acknowledge() {
        state.acknowledge(this);
    }

    void changeState(TCPState state) {
        this.state = state;
        System.out.println("State changed to " + state.getClass().getSimpleName());
    }
}
