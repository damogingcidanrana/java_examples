package ru.ssidorova.sorting.names;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String input;
        final Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<String>();

        do {
            System.out.println("Введите имя");
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                names.add(input);
            }
        } while (!input.isEmpty());

        Collections.sort(names);

        for (String p: names) {
            System.out.println(p);
        }
    }
}