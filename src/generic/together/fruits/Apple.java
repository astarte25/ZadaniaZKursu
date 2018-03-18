package generic.together.fruits;

public class Apple extends AbstractFruit {

    private Color color;

    public Apple(String name, Color color) {
        super(name, true);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
