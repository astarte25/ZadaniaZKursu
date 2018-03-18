package exercies;

import java.util.Scanner;

/**
 * Znaleźć największy wspólny dzielnik dla dwóch podanych liczb
 * wykorzystując rekurencję.
 */
public class Exercise13 {

    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj pierwszą liczbę: ");
            firstNumber = scanner.nextInt();
            System.out.println("Podaj drugą liczbę: ");
            secondNumber = scanner.nextInt();

            int nwd = nwd(firstNumber, secondNumber);
            System.out.println("NWD dla " + firstNumber + " i " + secondNumber + " wynosi " + nwd);
        }
    }

    private static int nwd(int firstNumber, int secondNumber) {
        if (firstNumber == secondNumber) {
            return firstNumber;
        }
        if (firstNumber < secondNumber) {
            secondNumber -= firstNumber;
            return nwd(firstNumber, secondNumber);
        }
        else {
            firstNumber -= secondNumber;
            return nwd(firstNumber, secondNumber);
        }
    }
}
