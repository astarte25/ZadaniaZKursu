package sorting.comparator.exercise2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Zadanie:
 * Stwórz jeden komparator, który posortuje listę obiektów Car po:
 * 1. kryterium: rosnąco po dacie
 * 2. kryterium: po marce wg kolejności: MERCEDES -> VOLVO -> SEAT -> OPEL
 */
public class CarComparator {

    private static final Comparator<Car> CAR_COMPARATOR = new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            int dateCompare = o1.getCompleteProductionDate().compareTo(o2.getCompleteProductionDate());
            if (dateCompare == 0) {
                int car1Type = o1.getCarType().getValue();
                int car2Type = o2.getCarType().getValue();
                return Integer.compare(car1Type, car2Type);
            }
            return dateCompare;
        }
    };

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        List<Car> cars = Arrays.asList(new Car(now, CarType.SEAT),
                new Car(now.plusDays(1), CarType.OPEL),
                new Car(now.minusDays(1), CarType.OPEL),
                new Car(now.minusDays(1), CarType.VOLVO),
                new Car(now, CarType.MERCEDES));
        cars.stream().sorted(CAR_COMPARATOR).forEachOrdered(System.out::println);
    }
}
