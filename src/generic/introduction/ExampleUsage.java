package generic.introduction;

import java.util.ArrayList;
import java.util.List;

public class ExampleUsage {

    public static void main(String[] args) {

        List myObjList = new ArrayList();
        // Store instances of ObjectContainer
        for (int x = 0; x <= 10; x++) {
            ObjectContainer myObj = new ObjectContainer();
            myObj.setObj("Test" + x);
            myObjList.add(myObj);
        }
        // Get the objects we need to cast
        for (int x = 0; x <= myObjList.size() - 1; x++) {
            ObjectContainer obj = (ObjectContainer) myObjList.get(x);
            System.out.println("Object Value: " + obj.getObj());
        }

        List<GenericContainer<String>> genericList = new ArrayList<>();
        // Store instances of GenericContainer
        for (int x = 0; x <= 10; x++) {
            GenericContainer<String> myGeneric = new GenericContainer<>();
            myGeneric.setObj(" Generic Test" + x);
            genericList.add(myGeneric);
        }
        // Get the objects; no need to cast to String
        for (GenericContainer<String> obj : genericList) {
            String objectString = obj.getObj();
            System.out.println(objectString);
        }

        MultiGenericContainer<String, String> mondayWeather =
                new MultiGenericContainer<>("Monday", "Sunny");
        MultiGenericContainer<Integer, Double> dayOfWeekDegrees =
                new MultiGenericContainer<>(1, 78.0);

        String mondayForecast = mondayWeather.getFirstPosition();
        double sundayDegrees = dayOfWeekDegrees.getSecondPosition();


        GenericNumberContainer<Integer> gn = new GenericNumberContainer<>();
        gn.setNumber(3);

        // Type argument String is not within the upper bounds of type variable T
//        GenericNumberContainer<String> gn2 = new GenericNumberContainer<>();

        // wildcards
        List<? extends Number> arr1 = new ArrayList<Number>();  // Number "extends" Number (in this context)
        List<? extends Number> arr2 = new ArrayList<Integer>(); // Integer extends Number
        List<? extends Number> arr3 = new ArrayList<Double>();  // Double extends Number
        Number value = arr1.get(0);

        List<? super Integer> arr4 = new ArrayList<Integer>();  // Integer is a "superclass" of Integer (in this context)
        List<? super Integer> arr5 = new ArrayList<Number>();   // Number is a superclass of Integer
        List<? super Integer> arr6 = new ArrayList<Object>();   // Object is a superclass of Integer
        Number number = 2d;
        arr4.add(2);
//        arr4.add(number)
    }

    public static <T extends Comparable<T>> T max(T[] tab) {
        if (tab == null || tab.length == 0) {
            return null;
        }
        T max = tab[0];
        for (T t : tab) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }
}
