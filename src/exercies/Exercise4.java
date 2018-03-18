package exercies;

import util.CalcTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Zaimplementuj algorytm, który oblicza sumę pojawiających się na wejściu liczb.
 * Wejście:
 * Na wejście programu podana zostanie pewna nieokreślona, ale niewielka ilość
 * małych liczb całkowitych (z zakresu -100..100). Poszczególne liczby zostaną,
 * rozdzielone znakiem nowej linii.
 * Wyjście:
 * Na wyjściu ma się pojawić ciąg liczbowy, którego i-ta pozycja
 * jest równa sumie i-pierwszych wczytanych z wejścia liczb.
 * Poszczególne liczby należy rozdzielić znakami nowej linii.
 * <p>
 * Sign EOF => use CTRL + D
 */
public class Exercise4 {
    private static CalcTime CALC_TIME = new CalcTime();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        System.out.print("Podawaj liczby ");
        try {
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        }
        finally {
            scanner.close();
        }

        CALC_TIME.start();
        System.out.println("Wyniki: ");
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
            System.out.println(sum);
        }
        CALC_TIME.stop();
        CALC_TIME.display();
    }
}
