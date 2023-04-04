final public class Dog extends Pet{
    private String name;
    private String breed;
    private String[] commands;

    public Dog(){
        super();
    }

    public Dog(String name, String breed, int age, Color color, Shelter shelter) {
        super(age, color, shelter);
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name, String breed, int age, Color color, Shelter shelter, String[] commands) {
        super(age, color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice(String voice, int number) {
        for (int i = 0; i <= number; i++) {
            System.out.print(voice + "-");
        }
        System.out.println();
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    public void makeVoice() {
        System.out.println("GAV");
    }
}
