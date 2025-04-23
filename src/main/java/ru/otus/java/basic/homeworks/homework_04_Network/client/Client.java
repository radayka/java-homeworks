package ru.otus.java.basic.homeworks.homework_04_Network.client;

import ru.otus.java.basic.homeworks.homework_04_Network.util.ExampleClient;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try (Socket socket = new Socket("localhost", 8091)) {
                ExampleClient exampleClient = new ExampleClient(socket.getInputStream(), socket.getOutputStream());
                String userInput = sc.nextLine();
                if (userInput.equalsIgnoreCase("exit")) {
                    exampleClient.send(userInput);
                    break;
                }
                exampleClient.send(userInput);
            }
        }
    }
}
