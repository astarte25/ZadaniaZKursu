package exercies.tsp;

import util.CalcTime;

import java.util.*;

/**
 * Travelling Salesman Problem
 * Rozwiąż problem komiwojażera za pomocą
 * programowania heyrstycznego metodą symulowanego wyżarzania
 * https://en.wikipedia.org/wiki/Travelling_salesman_problem
 */
public class Task {

    private static final Random RANDOM = new Random();

    private static final int MAX_PERMUTATIONS = 100;

    private static final int RANDOM_CITIES = 5; // calc from 0 to n, e.g. 3 = {0,1,2}

    private static final CalcTime CALC_TIME = new CalcTime();

    public static void main(String[] args) {

        Map<CityKey, Integer> travelCost = new HashMap<>();
        Set<Integer> allCities = new HashSet<>();
        for (int i = 0; i < RANDOM_CITIES; i++) {
            for (int j = i + 1; j < RANDOM_CITIES; j++) {
                travelCost.put(new CityKey(i, j), RANDOM.nextInt(100));
            }
            allCities.add(i);
        }

        CALC_TIME.start();

        // generate first random
        List<Integer> path = new ArrayList<>(); // here will be the final path
        while (allCities.size() > 0) {
            int randomCity = RANDOM.nextInt(RANDOM_CITIES);
            if (allCities.contains(randomCity)) {
                path.add(randomCity);
                allCities.remove(randomCity);
            }
        }

        int min = calcCost(path, travelCost);
        for (int i = 0; i < MAX_PERMUTATIONS; i++) {

            int firstCity = RANDOM.nextInt(path.size());
            int secondCity = RANDOM.nextInt(path.size());

            // switch two random cities
            List<Integer> newPath = new ArrayList<>(path);
            int temp = newPath.get(secondCity);
            newPath.set(secondCity, newPath.get(firstCity));
            newPath.set(firstCity, temp);

            // calc new min
            int newMin = calcCost(newPath, travelCost);

            // if new path cost less, save it
            if (newMin < min) {
                min = newMin;
                path = newPath;
                System.out.println(getPathAsString(path, newMin));
            }
        }

        System.out.println("Najlepsza znaleziona droga to");
        System.out.println(getPathAsString(path, min));

        CALC_TIME.stop();
        CALC_TIME.display();
    }

    private static int calcCost(List<Integer> path, Map<CityKey, Integer> travelCost) {
        int sum = 0;
        if (path.size() == 1) {
            throw new RuntimeException("Cannot calculate path for one city!");
        }
        for (int i = 1; i < path.size(); i++) {
            int cityA = path.get(i - 1);
            int cityB = path.get(i);
            CityKey cityKey = new CityKey(cityA, cityB);
            sum += getCost(cityKey, travelCost);
        }
        // finish cycle
        CityKey finishCycleKey = new CityKey(path.get(0), path.get(path.size() - 1));
        sum += getCost(finishCycleKey, travelCost);
        return sum;
    }

    private static int getCost(CityKey key, Map<CityKey, Integer> travelCost) {
        Integer cost = travelCost.get(key);
        if (cost == null) {
            throw new RuntimeException("Current path was not declared: " + key);
        }
        return cost;
    }

    private static String getPathAsString(List<Integer> path, int cost) {
        StringBuilder sb = new StringBuilder();
        sb.append(cost).append(": ");
        if (path.size() > 0) {
            for (Integer city : path) {
                sb.append(city);
                sb.append(" -> ");
            }
            // finish cycle
            sb.append(path.get(0));
        }
        return sb.toString();
    }
}
