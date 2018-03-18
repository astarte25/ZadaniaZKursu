package generic.together.figures;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(7, 8);
        FigureBox<Figure> walizka = new FigureBox<>();

        walizka.addFigure(square);
        walizka.addFigure(rectangle);
        walizka.showCircuits();
        walizka.showFields();

    }
}
