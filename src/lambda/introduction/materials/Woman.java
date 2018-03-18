package lambda.introduction.materials;

public class Woman {

    private String name;

    private boolean dancer;

    private boolean runner;

    private boolean singer;

    public Woman(String name, boolean dancer, boolean runner, boolean singer) {
        this.name = name;
        this.dancer = dancer;
        this.runner = runner;
        this.singer = singer;
    }

    public boolean isDancer() {
        return dancer;
    }

    public void setDancer(boolean dancer) {
        this.dancer = dancer;
    }

    public boolean isRunner() {
        return runner;
    }

    public void setRunner(boolean runner) {
        this.runner = runner;
    }

    public boolean isSinger() {
        return singer;
    }

    public void setSinger(boolean singer) {
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name
                + " [" + (singer ? " śpiewa " : "")
                + (dancer ? " tanczy " : "")
                + (runner ? " biega " : "") + "]";
    }
}
