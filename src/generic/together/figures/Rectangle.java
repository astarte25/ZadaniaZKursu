package generic.together.figures;

public class Rectangle implements Figure {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double calcCircuit() {
        return 2 * a + 2 * b;
    }

    @Override
    public double calcField() {
        return a * b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
