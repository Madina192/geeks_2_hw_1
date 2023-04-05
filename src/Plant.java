public class Plant {
    private String name;
    private LongevityOfPlants longevity;

    public Plant(String name, LongevityOfPlants longevity) {
        this.name = name;
        this.longevity = longevity;
    }

    public String getName() {
        return name;
    }

    public LongevityOfPlants getLongevity() {
        return longevity;
    }
}
