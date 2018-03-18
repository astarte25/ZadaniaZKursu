package lambda.exercises;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Answers {

    private static List<Water> waters = Arrays.asList(
            new Water("Nałęczowianka", BigDecimal.valueOf(3.49), true, 0.5),
            new Water("Nałęczowianka", BigDecimal.valueOf(2.99), false, 0.6),
            new Water("Staropolanka", BigDecimal.valueOf(1.99), true, 1),
            new Water("Staropolanka", BigDecimal.valueOf(2.49), false, 1),
            new Water("Primavera", BigDecimal.valueOf(0.99), true, 0.33),
            new Water("Primavera", BigDecimal.valueOf(0.89), false, 0.33),
            new Water("Muszynianka", BigDecimal.valueOf(3.89), true, 1.5),
            new Water("Muszynianka", BigDecimal.valueOf(3.49), false, 1.5)
    );

    public static void main(String[] args) {

//        1. Wypisz wszystkie wody
//        waters.forEach(System.out::println);

//        2. Wypisz wszystkie wody gazowane
//        waters.stream().filter(Water::isCarbonated).forEach(System.out::println);

//        3. Wypisz wszystkie rodzaje wód (bez duplikatów), tylko same nazwe
//        waters.stream().map(Water::getName).distinct().forEach(System.out::println);

//        4. Posortuj wody wg ceny
//        waters.stream().sorted(Comparator.comparing(Water::getCost)).forEach(System.out::println);

//        5. Wypisz najtańszą wodę
//        waters.stream().min(Comparator.comparing(Water::getCost)).ifPresent(System.out::println);

//        6. Wypisz najdroższą wodę
//        waters.stream().max(Comparator.comparing(Water::getCost)).ifPresent(System.out::println);

//        7. Podaj średnią wielkość butelki wody (size of Water)
//        waters.stream().mapToDouble(Water::getSize).average().ifPresent(System.out::println);

//        8. Wypisz kwotę do zapłaty za wszystkie wody po jednej sztuce (suma)
//        waters.stream().map(Water::getCost).reduce(BigDecimal::add).ifPresent(System.out::println);

//        9. Wypisz średni koszt wody (pierw wykonaj zadanie powyższe)
//        BigDecimal count = BigDecimal.valueOf(waters.size());
//        System.out.println(waters.stream().map(Water::getCost).reduce(BigDecimal::add).get().divide(count, 2));

//        10. Wypisz najdroższą wodę wśród wód gazowanych
//        System.out.println(waters.stream().filter(Water::isCarbonated).max(Comparator.comparing(Water::getCost)));

//        11. Wypisz najtańszą wodę wśród wód niegazowanych
//        System.out.println(waters.stream().filter(w -> !w.isCarbonated()).min(Comparator.comparing(Water::getCost)));

//        12. Wypisz wszystkie wody (bez duplikatów), których nazwa kończy się na '-anka'
//        waters.stream().map(Water::getName).filter(n -> n.endsWith("anka")).distinct().forEach(System.out::println);

//        13. Pogrupuj wody po nazwie, wypisując ich ceny posortowane rosnąca po przecinku, np. Muszynianka 3,49, 3.89
/*        waters.stream().collect(Collectors.groupingBy(Water::getName)).forEach((name, grouped) -> {
            System.out.print(name + " ");
            System.out.print(
                    grouped.stream().map(Water::getCost).sorted().map(BigDecimal::toString).collect(Collectors.joining(","))
            );
            System.out.println();
        });*/

//        14. Rozszerz zadanie 11 tak, aby wody były dodatkowo posortowane alfabetycznie
/*        waters.stream().collect(Collectors.groupingBy(Water::getName, TreeMap::new, Collectors.mapping(Water::getCost, Collectors.toList())))
                .forEach((name, grouped) -> {
                    System.out.print(name + " ");
                    System.out.print(
                            grouped.stream().sorted().map(BigDecimal::toString).collect(Collectors.joining(", "))
                    );
                    System.out.println();
                });*/

//        15. Wypisz 3 wody, których rozmiar butelki jest największy
// waters.stream().sorted(Comparator.comparing(Water::getSize).reversed()).limit(3).forEach(System.out::println);

    }
}
