package sorting.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Przykład wykorzystania interfejsu Comparator.
 */
public class ExampleComparators {

    private static Comparator<String> COMPARATOR = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    };

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Zuzia", "Basia", "Asia");
        list.sort(COMPARATOR);
        list.stream().sorted().forEachOrdered(System.out::println);
    }
}
