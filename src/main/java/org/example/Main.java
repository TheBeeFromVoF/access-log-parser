package org.example;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 1;

        while (true) {
            System.out.print("Введите путь к файлу : ");
            String path = new Scanner(System.in).nextLine();

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (fileExists && isDirectory) {
                count++;
                System.out.println("Путь указан верно. Это файл номер " + count);
                continue;
            }
            else {
                System.out.println("Файл не существует или указан путь к папке, а не к файлу.");

            }
        }
    }
}