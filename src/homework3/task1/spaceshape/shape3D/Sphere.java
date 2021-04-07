package homework3.task1.spaceshape.shape3D;

import homework3.task1.spaceshape.SpaceShape;
import homework3.task1.spaceshape.Vertex3D;

public class Sphere extends SpaceShape {
    private final double radius;

    public Sphere(Vertex3D vertex, double radius) {
        super(vertex);
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
}
