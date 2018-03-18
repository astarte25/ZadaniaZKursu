package exercies;

import util.CalcTime;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Zaimplementuj algorytm, który odszukuje, na której pozycji w tablicy
 * znajduje się dana liczba. Wyznacz jego klasę złożoności,
 * zastanów się ile wynosi złożoność optymistyczna, pesymistyczna i średnia.
 * Wejście:
 * Na wejście programu podany zostanie zbiór liczb oraz liczba,
 * którą należy wyszukać. Każda liczba ze zbioru zostanie rozdzielona przecinkiem.
 * Wyjście:
 * Pozycja liczby w tablicy; jeśli nie znaleziono to zwróć -1
 */
public class Exercise7 {

    private static CalcTime CALC_TIME = new CalcTime();

    public static void main(String[] args) {

        int[] values;
        int search;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj liczby (oddzielone przecinkiem): ");
            String[] numbers = scanner.nextLine().split(",");
            values = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
            System.out.println("Podaj szukaną liczbę: ");
            search = scanner.nextInt();
        }

        CALC_TIME.start();

        int index = findPosition(values, search);
        if (index != -1) {
            System.out.println("Liczba " + search + " jest na pozycji " + index);
        }
        else {
            System.out.println("Szukana liczba " + search + " nie występuje w podanej tablicy");
        }

        CALC_TIME.stop();
        CALC_TIME.display();

    }

    private static int findPosition(int[] values, int search) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == search) {
                return i + 1;
            }
        }
        return -1;
    }
}
