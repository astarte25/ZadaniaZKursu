package generic.introduction.exercise1;

public class BeautyNumber implements MyNumber {

    private int beautyNumber;

    public BeautyNumber(int beautyNumber) {
        this.beautyNumber = beautyNumber;
    }

    @Override
    public Integer getMyNumber() {
        return beautyNumber;
    }
}
