package exercies.bank;

import java.math.BigDecimal;

public enum Nominal {
    PLN_200(200.0),
    PLN_100(100.0),
    PLN_50(50.0),
    PLN_20(20.0),
    PLN_10(10.0),
    PLN_5(5.0),
    PLN_2(2.0),
    PLN_1(1.0),
    GR_50(0.50),
    GR_20(0.20),
    GR_10(0.10),
    GR_5(0.05),
    GR_2(0.02),
    GR_1(0.01);

    private BigDecimal value;

    Nominal(double value) {
        this.value = BigDecimal.valueOf(value);
    }

    public BigDecimal getValue() {
        return value;
    }
}
