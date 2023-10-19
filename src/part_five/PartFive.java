package part_five;

import part_five.entities.Circle;
import part_five.entities.Rectangle;
import part_five.entities.Triangle;

public class PartFive {
    public static void run() {
        Circle circle = new Circle(1.0);
        System.out.println(circle.calculateP());
        System.out.println(circle.calculateArea());
        System.out.println();

        Rectangle rectangle = new Rectangle(1.0, 2.0);
        System.out.println(rectangle.calculateP());
        System.out.println(rectangle.calculateArea());
        System.out.println();

        Triangle triangle = new Triangle(1.0, 2.0, 2.5);
        System.out.println(triangle.calculateP());
        System.out.println(triangle.calculateArea());
    }
}
