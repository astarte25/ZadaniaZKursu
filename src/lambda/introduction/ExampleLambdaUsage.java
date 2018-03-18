package lambda.introduction;

import lambda.introduction.materials.Woman;
import lambda.introduction.materials.WomenGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Lambdy są dostępne w języku Java od wersji 1.8.
 * Poniżej znajdziecie kilka przykładów użycia lambd.
 */
public class ExampleLambdaUsage {

    public static void main(String[] args) {
//        example 1 - shortcut (woman group)
        List<Woman> womenGroup = WomenGroup.getWomenGroup();
        WomenGroup.print(womenGroup, (woman) -> woman.isDancer());
        WomenGroup.print(womenGroup, Woman::isDancer);


//        example  2 - not compilation declaration
        List<String> names = Arrays.asList("Iza", "Ewa", "Kasia", "Agnieszka");
//        names.forEach((name) -> {
//                    int name = 2;
//                    System.out.println("Imię: " + name);
//                }
//        );
//        names.forEach(System.out::println);

//        example 3 - primitive types as streams
//        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//        IntStream.of(values).filter(e -> e > 5).forEach(System.out::println);
//
//        example 4 - what do reduce() ?
//        IntStream.of(values).reduce((result, current) -> {
//            return result + current;
//        });


//         example 4 - map + filter + print
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "plum", "pear", "pinapple");
        List<String> filtered = new ArrayList<>();
        for (String fruit : fruits) {
            if (fruit.startsWith("p")) {
                filtered.add(fruit.toUpperCase());
            }
        }
        filtered.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String fruit : filtered) {
            System.out.println(fruit);
        }

        fruits.stream()
                .filter(s -> s.startsWith("p"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

//        Example 5 - simple parallel
        IntStream.range(1, 10).parallel().forEach(System.out::println);

//        END
    }
}
