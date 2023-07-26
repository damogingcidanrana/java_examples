package ru.ssidorova.temperature.converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение температуры в градусах Цельсия");
        double input = scanner.nextDouble();

        double output = input * 9 / 5 + 32;

        System.out.printf("%.4f градусов Цельсия = %.4f градусов Фаренгейта", input, output);
    }
}
