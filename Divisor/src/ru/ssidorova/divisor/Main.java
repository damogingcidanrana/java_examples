package ru.ssidorova.divisor;

import java.util.Scanner;

public class Main {
    static int smallestCommonDivisor (int a, int b) {
        int remainder;

        while ((remainder = a % b) != 0) {
            a = b;
            b = remainder;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int a = scanner.nextInt();

        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        System.out.printf("Наименьший общий делитель чисел %d и %d равен %d", a, b, smallestCommonDivisor(a, b));
    }
}