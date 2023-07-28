package ru.ssidorova.drawer;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape implements Colorful {
    static final String DEFAULT_COLOR = "black";
    static List<Shape> scene = new ArrayList<Shape>();
    String color;

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public Shape() {
        this(DEFAULT_COLOR);
    }

    public Shape(String color) {
        setColor(color);
        scene.add(this);
    }

    public abstract void draw();

    public static void drawScene() {
        System.out.println("Сцена:");
        for (Shape shape: scene) {
            shape.draw();
        }
    }

    public static void changeSceneColor(String color) {
        for (Shape s: scene) {
            if (s instanceof Colorful) {
                ((Colorful)s).setColor(color);
            }
        }
    }
}
