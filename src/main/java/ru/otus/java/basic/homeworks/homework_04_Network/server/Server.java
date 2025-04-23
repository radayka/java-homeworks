package ru.otus.java.basic.homeworks.homework_04_Network.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8091);
        while (true) {
            Socket client = socket.accept();
            DataInputStream inputStream = new DataInputStream(client.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
            String message = inputStream.readUTF();
            if (message.equalsIgnoreCase("exit")) {
                client.close();
                break;
            }
        }
    }
}