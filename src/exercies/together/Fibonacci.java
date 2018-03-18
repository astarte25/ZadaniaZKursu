package exercies.together;

import util.CalcTime;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {

    public static final CalcTime CALC_TIME = new CalcTime();

    public static final Map<BigInteger, BigInteger> CACHE = new HashMap<>();

    public static void main(String[] args) {

        CALC_TIME.start();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Podaj liczbę");
            System.out.println(fibonacci(sc.nextBigInteger()));
        }
        CALC_TIME.stop();
        CALC_TIME.display();

    }

    public static BigInteger fibonacci(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) <= 0) {
            return n;
        }
        if (CACHE.containsKey(n)) {
            return CACHE.get(n);
        }
        BigInteger result = fibonacci(n.subtract(BigInteger.ONE))
                .add(fibonacci(n.subtract(BigInteger.valueOf(2))));
        CACHE.put(n, result);
        return result;
    }
}
