package ru.otus.java.basic.homeworks.hw_04_ConsoleNetworkChat.Server.src.main.java;

public class ServerApplication {
    public static void main(String[] args) {
        new Server(8189).start();
    }
}