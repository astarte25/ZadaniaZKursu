package sorting.bubble;

import sorting.data.DataSet;
import util.CalcTime;

import java.util.*;

/**
 * Zadanie:
 * Zaimplementuj algorytm sortowania bąbelkowego.
 */
public class BubbleSort {

    private static final CalcTime CALC_TIME = new CalcTime();

    public static void main(String[] args) {
        Integer[] array = DataSet.getData();

        CALC_TIME.start();
//        bubbleSort(array);
//        swapTest(array);
        List<String> list = new ArrayList<>();
        list.add("xzrf");
        list.add("nfvjhfdjh");
        list.add("hgsdfgetsfg");
        list.add("lkhk");
        sort(list);
        for(String s :list){
            System.out.println(s);
        }
        CALC_TIME.stop();

        DataSet.compare(array);
        CALC_TIME.display();

        Arrays.stream(array).forEachOrdered((value -> System.out.print(value + " ")));
    }

    public static <T extends Comparable<T>> void sort(List<T> list){

    boolean nextIterate = true;

        for (int i = list.size(); i >= 0 && nextIterate; i--) {
        nextIterate = false;
            for (int j = 0; j < i - 1; j++) {
                if (list.get(j-1).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, j + 1, j);
                    nextIterate = true;
                }
            }
        }
    }

    private static void swap(int i, int j, Integer[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /*private static void swapTest(Integer[] array) {
        boolean swapped = true;
        int lastIndex = array.length;
        while(swapped) {
            swapped = false;
            for (int i = lastIndex; i >= 0 ; i--) {
                lastIndex--;
                int temp = 0;
                if(array[i-1] > array[i]) {
                    temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        }
    }*/
}
