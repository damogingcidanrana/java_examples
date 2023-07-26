package ru.ssidorova.divisor;

import java.util.Scanner;

public class Main {
    public static int smallestCommonDivisor (int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        while (true) {
            int remainder = max % min;
            if (remainder == 0) {
                return min;
            }
            max = min;
            min = remainder;
        }
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