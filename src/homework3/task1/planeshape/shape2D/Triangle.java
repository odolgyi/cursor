package homework3.task1.planeshape.shape2D;

import homework3.task1.interfaces.AreaMeasurable;
import homework3.task1.interfaces.PerimeterMeasurable;
import homework3.task1.planeshape.Vertex2D;
import homework3.task1.planeshape.PlaneShape;

public class Triangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private final Vertex2D[] arrayVertices;
    private final double lengthA, lengthB, lengthC;

    public Triangle(Vertex2D[] arrayVertices) {
        if (arrayVertices.length == 3) {
            this.arrayVertices = arrayVertices;
            lengthA = arrayVertices[0].getDistance(arrayVertices[1]);
            lengthB = arrayVertices[1].getDistance(arrayVertices[2]);
            lengthC = arrayVertices[2].getDistance(arrayVertices[0]);
        } else {
            throw new RuntimeException("Triangle has only 3 vertices");
        }
    }

    @Override
    public double getArea() {
        return Math.sqrt(getPerimeter() / 2 * (getPerimeter() / 2 - lengthA) * (getPerimeter() / 2 - lengthB)
                * (getPerimeter() / 2 - lengthC));
    }

    @Override
    public double getPerimeter() {
        return lengthA + lengthB + lengthC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "coordinate A =" + arrayVertices[0].toString() + "; " +
                "coordinate B =" + arrayVertices[1].toString() + "; " +
                "coordinate C =" + arrayVertices[2].toString() + "; " +
                "perimeter =" + getPerimeter() + "; " +
                "area =" + getArea() + "; " +
                '}';
    }
}