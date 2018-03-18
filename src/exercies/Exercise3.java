package exercies;

import util.CalcTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Napisz program, który sprawdza czy liczba jest pierwsza.
 * Wejśćie:
 * W pierwszej linii 𝑛 ∈ ℕ - liczba testów, w kolejnych liniach n liczb z przedziału [1…100000]
 * <p>
 * Wyjście:
 * Dla każdej liczby słowo TAK, jeśli pierwsza; NIE w p.p.
 */
public class Exercise3 {
    private static CalcTime CALC_TIME = new CalcTime();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        System.out.print("Ile liczb chcesz sprawdzic? ");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            numbers.add(scanner.nextInt());
        }

        CALC_TIME.start();
        System.out.println("Wyniki: ");
        for (Integer number : numbers) {
            boolean prime = isPrime(number);
            System.out.println(prime ? "TAK" : "NIE");
        }
        CALC_TIME.stop();
        CALC_TIME.display();
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
