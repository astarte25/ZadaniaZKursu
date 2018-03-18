package generic.introduction.exercise3;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Zadanie:
 * Stwórz generyczną metodę, która jako argument
 * będzie przyjmowała listę obiektów implementujących
 * interferjs Comparable.
 * Sama metoda powinna przejrzeć całą listę
 * i znaleźć obiekt, który jest "największy".
 * Do porównywania obiektów wykorzystaj metodę compareTo().
 */
public class GenericMethods {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(5, 10, 115, 25);
        List<BigDecimal> listOfBigDecimals = Arrays
                .asList(BigDecimal.valueOf(22), BigDecimal.valueOf(125.22), BigDecimal.valueOf(33.33));

        Integer maxOfIntegers = max(listOfIntegers);
        System.out.println("Max of integers: " + maxOfIntegers);

        BigDecimal maxOfBigDecimals = max(listOfBigDecimals);
        System.out.println("Max of big decimals: " + maxOfBigDecimals);
    }

    private static <T extends Comparable<T>> T max(List<T> list) {
        T max = null;
        for (T element : list) {
            if (max == null || element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
