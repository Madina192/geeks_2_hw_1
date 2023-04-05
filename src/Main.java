public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Max", "Husky", 15, Color.BLACK, new Shelter("home", "Bishkek"));
        Dog dog3 = new Dog("Daisy", "Bulldog", 15, Color.WHITE, new Shelter("home", "Osh"), new String[]{"raise hands", "sit down"});
        System.out.println(dog2.printInfo());
        System.out.println(dog3.printInfo());
        System.out.println(dog1.printInfo());
        dog1.makeVoice();
        dog2.makeVoice("gav", 10);
        dog3.makeVoice("gav");
        Flower flower = new Flower("Lilac", new LongevityOfPlants(100, "years"), 4);
        Rose kenyanRose = new Rose("Frutteto", new LongevityOfPlants(2, "weeks"), 45, TypesOfRoses.HYBRID_TEA);
        Rose kordana = new Rose("Kordana", new LongevityOfPlants(28, "days"), 120, TypesOfRoses.MINIATURE);
        System.out.println(flower.printInfo());
        System.out.println(kenyanRose.printInfo());
        System.out.println(kordana.printInfo());
        System.out.println(flower.bloom());
        System.out.println(kenyanRose.bloom(Seasons.SUMMER));
        System.out.println(kordana.bloom(Seasons.SPRING, new LongevityOfPlants(28, "days")));
    }
}