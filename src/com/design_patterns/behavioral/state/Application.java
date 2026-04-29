package com.design_patterns.behavioral.state;

public class Application {
    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();

        connection.acknowledge();
        connection.open();
        connection.acknowledge();
        connection.close();
    }
}
