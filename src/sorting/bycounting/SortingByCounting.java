package sorting.bycounting;

import sorting.data.DataSet;
import util.CalcTime;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Zadanie:
 * Zaimplementuj algorytm sortowania przez zliczanie dla liczb z zakresu: 0-9.
 */
public class SortingByCounting {

    private static final CalcTime CALC_TIME = new CalcTime();

    public static void main(String[] args) {

        Integer[] arrayToSort = DataSet.getData();
        Arrays.stream(arrayToSort).forEachOrdered(value -> System.out.print(value + ","));

        System.out.println("\n\n");

        CALC_TIME.start();
        Integer[] sortedArray = sort(arrayToSort);
        CALC_TIME.stop();
        CALC_TIME.display();

        DataSet.compare(sortedArray);
    }

    private static Integer[] sort(Integer[] array) {
        if (array == null || array.length < 2) {
            throw new RuntimeException("How would you like to sort null or one-element array?");
        }

        Integer[] sortedArray = new Integer[array.length];

        // prepare ordered map with values 0
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, 0);
        }

        // count repeated values, store in map
        for (int key : array) {
            Integer value = map.get(key);
            map.put(key, ++value);
        }

        // sum two next
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        Map.Entry<Integer, Integer> previousElement = it.next();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> currentElement = it.next();
            currentElement.setValue(previousElement.getValue() + currentElement.getValue());
            previousElement = currentElement;
        }

        // put elements in right index
        for (int i = array.length - 1; i >= 0; i--) {
            int key = array[i];
            int index = map.get(key);
            sortedArray[index - 1] = key;
            map.put(key, --index);
        }

        return sortedArray;
    }
}
