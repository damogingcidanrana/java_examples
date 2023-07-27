package ru.ssidorova.shape.drawer;

public class Main {
    public static void main(String[] args) {
        final Point p1 = new Point();
        p1.draw();
        p1.moveBy(10, 10);
        p1.draw();

        new Point(1,1, "green");
        new Point(2,2);

        final Circle c1 = new Circle(2,2,10, "red");
        c1.draw();
        c1.scale(1.2);
        c1.draw();

        new Circle(3,3,5);
        new Circle(4,4);
        new Circle();

        final Shape s1 = new Shape();
        s1.draw();

        final Shape s2 = new Shape("grey");
        s2.draw();

        Shape.drawScene();
    }
}