package ru.ssidorova.shape.drawer;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    static final String DEFAULT_COLOR = "black";
    static List<Shape> scene = new ArrayList<Shape>();
    String color;

    public Shape() {
        this(DEFAULT_COLOR);
    }

    public Shape(String color) {
        this.color = color;
        scene.add(this);
    }

    public void draw() {
        System.out.printf("Фигура, цвет %s\n", this.color);
    }

    public static void drawScene() {
        System.out.println("Сцена:");
        for (Shape shape: scene) {
            shape.draw();
        }
    }
}
