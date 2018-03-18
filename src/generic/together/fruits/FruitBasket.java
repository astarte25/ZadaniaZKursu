package generic.together.fruits;

import java.util.ArrayList;
import java.util.List;

public class FruitBasket<T extends AbstractFruit> {

    private List<T> fruits = new ArrayList<>();

    public void add(T name) {
        fruits.add(name);
    }

    public void showBasket() {
        for (T fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
