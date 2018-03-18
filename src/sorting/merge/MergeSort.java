package sorting.merge;

import sorting.data.DataSet;
import util.CalcTime;

/**
 * Zadanie:
 * Zaimplementuj algorytm sortowania przez scalnie (merge sort).
 */
public class MergeSort {

    private static final CalcTime CALC_TIME = new CalcTime();

    private static Integer[] array;

    private static Integer[] tempArray;

    public static void main(String[] args) {
        array = DataSet.getData();

        CALC_TIME.start();

        tempArray = new Integer[array.length];
        mergeSort(0, array.length - 1);

        CALC_TIME.stop();
        CALC_TIME.display();

        DataSet.compare(array);
    }

    private static void mergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // sort left side
            mergeSort(lowerIndex, middle);
            // sort right side
            mergeSort(middle + 1, higherIndex);
            // merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }


    private static void mergeParts(int lowerIndex, int middle, int higherIndex) {
        // prepare temp array with current values
        System.arraycopy(array, lowerIndex, tempArray, lowerIndex, higherIndex + 1 - lowerIndex);

        int leftArrayIndex = lowerIndex;
        int rightArrayIndex = middle + 1;
        int arrayIndex = lowerIndex;

        // compare left result with right result and rewrite in right order
        while (leftArrayIndex <= middle && rightArrayIndex <= higherIndex) {
            if (tempArray[leftArrayIndex] <= tempArray[rightArrayIndex]) {
                array[arrayIndex] = tempArray[leftArrayIndex];
                leftArrayIndex++;
            } else {
                array[arrayIndex] = tempArray[rightArrayIndex];
                rightArrayIndex++;
            }
            arrayIndex++;
        }

        // rewrite left result to the end
        // we must not rewrite right result to the end because they are already there
        while (leftArrayIndex <= middle) {
            array[arrayIndex] = tempArray[leftArrayIndex];
            arrayIndex++;
            leftArrayIndex++;
        }
    }
}
