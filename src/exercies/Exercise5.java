package exercies;

import util.CalcTime;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Zaimplementuj  algorytm, który dla podanej kwoty poda
 * w jaki sposób można wypłacać ją najmniejszą liczbą banknotów i monet.
 * Wejście:
 * W pierwszej linii wejścia znajduje się jedna liczba całkowita D (1 ≤ D ≤ 5),
 * oznaczająca liczbę przypadków do rozważenia. Opis każdego przypadku składa się
 * z jednej linii (np, 50,32).
 * Wyjście:
 * Dla każdego przypadku z wejścia.
 * Twój program powinien wypisać w osobnych liniach liczbę użytych banknotów/monet oraz ich nominał.
 */
public class Exercise5 {
    private static CalcTime CALC_TIME = new CalcTime();

    private static final BigDecimal[] NOMINALS = {
            BigDecimal.valueOf(500.0),
            BigDecimal.valueOf(200.0),
            BigDecimal.valueOf(100.0),
            BigDecimal.valueOf(50.0),
            BigDecimal.valueOf(20.0),
            BigDecimal.valueOf(10.0),
            BigDecimal.valueOf(5.0),
            BigDecimal.valueOf(2.0),
            BigDecimal.valueOf(1.0),
            BigDecimal.valueOf(0.50),
            BigDecimal.valueOf(0.20),
            BigDecimal.valueOf(0.10),
            BigDecimal.valueOf(0.05),
            BigDecimal.valueOf(0.02),
            BigDecimal.valueOf(0.01)
    };

    public static void main(String[] args) {

        List<BigDecimal> numbers = new ArrayList<>();
        System.out.print("Ile przypadków chcesz sprawdzić?");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            if (number < 1) {
                number = 0;
            }
            if (number > 5) {
                number = 5;
            }
            for (int i = 0; i < number; i++) {
                numbers.add(scanner.nextBigDecimal());
            }
        }

        CALC_TIME.start();
        System.out.println("Wyniki: ");
        for (BigDecimal value : numbers) {
            String result = value(value);
            System.out.println("Kwota" + value + ":");
            System.out.println(result + "\n");
        }
        CALC_TIME.stop();
        CALC_TIME.display();
    }

    private static String value(BigDecimal value) {
        StringBuilder result = new StringBuilder();
        for (BigDecimal nominal : NOMINALS) {
            if (value.compareTo(nominal) >= 0) {
                BigDecimal times = value.divide(nominal, 0, RoundingMode.DOWN);
                value = value.subtract(nominal.multiply(times));
                result.append(times);
                result.append("x ");
                result.append(nominal);
                result.append("\n");
            }
        }
        return result.toString();
    }
}
