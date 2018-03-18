package exercies;

import util.CalcTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Zaimplementuj algorytm, który sprawdzi czy podany rok
 * jest przestępny czy nie.
 * Wejście:
 * W pierwszej linii wejścia znajduje się liczba całkowida D (1 <= D <= 5 )
 * oznaczająca liczbę przypadków do rozwiązania. Opis każdego
 * przypadku składa się z jednej linii - rok r ∈ ℕ
 * Wyjście:
 * Dla każdego przestępnego roku słowo TAK; NIE w p.p.
 */
public class Exercise6 {
    private static CalcTime CALC_TIME = new CalcTime();

    public static void main(String[] args) {

        List<Integer> years = new ArrayList<>();
        System.out.print("Ile przypadków chcesz sprawdzić? ");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            if (number < 1) {
                number = 0;
            }
            if (number > 5) {
                number = 5;
            }
            for (int i = 0; i < number; i++) {
                years.add(scanner.nextInt());
            }
        }

        CALC_TIME.start();
        System.out.println("Wyniki: ");
        for (Integer year : years) {
            boolean leapYear = isLeapYear(year);
            System.out.println(leapYear ? "TAK" : "NIE");
        }
        CALC_TIME.stop();
        CALC_TIME.display();
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
