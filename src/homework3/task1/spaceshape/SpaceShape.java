package homework3.task1.spaceshape;

import homework3.task1.interfaces.AreaMeasurable;
import homework3.task1.Shape;
import homework3.task1.interfaces.VolumeMeasurable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    private final List<Vertex3D> listVertices= new ArrayList<>();

    public SpaceShape(Vertex3D... arrayVertices) {
        listVertices.addAll(Arrays.asList(arrayVertices));
    }

    public List<Vertex3D> getArrayVertices() {
        return listVertices;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() +" vertex= "+ getArrayVertices() +"; volume= "+ getVolume()
                + "; area= " + getArea();
    }
}
