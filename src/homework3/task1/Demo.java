package homework3.task1;


import homework3.task1.planeshape.Vertex2D;
import homework3.task1.planeshape.shape2D.Circle;
import homework3.task1.planeshape.shape2D.Rectangle;
import homework3.task1.planeshape.shape2D.Triangle;
import homework3.task1.spaceshape.Vertex3D;
import homework3.task1.spaceshape.shape3D.Cuboid;
import homework3.task1.spaceshape.shape3D.Sphere;
import homework3.task1.spaceshape.shape3D.SquarePyramid;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new Vertex2D(2, 3), new Vertex2D(6, 3), new Vertex2D(6, -5));
        Shape circle = new Circle(new Vertex2D(2, 3), 6);
        Shape rectangle = new Rectangle(new Vertex2D(2, 3), 6, 4);
        Shape sphere = new Sphere(new Vertex3D(2, 3, 1), 6);
        Shape cuboid = new Cuboid(new Vertex3D(2, 3, 1), 6, 4, 5);
        Shape squarePyramid = new SquarePyramid(new Vertex3D(2, 3, 1), 6, 4);

        Shape[] shapes = {triangle, circle, rectangle, sphere, cuboid, squarePyramid};
        Arrays.stream(shapes).forEach(System.out::println);
    }
}