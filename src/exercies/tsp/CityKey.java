package exercies.tsp;

public class CityKey {

    private int cityA;

    private int cityB;

    public CityKey(int cityA, int cityB) {
        this.cityA = cityA;
        this.cityB = cityB;
    }

    @Override
    public int hashCode() {
        return 13 * 11 * cityA * cityB;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CityKey) {
            CityKey cityKey = (CityKey) obj;
            return (this.cityA == cityKey.getCityA() && this.cityB == cityKey.getCityB())
                    || (this.cityA == cityKey.getCityB() && this.cityB == cityKey.getCityA());
        }
        return super.equals(obj);
    }

    public int getCityA() {
        return cityA;
    }

    public void setCityA(int cityA) {
        this.cityA = cityA;
    }

    public int getCityB() {
        return cityB;
    }

    public void setCityB(int cityB) {
        this.cityB = cityB;
    }

    @Override
    public String toString() {
        return cityA + " -> " + cityB;
    }
}
