package homework3.task1.spaceshape.shape3D;

import homework3.task1.spaceshape.SpaceShape;
import homework3.task1.spaceshape.Vertex3D;

public class SquarePyramid extends SpaceShape {
    private final double width, height;

    public SquarePyramid(Vertex3D vertex, double width, double height) {
        super(vertex);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * Math.sqrt(4 * Math.pow(height, 2) + Math.pow(width, 2)) + Math.pow(width, 2);
    }

    @Override
    public double getVolume() {
        return (Math.pow(width, 2) * height) / 3;
    }
}
