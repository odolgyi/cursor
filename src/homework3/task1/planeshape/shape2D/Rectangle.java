package homework3.task1.planeshape.shape2D;

import homework3.task1.interfaces.AreaMeasurable;
import homework3.task1.interfaces.PerimeterMeasurable;
import homework3.task1.planeshape.Vertex2D;
import homework3.task1.planeshape.PlaneShape;

public class Rectangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private final double width, height;

    public Rectangle(Vertex2D vertex, double width, double height) {
        super(vertex);
        this.width = width;
        this.height = height;

    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
