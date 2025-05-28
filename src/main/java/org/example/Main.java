package org.example;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите путь к файлу : ");
            String path = scanner.nextLine();

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists || isDirectory) {
                System.out.println("Файл не существует или указан путь к папке, а не к файлу.");
                continue;
            }
            if (fileExists) {
                count++;
                System.out.println("Путь указан верно. Это файл номер " + count);

            }

        }
    }
}