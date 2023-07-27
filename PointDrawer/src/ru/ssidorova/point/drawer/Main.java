package ru.ssidorova.point.drawer;

public class Main {
    public static void main(String[] args) {
        final Point p1 = new Point(1, 2);
        final Point p2 = new Point();
        p1.draw();
        p2.draw();

        Point.drawPoints();
    }
}