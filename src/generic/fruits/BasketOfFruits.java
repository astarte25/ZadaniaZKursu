package generic.fruits;

import java.util.ArrayList;
import java.util.List;

public class BasketOfFruits<T extends Fruit> {

    private List<T> fruits = new ArrayList<>();

    public BasketOfFruits<T> addFruit(T fruit) {
        fruits.add(fruit);
        return this;
    }

    public void printFruitNames() {
        for (T fruit : fruits) {
            System.out.println(fruit.getFruitName());
        }
    }
}
