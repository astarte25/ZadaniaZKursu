package exercies.bank;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ExampleBankUsage {
    public static void main(String[] args) {

        Bank bank = new Bank();
        System.out.println(bank);

        boolean exist = bank.check(Nominal.GR_1, BigInteger.valueOf(3));
        System.out.println(exist ?
                "W banku jest co najmniej 3x monet po 1gr\n" :
                "W banku nie ma 3x monet po 1gr\n");

        if (exist) {
            System.out.println("Zabieram z banku 3x 1gr");
            bank.minus(Nominal.GR_1, BigInteger.valueOf(3));
        }

        BigInteger count = bank.get(Nominal.GR_1);
        System.out.println("W banku zostało " + count + "x 1gr");

        System.out.println(bank);

        BigDecimal cash = bank.getAllCash();
        System.out.println("W banku jest w sumie: " + cash + " pieniedzy");
    }
}
