package parth_three.ex_five.entities;

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
