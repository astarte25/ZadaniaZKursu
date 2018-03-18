package exercies;

import util.CalcTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Exercise:
 * W pętli pobierz od użytkownika 5 imion. Wykorzystaj do tego listę.
 * Następnie wyświetl w konsoli zapisane imiona na liście.
 */
public class Exercise1 {
    private static CalcTime CALC_TIME = new CalcTime();

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Podaj " + (i + 1) + ". imie: ");
                names.add(scanner.next());
            }
        }
        finally {
            scanner.close();
        }

        CALC_TIME.start();

        System.out.print("Podałeś imiona: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.print("\n");

        CALC_TIME.stop();
        CALC_TIME.display();
    }
}
