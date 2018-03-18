package generic.figures;

/**
 * Zadanie:
 * Wykorzystując interfejs Figure skonstruuj dwie figury, np
 * kwadrat i prostokąt, które będą implementowały w/w interfejs.
 * Następnie stwórz generyczną klasę FigureBox, która będzie
 * kontenerem na nasze figury, będzie zawierał listę figur.
 * FigureBox powinien również posiadac 3 publiczne metody:
 * addFigure() - dodajemy kolejną figurę do naszej listy
 * printCircuit() - wyświetla w kosnoli wszystkie obwody naszych figur
 * printFields() - wyświetla w konsoli wszystkie pola naszych figur
 */
public class ExampleFiguresUsage {

    public static void main(String[] args) {

        FigureBox<Figure> figureBox = new FigureBox<>();  // pudełko na obiekty (figury)
        Rectangle rectangle = new Rectangle(2.0, 5.0);
        Square square = new Square(10.0);

        figureBox.addFigure(rectangle); // dodanie obiektu prostokąt do pudełka
        figureBox.addFigure(square);    // dodanie kwadratu do pudełka

        figureBox.printCircuit();   // obwody figur w pudełku
        figureBox.printFields();    // pola figur w pudełku
    }
}
