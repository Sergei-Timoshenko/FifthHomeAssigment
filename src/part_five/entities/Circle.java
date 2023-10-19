package part_five.entities;

import part_four.entities.Media;

public class Circle extends Shape {
    private final Double r;

    public Circle(Double r) {
        this.r = r;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    public Double calculateP() {
        return 2 * Math.PI * r;
    }
}
