package sorting.comparator.exercise2;

import java.time.LocalDate;

public class Car {

    private LocalDate completeProductionDate;

    private CarType carType;

    public Car(LocalDate completeProductionDate, CarType carType) {
        this.completeProductionDate = completeProductionDate;
        this.carType = carType;
    }

    public Car() {
    }

    public LocalDate getCompleteProductionDate() {
        return completeProductionDate;
    }

    public void setCompleteProductionDate(LocalDate completeProductionDate) {
        this.completeProductionDate = completeProductionDate;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return carType + " - " + completeProductionDate;
    }
}
