package ru.otus.java.basic.homeworks.homework_04_JavaIO;

import java.io.File;
import java.util.*;

import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File projectRoot = new File(".");
        List<File> textFiles = getTextFiles(projectRoot.getPath());
        if (textFiles.isEmpty()) {
            System.out.println("Текстовые файлы не найдены. Завершение программы.");
            return;
        }
        printAllFileByPath(textFiles);
        File selectedFile = chooseTheFile(projectRoot);
        fillingTheFile(selectedFile);
    }

    public static File chooseTheFile(File projectRoot) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла, с которым хотите работать: ");
        String filename = scanner.nextLine();
        File selectedFile = new File(projectRoot, filename);

        if (!selectedFile.exists()) {
            System.out.println("Файл не найден. Будет создан новый файл: " + filename);
        } else {
            System.out.println("\nСодержимое файла:");
            printFileContent(selectedFile);
        }

        return selectedFile;
    }

    public static void fillingTheFile(File selectedFile) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите строки для записи в файл (для выхода введите `exit`):");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile, true))) {
            while (true) {
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) {
                    break;
                }
                writer.write(input);
                writer.newLine();
                writer.flush();
            }
            System.out.println("Запись завершена.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public static void printAllFileByPath(List<File> textFiles) {
        if (textFiles.isEmpty()) {
            System.out.println("Текстовые файлы не найдены.");
            return;
        }
        System.out.println("Список доступных текстовых файлов:");
        for (File file : textFiles) {
            System.out.println("- " + file.getName());
        }
    }

    public static List<File> getTextFiles(String directoryPath) {
        File dir = new File(directoryPath);
        File[] files = dir.listFiles((dir1, name) -> name.endsWith(".txt"));

        if (files != null) {
            return Arrays.asList(files);
        }
        return Collections.emptyList();
    }

    public static void printFileContent(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean empty = true;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                empty = false;
            }
            if (empty) {
                System.out.println("[Файл пуст]");
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}