package generic.figures;

public class Square implements Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calcCircuit() {
        return 4 * side;
    } // pole kwadratu 4*a

    @Override
    public double calcField() {
        return side * side;
    } //

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
