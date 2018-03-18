package sorting.insertion;

import sorting.data.DataSet;
import util.CalcTime;

/**
 * Zadanie:
 * Zaimplementuj algorytm sortowania przez wstawianie (insertion sort)
 */
public class InsertionSort {

    public static final CalcTime CALC_TIME = new CalcTime();

    public static void main(String[] args) {

        Integer[] array = DataSet.getData();

        CALC_TIME.start();
        array = sort(array);
        CALC_TIME.stop();
        CALC_TIME.display();

        DataSet.compare(array);
    }

    private static Integer[] sort(Integer[] array) {
        Integer[] orderedArray = new Integer[array.length];
        orderedArray[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && temp < orderedArray[j - 1]) {
                orderedArray[j] = orderedArray[j - 1];
                j--;
            }
            orderedArray[j] = temp;
        }
        return orderedArray;
    }
}
