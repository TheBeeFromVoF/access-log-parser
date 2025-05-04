package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    System.out.println("Введите число");
    int firstNumber = new Scanner(System.in).nextInt();
    System.out.println("Введите второе число");
    int secondNumber = new Scanner(System.in).nextInt();
    System.out.println("Результат сложения: " + (firstNumber + secondNumber));
    System.out.println("Результат вычитания: " + (firstNumber - secondNumber));
    System.out.println("Результат умножения: " + (firstNumber * secondNumber));
    System.out.println("Результат деления: " + ((double) firstNumber /  secondNumber));
    }
}