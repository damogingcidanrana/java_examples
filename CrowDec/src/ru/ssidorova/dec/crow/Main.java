package ru.ssidorova.dec.crow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String[] crowsDecList = { "ворона", "вороны", "ворон" };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько ворон на ветке?");
        final int input = scanner.nextInt();
        final int inputHundred = input % 100;
        final int inputTen = input % 10;
        final boolean isExceptNumbers = inputHundred > 10 && inputHundred < 15;

        String crowsDec = switch (isExceptNumbers ? inputHundred : inputTen) {
            case 1 -> crowsDecList[0];
            case 2, 3, 4 -> crowsDecList[1];
            default -> crowsDecList[2];
        };

        System.out.printf("На ветке %d %s", input, crowsDec);
    }
}