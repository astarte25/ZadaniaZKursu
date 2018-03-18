package generic.together.figures;

public class Square implements Figure {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calcCircuit() {
        return 4 * a;
    }

    @Override
    public double calcField() {
        return a * a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
