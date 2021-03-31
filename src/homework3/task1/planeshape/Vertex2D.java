package homework3.task1.planeshape;

public class Vertex2D {
   private double x;
   private double y;

    public Vertex2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance(Vertex2D b) {
        return Math.sqrt(Math.pow(this.getX() - b.getX(), 2) + Math.pow(this.getY() - b.getY(), 2));
    }

    @Override
    public String toString() {
        return "Vertices{" + "x=" + x + ", y=" + y + '}';
    }
}
