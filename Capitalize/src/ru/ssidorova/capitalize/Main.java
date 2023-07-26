package ru.ssidorova.capitalize;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова через пробел");
        final String input = scanner.nextLine();

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();


        for (String w: words) {
            if (w.length() > 0) {
                result.append(w.substring(0,1).toUpperCase()).append(w, 1, w.length()).append(" ");
            }
        }

        System.out.println(result);
    }
}