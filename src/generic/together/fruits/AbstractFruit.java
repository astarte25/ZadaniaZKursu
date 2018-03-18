package generic.together.fruits;

public abstract class AbstractFruit {

    protected String name;
    protected boolean fresh;

    public AbstractFruit() {
    }

    public AbstractFruit(String name, boolean fresh) {
        this.name = name;
        this.fresh = fresh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }
}
