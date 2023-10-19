package parth_three.ex_five.entities;

public class Triangle extends Shape {
    private final Double a;
    private final Double b;
    private final Double c;

    public Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public Double calculateArea() {
        // Heron's formula
        Double semiP =  calculateP() / 2.0;
        return Math.sqrt(semiP * (semiP - a) * (semiP - b) * (semiP - c));
    }

    @Override
    public Double calculateP() {
        return a + b + c;
    }
}
