package sorting.comparator.exercise2;

public enum CarType {
    MERCEDES(100),
    VOLVO(200),
    SEAT(300),
    OPEL(400);

    private int value;

    CarType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
