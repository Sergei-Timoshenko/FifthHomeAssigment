package parth_three.ex_five.entities;

public class Rectangle extends Shape {
    private final Double w;
    private final Double h;

    public Rectangle(Double w, Double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public Double calculateArea() {
        return w * h;
    }

    @Override
    public Double calculateP() {
        return 2 * w + 2 * h;
    }
}
