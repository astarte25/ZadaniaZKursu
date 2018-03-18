package lambda.introduction.materials;

public class CheckIfDancer implements CheckSport {
    @Override
    public boolean check(Woman woman) {
        return woman.isDancer();
    }
}
