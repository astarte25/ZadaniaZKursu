package generic.introduction;

public class GenericNumberContainer<T extends Number> {

    private T number;

    public GenericNumberContainer(T number) {
        this.number = number;
    }

    public GenericNumberContainer() {
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}
