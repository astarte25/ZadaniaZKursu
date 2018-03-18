package exercies;

import util.CalcTime;

/**
 * Stwórz tablicę posiadającą 10 elementów, które są liczbami typu int.
 * Wyświetl w pętli zawartość listy. Następnie odwróć kolejność zapisanych elementów w tablicy.
 * Wyświetl ponownie zawartość.
 */
public class Exercise2 {
    private static CalcTime CALC_TIME = new CalcTime();

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        CALC_TIME.start();
        printArray(numbers);
        for (int j = 0; j < Math.round(numbers.length / 2); j++) {
            int tmp = numbers[numbers.length - 1 - j];
            numbers[numbers.length - 1 - j] = numbers[j];
            numbers[j] = tmp;
        }
        printArray(numbers);
        CALC_TIME.stop();
        CALC_TIME.display();
    }

    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.print("\n");
    }
}
