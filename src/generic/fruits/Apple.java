package generic.fruits;

public class Apple implements Fruit {

    private String name;

    public Apple(String name) {
        this.name = name;
    }

    @Override
    public String getFruitName() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
