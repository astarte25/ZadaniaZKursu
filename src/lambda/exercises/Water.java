package lambda.exercises;

import java.math.BigDecimal;

public class Water {

    private String name;

    private BigDecimal cost;

    private boolean carbonated;

    private double size;

    public Water(String name, BigDecimal cost, boolean carbonated, double size) {
        this.name = name;
        this.cost = cost;
        this.carbonated = carbonated;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public boolean isCarbonated() {
        return carbonated;
    }

    public void setCarbonated(boolean carbonated) {
        this.carbonated = carbonated;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return this.name + " [" + this.cost + " PLN, " + this.size + " l " + (this.carbonated ? "Gazowana" : "Niegazowana") + "]";
    }
}
