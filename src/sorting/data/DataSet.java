package sorting.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Pomocnicza klasa do weryfikacji działania
 * algorytmów sortujących. Klasa posiada styatyczne
 * metody to pobrania danych w losowej kolejności oraz
 * drugą metodę, która przyjmuje listę lub tablicę
 * i sprawdza, czy kolejność elementów jest właściwa.
 */
public final class DataSet {

    private static class CompareDataException extends RuntimeException {

        private CompareDataException() {
        }

        private CompareDataException(String message) {
            super(message);
        }
    }

    private DataSet() {
    }

    public static void compare(Integer[] arrayToTest) {
        Integer[] sortedData = getDataFromFile("SortedData.txt");

        if (arrayToTest == null || sortedData.length != arrayToTest.length) {
            throw new CompareDataException("array to compare is null or have different length");
        }
        for (int i = 0; i < sortedData.length; i++) {
            if (!sortedData[i].equals(arrayToTest[i])) {
                throw new CompareDataException("elements are different at position [index]: " + i);
            }
        }
        System.out.println("Gratulacje! Tablice są takie same.");
    }

    public static void compare(List<Integer> listToTest) {
        Integer[] arrayToTest = new Integer[listToTest.size()];
        compare(listToTest.toArray(arrayToTest));
    }

    public static Integer[] getData() {
        return getDataFromFile("SortData.txt");
    }

    public static List<Integer> getDataAsList() {
        Integer[] data = getDataFromFile("SortData.txt");
        return Arrays.asList(data);
    }

    private static Integer[] getDataFromFile(String filename) {
        Integer[] data;
        File file = new File(filename);
        try (Scanner scanner = new Scanner(new FileInputStream(file))) {
            List<Integer> values = new ArrayList<>();
            while (scanner.hasNextInt()) {
                values.add(scanner.nextInt());
            }
            data = new Integer[values.size()];
            data = values.toArray(data);
        } catch (IOException e) {
            throw new RuntimeException("Could not open file: " + filename);
        }
        return data;
    }
}
