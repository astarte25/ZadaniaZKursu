package generic.introduction.exercise1;

import java.util.Random;

public class UglyNumber implements MyNumber {

    private static final Random RANDOM = new Random();

    private int randomRange;

    public UglyNumber(int randomRange) {
        this.randomRange = randomRange;
    }

    @Override
    public Integer getMyNumber() {
        return RANDOM.nextInt(randomRange);
    }
}
