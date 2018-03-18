package util;

import java.util.Random;

public final class RandUtil {
    private static final Random RANDOM = new Random();

    private RandUtil() {
    }

    public static void generateInt(int limit) {
        generateInt(limit, 1);
    }

    public static void generateInt(int limit, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(RANDOM.nextInt(limit));
        }
    }
}
