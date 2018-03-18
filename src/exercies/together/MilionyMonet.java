package exercies.together;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MilionyMonet {
    public static void main(String[] args) {
        System.out.println("Podaj kwotę ");
        BigDecimal nominaly[] = {BigDecimal.valueOf(500),
                BigDecimal.valueOf(200),
                BigDecimal.valueOf(100),
                BigDecimal.valueOf(50),
                BigDecimal.valueOf(20),
                BigDecimal.valueOf(10),
                BigDecimal.valueOf(5),
                BigDecimal.valueOf(2),
                BigDecimal.valueOf(1),
                BigDecimal.valueOf(0.50),
                BigDecimal.valueOf(0.20),
                BigDecimal.valueOf(0.10),
                BigDecimal.valueOf(0.05),
                BigDecimal.valueOf(0.02),
                BigDecimal.valueOf(0.01)};

        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            BigDecimal amount = sc.nextBigDecimal();

            for (int i = 0; i < nominaly.length; i++) {
                BigDecimal ilosc = amount.divide(nominaly[i], 0, RoundingMode.FLOOR);
                if (ilosc.compareTo(BigDecimal.ZERO) > 0) {
                    if (nominaly[i].compareTo(BigDecimal.ONE) >= 0) {
                        System.out.println(ilosc + "x" + nominaly[i] + "zł");
                    }
                    else {
                        System.out.println(
                                ilosc + "x" + nominaly[i].multiply(new BigDecimal("100")).toBigInteger() + "gr");
                    }
                    amount = amount.remainder(nominaly[i]);
                    //amount = amount.subtract(ilosc.multiply(nominaly[i]));
                }
            }
        }
        catch (Exception e) {
            System.out.println("Podałeś nieodpowiednią kwotę");
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
