package ru.ssidorova.point.drawer;

import java.util.ArrayList;

public class Point {
    public int x;
    public int y;

    static ArrayList<Point> points = new ArrayList<Point>();

    public Point() {
        this(0, 0);
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        points.add(this);
    }

    public void draw() {
        System.out.printf("Точка с координатами %d %d\n", this.x, this.y);
    }

    public static void drawPoints () {
        System.out.println("Все точки:");
        for (Point point: points) {
            point.draw();
        }
    }
}
