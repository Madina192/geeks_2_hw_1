public class Flower extends Plant{
    private int numberOfPetals;

    public Flower(String name, LongevityOfPlants longevity, int numberOfPetals) {
        super(name, longevity);
        this.numberOfPetals = numberOfPetals;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    public String bloom(Seasons season){
        return "Flower bloom in " + season;
    }

    public String bloom(Seasons season, LongevityOfPlants longevity){
        return "Flower bloom in " + season + " for " + longevity;
    }

    public final String bloom(){
        return "Flower is blooming! " + "\uD83C\uDF38";
    }

    public String printInfo(){
        return "Name: " + getName() + ", longevity: " + getLongevity().toString() + ", petals: " + getNumberOfPetals();
    }


}
