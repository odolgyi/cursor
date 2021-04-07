package homework3.task1.planeshape;

import homework3.task1.interfaces.AreaMeasurable;
import homework3.task1.interfaces.PerimeterMeasurable;
import homework3.task1.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {
    private final List<Vertex2D> listVertices= new ArrayList<>();

    public PlaneShape(Vertex2D... arrayVertices) {
        listVertices.addAll(Arrays.asList(arrayVertices));
    }

    public List<Vertex2D> getArrayVertices() {
        return listVertices;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() +" vertex= "+ getArrayVertices().toString() +"; perimeter= "+ getPerimeter()
                + "; area= " + getArea();
    }
}
