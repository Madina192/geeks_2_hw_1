public class Pet {
    private int age;
    private Color color;
    private Shelter shelter = new Shelter("unknown", "unknown address");
    public Pet() {

    }
    public Pet(int age, Color color, Shelter shelter) {
        this.age = age;
        this.color = color;
        this.shelter = shelter;
    }

    public Pet(Color color, Shelter shelter) {
        this.color = color;
        this.shelter = shelter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age < 20) {
            this.age = age;
        } else {
            System.out.println("Ошибка, возраст не действителен");
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    final public String printInfo() {
        return "Pet: age = " + age + ", color = " + color +
                ", shelter = " + shelter.toString();
    }
}
