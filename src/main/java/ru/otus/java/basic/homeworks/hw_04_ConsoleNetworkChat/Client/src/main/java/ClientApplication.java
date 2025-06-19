package ru.otus.java.basic.homeworks.hw_04_ConsoleNetworkChat.Client.src.main.java;

import java.io.IOException;

public class ClientApplication {
    public static void main(String[] args) {
        try {
            new Client();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}