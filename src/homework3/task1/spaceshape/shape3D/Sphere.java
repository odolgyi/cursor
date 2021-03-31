package homework3.task1.spaceshape.shape3D;

import homework3.task1.spaceshape.SpaceShape;
import homework3.task1.spaceshape.Vertex3D;

public class Sphere extends SpaceShape {
    private final Vertex3D vertex;
    private final double radius;

    public Sphere(Vertex3D vertex, double radius) {
        this.vertex = vertex;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "vertex =" + vertex.toString() + "; " +
                "radius  =" + radius + "; " +
                "volume =" + getVolume() + "; " +
                "area =" + getArea() + "; " +
                '}';
    }
}
