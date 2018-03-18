package mojeZadania;

import java.util.Scanner;

public class KtoryIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Której liczby szukasz?");
        int a = sc.nextInt();
        int[] tab = {1,2,3,4,5,6,99,65,45,78};
        int wynik = index(tab, a);
        if(wynik == -1) {
            System.out.println("Nie ma takiej liczby w tablicy");
        } else {
            System.out.println("Liczba " + a + " znajduje się na pozycji " + (wynik+1) );
        }


    }
    public static int index(int[] tab, int a) {
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == a) {
                return i;
            }
        }
        return -1;
    }

}
