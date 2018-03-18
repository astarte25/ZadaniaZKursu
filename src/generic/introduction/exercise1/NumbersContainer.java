package generic.introduction.exercise1;

import java.util.ArrayList;
import java.util.List;

public class NumbersContainer<T extends MyNumber> {

    private List<T> numbers = new ArrayList<>();

    public NumbersContainer<T> addNumber(T number) {
        numbers.add(number);
        return this;
    }

    public void printNumbers() {
        for (T number : numbers) {
            Integer value = number.getMyNumber();
            System.out.println(value);
        }
    }
}
