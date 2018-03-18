package generic.figures;

public class Rectangle implements Figure {

    private double firstSide;

    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calcCircuit() {
        return 2 * firstSide + 2 * secondSide;
    } // metoda obliczająca obwód prostokąta 2a+2b

    @Override
    public double calcField() {
        return firstSide * secondSide;
    }   // metoda obliczająca pole prostokąta a*b

    // gettery i settery dla boków prostokąta:

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }
}
