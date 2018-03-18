package exercies;

import util.CalcTime;

import java.util.Scanner;

/**
 * Zaimplementuj algorytm, który zakoduje podany ciąg znaków przy pomocy szyfru Cezara.
 * Wejście:
 * Na wejściu pojawi się tekst.
 * Wyjście:
 * Na wyjściu otrzymujemy zaszyfrowany tekst używając Szyfru Cezara tylko
 * dla liter (małych oraz wielkich). Znaki spoza alfabetu powinny
 * pozostać bez zmian.
 */
public class Exercise8 {

    private static final CalcTime CALC_TIME = new CalcTime();

    private static final int CESAR_STEP = 29;

    private static final char CAPITAL_A = 'A';

    private static final char CAPITAL_Z = 'Z';

    private static final char SMALL_A = 'a';

    private static final char SMALL_Z = 'z';

    public static void main(String[] args) {

        String text;
        System.out.println("Podaj tekst do zakodowania");
        try (Scanner scanner = new Scanner(System.in)) {
            text = scanner.nextLine();
        }

        CALC_TIME.start();

        String encoded = encodeCesar(text, CESAR_STEP);
        System.out.println(encoded);

        CALC_TIME.stop();
        CALC_TIME.display();
    }

    private static String encodeCesar(String text, int step) {
        StringBuilder encoded = new StringBuilder();
        final int alphabetLength = CAPITAL_Z - CAPITAL_A + 1; // number of letters in alphabet
        final int realStep = step % alphabetLength;
        for (char c : text.toCharArray()) {
            if ((c >= CAPITAL_A && c <= CAPITAL_Z) || (c >= SMALL_A && c <= SMALL_Z)) {
                byte cByte = (byte) c;
                cByte += realStep;
                if ((cByte < SMALL_A && cByte > CAPITAL_Z || cByte > SMALL_Z)) {
                    cByte -= alphabetLength;
                }
                encoded.append((char) cByte);
            }
            else {
                encoded.append(c);
            }
        }
        return encoded.toString();
    }
}
