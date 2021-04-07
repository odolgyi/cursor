package homework3.task1.planeshape.shape2D;

import homework3.task1.interfaces.AreaMeasurable;
import homework3.task1.interfaces.PerimeterMeasurable;
import homework3.task1.planeshape.PlaneShape;
import homework3.task1.planeshape.Vertex2D;

public class Triangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private final double lengthA, lengthB, lengthC;

    public Triangle(Vertex2D firstVertex, Vertex2D secondVertex, Vertex2D thirdVertex) {
        super(firstVertex, secondVertex, thirdVertex);
        lengthA = getArrayVertices().get(0).getDistance(getArrayVertices().get(1));
        lengthB = getArrayVertices().get(1).getDistance(getArrayVertices().get(2));
        lengthC = getArrayVertices().get(2).getDistance(getArrayVertices().get(0));
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
}