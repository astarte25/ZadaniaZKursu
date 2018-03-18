package generic.introduction.exercise1;

/**
 * Zadanie:
 * Stwórz interfejs MyNumber i zaimplementuj go
 * w dwóch klasach: BeautyNumber i UglyNumber.
 * Wykorzystaj w/w interfejs do stworzenia
 * generycznego kontenera do przechowywania
 * Twoich obiektów numerów (Beauty i Ugly Number).
 */
public class ExampleUsage {

    public static void main(String[] args) {
        NumbersContainer<MyNumber> numbersContainer = new NumbersContainer<>();

        MyNumber firstBeautyNumber = new BeautyNumber(10);
        MyNumber secondBeautyNumber = new UglyNumber(40);

        numbersContainer.addNumber(firstBeautyNumber)
                .addNumber(secondBeautyNumber);

        numbersContainer.printNumbers();
    }
}
