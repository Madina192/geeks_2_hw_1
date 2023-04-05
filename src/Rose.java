final public class Rose extends Flower{
    private TypesOfRoses typesOfRoses;

    public Rose(String name, LongevityOfPlants longevity, int numberOfPetals, TypesOfRoses typesOfRoses) {
        super(name, longevity, numberOfPetals);
        this.typesOfRoses = typesOfRoses;
    }

    public TypesOfRoses getTypesOfRoses() {
        return typesOfRoses;
    }

    @Override
    public String bloom(Seasons season, LongevityOfPlants longevity) {
        return super.bloom(season, longevity) + ", flower type is " + typesOfRoses;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + ", type of rose: " + getTypesOfRoses().toString();
    }
}
