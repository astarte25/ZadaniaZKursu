package generic.introduction.exercise2;

import java.util.Arrays;
import java.util.List;

/**
 * Zadanie:
 * Stwórz generyczną metodę, która będzie przyjmowała listę (argument),
 * a sama metoda będzie iterowała tą listę
 * i wypisywała obiekty na konsoli.
 *
 */
public class GenericMethods {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(5, 10, 115, 25);
        List<String> listOfStrings = Arrays.asList("Asia", "Zuzia", "Kasia");

        print(listOfIntegers);
        print(listOfStrings);
    }

    private static <T> void print(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }
}
