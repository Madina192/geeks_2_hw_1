public class LongevityOfPlants {
    private int number;
    private String unit;

    public LongevityOfPlants(int number, String unit) {
        this.number = number;
        this.unit = unit;
    }

    public int getNumber() {
        return number;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return number + " " + unit;
    }
}
