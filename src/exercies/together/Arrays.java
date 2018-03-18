package exercies.together;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Podaj liczby do sprawdzenia");
            String numbers = sc.nextLine();
            System.out.println("Podaj, którą z podanych liczb sprawdzić");
            int position = sc.nextInt();
            int result = lookingInArray(numbers, position);
            if (result < 0) {
                System.out.println("W tablicy nie ma takiego elementu.");
            }
            else {
                System.out.println("Element jest w tablicy na " + result + ". miejscu.");
            }
        }
    }

    public static int lookingInArray(String data, int x) {

        String[] stringsArray = data.split(",");
        for (int i = 0; i < stringsArray.length; i++) {
            if (Integer.parseInt(stringsArray[i]) == x) {
                return i + 1;
            }
        }
        return -1;
    }
}
