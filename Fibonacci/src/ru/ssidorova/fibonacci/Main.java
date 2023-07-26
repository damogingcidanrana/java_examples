package ru.ssidorova.fibonacci;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i < 1000) {
            System.out.println(i);
            final int c = j;
            j = i + j;
            i = c;
        }
    }
}
