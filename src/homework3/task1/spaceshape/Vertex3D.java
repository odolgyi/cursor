package homework3.task1.spaceshape;

import homework3.task1.planeshape.Vertex2D;

public class Vertex3D extends Vertex2D {
    private double z;

    public Vertex3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Vertex3D{" + super.getX() + ";" + super.getY() + ";" + z + '}';
    }
}
