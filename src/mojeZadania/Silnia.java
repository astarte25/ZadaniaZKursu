package mojeZadania;

import java.util.Scanner;

public class Silnia {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną: ");
        int n = sc.nextInt();
        System.out.println(silnia(n));

    }
    public static int silnia(int n){


        if(n < 2) {   // silnia dla 0 i 1 będzie zawsze wynosić 1
            return 1;
        }
        else{
            return n*silnia(n-1);
        }
    }
}
