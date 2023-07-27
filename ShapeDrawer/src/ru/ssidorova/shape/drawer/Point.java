package ru.ssidorova.shape.drawer;

public class Point extends Shape {
    public int x;
    public int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this(x, y, DEFAULT_COLOR);
    }

    public Point(int x, int y, String color) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.printf("Точка c координатами %d %d, цвет %s\n", this.x, this.y, this.color);
    }

    public void moveBy(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
