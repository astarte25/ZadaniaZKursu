package generic.fruits;

/**
 * Zadanie:
 * Stwórz dwie nowe klasy reprezentujące dwa owoce
 * i implementujace interfejs Fruit.
 * Następnie, wykorzystując generyki,
 * stwórz koszyk na owoce (BasketOfFruits)
 * który będzie przechowywał nasze obiekty (owoce).
 * BasketOfFruits powinien posiadać dwie metody:
 * addFruit() - dodaje kolejny owoc do koszyka
 * printFruitNames() - wypisuje na konsoli nazwy
 * wszystkich owoców w koszyku
 *
 */
public class ExampleFruitsUsage {

    public static void main(String[] args) {
        BasketOfFruits<Fruit> basketOfFruits = new BasketOfFruits<>();

        basketOfFruits.addFruit(new Apple("Moje jabłko"));
        basketOfFruits.addFruit(new Banana("Moj banan"));

        basketOfFruits.printFruitNames();
    }
}
