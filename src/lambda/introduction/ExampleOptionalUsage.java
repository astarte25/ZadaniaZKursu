package lambda.introduction;

import lambda.introduction.materials.Woman;

import java.util.Optional;
import java.util.Random;

/**
 * Przykład zastosowania `Optional`
 */
public class ExampleOptionalUsage {

    private static final Random RANDOM = new Random();

    private static Optional<Woman> getRandom() {
        if (RANDOM.nextBoolean()) {
            Woman woman = new Woman("Tosia", RANDOM.nextBoolean(), RANDOM.nextBoolean(), RANDOM.nextBoolean());
            return Optional.of(woman);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {

//        Example 1
        getRandom().ifPresent(System.out::println);

//        Example 2
        System.out.println(getRandom().map(Woman::getName).orElse("Nie ma kobiety"));

//        Example 3
        String name = RANDOM.nextBoolean() ? "Example" : null;
        Optional.ofNullable(name).ifPresent(System.out::println);

        // end
    }
}
