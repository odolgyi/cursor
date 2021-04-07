package homework3.task1.planeshape.shape2D;

import homework3.task1.interfaces.AreaMeasurable;
import homework3.task1.interfaces.PerimeterMeasurable;
import homework3.task1.planeshape.Vertex2D;
import homework3.task1.planeshape.PlaneShape;

public class Circle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {

    private final double radius;

    public Circle(Vertex2D vertex, double radius) {
        super(vertex);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
