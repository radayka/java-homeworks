package ru.otus.java.basic.homeworks.homework_04_Network.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 8091;

        try (Socket socket = new Socket(host, port);
             BufferedReader in = new BufferedReader(
                     new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader console = new BufferedReader(
                     new InputStreamReader(System.in))) {

            System.out.println("Введите первое число:");
            int a = Integer.parseInt(console.readLine());

            System.out.println("Введите второе число:");
            int b = Integer.parseInt(console.readLine());

            System.out.println("Введите операцию ('/', '*', '+', '-'):");
            String operation = console.readLine();

            out.println(a);
            out.println(b);
            out.println(operation);

            String response = in.readLine();
            System.out.println("Ответ сервера: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
