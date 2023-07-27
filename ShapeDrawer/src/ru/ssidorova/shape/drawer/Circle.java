package ru.ssidorova.shape.drawer;

public class Circle extends Shape {
    public int x;
    public int y;
    public int r;

    public Circle() {
        this(0, 0, 1);
    }

    public Circle(int x, int y) {
        this(x, y, 1);
    }

    public Circle(int x, int y, int r) {
        this(x, y, r, DEFAULT_COLOR);
    }

    public Circle(int x, int y, int r, String color) {
        super(color);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.printf("Круг с координатами центра %d %d, радиусом %d, цвет %s\n", this.x, this.y, this.r, this.color);
    }

    public void scale(double scale) {
        this.r = (int)(this.r * scale);
    }
}
