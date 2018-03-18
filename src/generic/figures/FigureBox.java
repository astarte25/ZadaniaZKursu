package generic.figures;

import java.util.ArrayList;
import java.util.List;

public class FigureBox<T extends Figure> {

    private List<T> figures = new ArrayList<>();

    public FigureBox<T> addFigure(T figure) {  // tworzenie pudełka, które przechowuje i dodaje obiekty typu figura
        this.figures.add(figure);
        return this;
    }

    public void printCircuit() {
        for (T figure : figures) {
            System.out.println(figure.calcCircuit());
        }
    }

    public void printFields() {
        for (T figure : figures) {
            System.out.println(figure.calcField());
        }
    }
}
