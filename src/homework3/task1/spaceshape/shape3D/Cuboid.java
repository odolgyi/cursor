package homework3.task1.spaceshape.shape3D;

import homework3.task1.spaceshape.SpaceShape;
import homework3.task1.spaceshape.Vertex3D;

public class Cuboid extends SpaceShape {
    private final Vertex3D vertex;
    private final double width, height, depth;

    public Cuboid(Vertex3D a, double width, double height, double depth) {
        vertex = a;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * (width * height) + 2 * (width * depth) + 2 * (height * depth);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "vertex =" + vertex.toString() + "; " +
                "width  =" + width + "; " +
                "height =" + height + "; " +
                "depth =" + depth + "; " +
                "volume =" + getVolume() + "; " +
                "area =" + getArea() + "; " +
                '}';
    }
}
