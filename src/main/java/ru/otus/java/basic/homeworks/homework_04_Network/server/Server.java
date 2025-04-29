package ru.otus.java.basic.homeworks.homework_04_Network.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 8091;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен. Ожидание клиента...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Клиент подключился!");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream())
            );
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            int a = Integer.parseInt(in.readLine());
            int b = Integer.parseInt(in.readLine());
            String operation = in.readLine();

            int result = 0;
            boolean validOperation = true;

            switch (operation) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b != 0) {
                        result = a / b;
                    } else {
                        out.println("Ошибка: деление на ноль!");
                        validOperation = false;
                    }
                    break;
                default:
                    out.println("Ошибка: неверная операция!");
                    validOperation = false;
                    break;
            }

            if (validOperation) {
                out.println("Результат: " + result);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
