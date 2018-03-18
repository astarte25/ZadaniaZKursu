package generic.together.figures;

import java.util.ArrayList;
import java.util.List;

public class FigureBox<T extends Figure> {

    private List<T> figures = new ArrayList<>();

    public void addFigure(T name) {
        figures.add(name);
    }

    public void showFields() {
        for (T show : figures) {
            System.out.println(show.calcField());
        }
    }

    public void showCircuits() {
        for (T show : figures) {
            System.out.println(show.calcCircuit());
        }
    }
}
