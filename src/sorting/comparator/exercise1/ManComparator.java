package sorting.comparator.exercise1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Stwórz jeden komparator, który posortuje listę obiektów Man po:
 * 1. kryterium: malejąco po wieku (pierw najstarszy, na końcu najmłodszy)
 * 2. kryterium: po imieniu i nazwisku
 */
public class ManComparator {

    private static final Comparator<Man> MAN_COMPARATOR = new Comparator<Man>() {
        @Override
        public int compare(Man o1, Man o2) {
           if(o1.getAge()== o2.getAge()) {  // jeżeli są w tym samym wieku
               if(o1.getFirstName().equals(o2.getFirstName())) {    // jeżeli mają tak samo na imię
                   return o1.getLastName().compareTo(o2.getLastName()); //porównaj nazwiska
               }
               return o1.getFirstName().compareTo(o2.getFirstName());   // porównaj imiona
           }
           return o1.getAge() < o2.getAge() ? 1 : -1;   // jeżeli wiek pierwszego jest mniejszy od drugiego zwróc 1, jeśli nie to -1

        }
    };

    public static void main(String[] args) {

        List<Man> listOfMen = Arrays.asList(new Man("Antoni", "Marijan", 20),
                new Man("Bronek", "Komin", 25),
                new Man("Antoni", "Kowalski", 20),
                new Man("Blazej", "Zalewski", 22),
                new Man("Arkadiusz", "Zalewski", 22));
        listOfMen.forEach(System.out::println);

        System.out.println("\n\nSORTED:");
        listOfMen.stream().sorted(MAN_COMPARATOR).forEachOrdered(System.out::println);
    }
}
