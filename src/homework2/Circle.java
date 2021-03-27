package homework2;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getRadius() {
        return radius;
    }
}