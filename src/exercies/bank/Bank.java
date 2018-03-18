package exercies.bank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bank {

    private static final Random RANDOM = new Random();

    private Map<Nominal, BigInteger> bank;

    public Bank(Map<Nominal, BigInteger> bank) {
        this.bank = bank;
    }

    public Bank() {
        this.bank = new HashMap<>();
        for (Nominal nominal : Nominal.values()) {
            bank.put(nominal, BigInteger.valueOf(RANDOM.nextInt(10) + 1));
        }
    }

    public BigInteger get(Nominal nominal) {
        BigInteger count = bank.get(nominal);
        return count != null ? count : BigInteger.ZERO;
    }

    public BigDecimal getAllCash() {
        BigDecimal sum = BigDecimal.ZERO;
        for (Map.Entry<Nominal, BigInteger> entry : bank.entrySet()) {
            Nominal nominal = entry.getKey();
            BigDecimal multiplicand = new BigDecimal(entry.getValue());
            BigDecimal multiplied = nominal.getValue().multiply(multiplicand);
            sum = sum.add(multiplied);
        }
        return sum;
    }

    public void minus(Nominal nominal, BigInteger number) {
        if (!check(nominal, number)) {
            throw new RuntimeException("W banku nie ma " + number + "x " + nominal.getValue());
        }
        BigInteger value = bank.get(nominal);
        bank.put(nominal, value.subtract(number));
    }

    public boolean check(Nominal nominal, BigInteger number) {
        BigInteger value = bank.get(nominal);
        return value != null && value.compareTo(number) >= 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bank posiada\n");
        for (Nominal nominal : Nominal.values()) {
            BigInteger value = bank.get(nominal);
            if (value != null) {
                sb.append(nominal.getValue());
                sb.append("x ");
                sb.append(value);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
