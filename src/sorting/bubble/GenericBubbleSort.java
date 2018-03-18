package sorting.bubble;

import java.util.Arrays;

/**
 * Zadanie:
 * Rozszerz algorytm sortowania bąbelkowego, aby
 * był generyczny. W celu wykorzystaj interfejs Comparable.
 */
public class GenericBubbleSort {

    public static void main(String[] args) {

        Integer[] arrayOfIntegers = new Integer[]{4, -2, 2, 6, -10, -100};
        Long[] arrayOfLongs = new Long[]{4L, -2L, 2L, 6L, -10L, -100L};

        bubbleSort(arrayOfIntegers);
        Arrays.stream(arrayOfIntegers).forEachOrdered((value -> System.out.print(value + " ")));

        System.out.println("\n");

        bubbleSort(arrayOfLongs);
        Arrays.stream(arrayOfLongs).forEachOrdered((value -> System.out.print(value + " ")));
    }

    private static <T extends Comparable<T>> void bubbleSort(T array[]) {
        for (int i = array.length; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(j, j + 1, array);
                }
            }
        }
    }

    private static <T extends Comparable<T>> void swap(int i, int j, T[] array) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
