package lambda.exercises;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Zadanie:
 * Wykonaj kolejne polecenia wykorzystując strumienie.
 */
public class Exercises {

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
        System.out.println("1. Wszystkie wody: ");
        waters.forEach(System.out::println);

        //2. Wypisz wszystkie wody gazowane
        System.out.println("2. Wody gazowane: ");
        waters.stream().filter(Water::isCarbonated).forEach(System.out::println);

//        3. Wypisz wszystkie rodzaje wód (bez duplikatów), tylko same nazwe
        System.out.println("3. Rodzaje wód: ");
        waters.stream().map(Water::getName).distinct().forEach(System.out::println);
//        4. Posortuj wody wg ceny
        System.out.println("4. Sortowanie wg ceny: ");
        waters.stream().sorted(Comparator.comparing(Water::getCost)).forEach(System.out::println);
//        5. Wypisz najtańszą wodę
        System.out.println("5. Najtańsza woda: ");
        waters.stream().min(Comparator.comparing(Water::getCost)).get();
        System.out.println(waters.stream().min(Comparator.comparing(Water::getCost)).get());
//        6. Wypisz najdroższą wodę
        System.out.println("6. Najdroższa woda: ");
        waters.stream().max(Comparator.comparing(Water::getCost)).get();
        System.out.println(waters.stream().max(Comparator.comparing(Water::getCost)).get());
//        7. Podaj średnią wielkość butelki wody (size of Water)
        System.out.println("7. średnia wielkość butelki: ");
        waters.stream().mapToDouble(Water::getSize).average().ifPresent(System.out::println);
//        8. Wypisz kwotę do zapłaty za wszystkie wody po jednej sztuce (suma)
        System.out.println("8. Koszt wszystkich butelek: ");
        waters.stream().map(Water::getCost).reduce(BigDecimal::add).ifPresent(System.out::println);
//        9. Wypisz średni koszt wody (pierw wykonaj zadanie powyższe)
        System.out.println("9. średni koszt wody: ");
        BigDecimal result = waters.stream().map(Water::getCost).reduce(BigDecimal::add).get()
                .divide(BigDecimal.valueOf(waters.size()), 2);
        System.out.println(result);
//        10. Wypisz najdroższą wodę wśród wód gazowanych
        System.out.println("10. Najdroższa woda gazowana: ");
        waters.stream().filter(Water::isCarbonated).max(Comparator.comparing(Water::getCost)).get();
        System.out.println(waters.stream().filter(Water::isCarbonated).max(Comparator.comparing(Water::getCost)).get());
//        11. Wypisz najtańszą wodę wśród wód niegazowanych
        System.out.println("11. Najtańsza woda niegazowana: ");
        waters.stream().filter(water -> !water.isCarbonated()).min(Comparator.comparing(Water::getCost)).get();
        System.out.println(waters.stream().filter(water -> !water.isCarbonated()).min(Comparator.comparing(Water::getCost)).get());
//        12. Wypisz wszystkie wody (bez duplikatów), których nazwa kończy się na '-anka'

        System.out.println("Wody z '-anka' na końcu: ");

        waters.stream().map(Water::getName).distinct().filter(a -> a.endsWith("anka")).forEach(System.out::println);

        //13. Pogrupuj wody po nazwie, wypisując ich ceny posortowane rosnąca po przecinku, np. Muszynianka 3,49, 3.89
        System.out.println("13. Wody sortowane po nazwie + ceny rosnąco: ");
        /*waters.stream().sorted(Comparator.comparing(Water::getName)).map(w -> w.getName() + " " + w.getCost())
                .forEach(System.out::println);
*/
        /*waters.stream().collect(Collectors.groupingBy(Water::getName, Collectors.mapping(Water::getCost,
                Collectors.toCollection(HashSet::new)))).forEach((k, v)-> System.out.println(k + " :" + v));*/

        waters.stream().collect(Collectors.groupingBy(Water::getName)).forEach((name,list)->{
           System.out.print(name+": ");
           System.out.println(list.stream().map(Water::getCost).sorted().map(BigDecimal::toString)
                   .collect(Collectors.joining(", ")));
        });
//        14. Rozszerz zadanie 13 tak, aby wody były dodatkowo posortowane alfabetycznie.
        System.out.println("14. Zadanie 13 + wody alfabetycznie: ");
        waters.stream().collect(Collectors.groupingBy(Water::getName, TreeMap::new,Collectors.toSet())).forEach((s, list)->{
            System.out.print(s+": ");
            System.out.println(list.stream().map(Water::getCost).sorted().map(BigDecimal::toString)
                    .collect(Collectors.joining(", ")));
        });

//        15. Wypisz 3 nazwy wód, których rozmiar butelki jest największy
        System.out.println("15. 3 największe wody: ");
        waters.stream().sorted(Comparator.comparing(Water::getSize).reversed()).limit(3).forEach(System.out::println);
    }
}
