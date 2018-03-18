package sorting.bycounting;

import util.CalcTime;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Rozszerzenie algorytmu sortowanie przez zliczanie.
 * <p>
 * Zadanie:
 * Zmodyfikuj algorytm sortowania przez zliczanie,
 * tak aby posortował w rosnącej kolejności ciągi zgodnie z kolejnością alfabetyczną.
 * Każdy wyraz z ciągu ma trzy litery, zaczynają się od "AAA" a kończą na "CCC".
 * Przed sortowaniem:
 * CAC CAA AAB BAB CAC
 * Po sortowaniu:
 * AAB BAB CAA CAC CAC
 */
public class SortingByCountingUsedKeys {

    private static final CalcTime CALC_TIME = new CalcTime();

    public static void main(String[] args) {

        String[] arrayToSort = new String[]{"CCC", "ACA", "BCA", "AAA", "BCA", "AAA"};
        Arrays.stream(arrayToSort).forEachOrdered(value -> System.out.print(value + ","));

        System.out.println("\n\n");

        CALC_TIME.start();
        String[] sortedArray = sort(arrayToSort);
        CALC_TIME.stop();
        CALC_TIME.display();

        Arrays.stream(sortedArray).forEachOrdered(value -> System.out.print(value + ","));
    }

    private static String[] sort(String[] array) {
        if (array == null || array.length < 2) {
            throw new RuntimeException("How would you like to sort null or one-element array?");
        }
        String[] letters = new String[]{"A", "B", "C"};
        String[] sortedArray = new String[array.length];

        // prepare ordered map with values 0
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String firstLetter : letters) {
            for (String secondLetter : letters) {
                for (String thirdLetter : letters) {
                    map.put(firstLetter + secondLetter + thirdLetter, 0);
                }
            }
        }

        // count repeated values, store in map
        for (String key : array) {
            Integer value = map.get(key);
            map.put(key, ++value);
        }

        // sum two next
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        Map.Entry<String, Integer> previousElement = it.next();
        while (it.hasNext()) {
            Map.Entry<String, Integer> currentElement = it.next();
            currentElement.setValue(previousElement.getValue() + currentElement.getValue());
            previousElement = currentElement;
        }

        // put elements in right index
        for (int i = array.length - 1; i >= 0; i--) {
            String key = array[i];
            int index = map.get(key);
            sortedArray[index - 1] = key;
            map.put(key, --index);
        }

        return sortedArray;
    }
}
