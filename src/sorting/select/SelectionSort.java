package sorting.select;

import sorting.data.DataSet;
import util.CalcTime;

/**
 * Zadanie:
 * Napisz algorytm sortowania przez wybieranie (selection sort).
 */
public class SelectionSort {

    private static final CalcTime CALC_TIME = new CalcTime();

    public static void main(String[] args) {

        Integer[] array = DataSet.getData();

        CALC_TIME.start();

        array = sort(array);

        CALC_TIME.stop();
        CALC_TIME.display();

        DataSet.compare(array);
    }

    private static Integer[] sort(Integer[] array) {
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        return array;
    }
}
