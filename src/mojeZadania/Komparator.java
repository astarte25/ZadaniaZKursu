package mojeZadania;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Komparator {

    private static Comparator<Integer> COMPARATOR = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    };

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(4,20,100,50);
        lista.stream().sorted(COMPARATOR).forEachOrdered(System.out::println);
    }
}
