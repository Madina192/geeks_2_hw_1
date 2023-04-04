import java.util.Random;

public class GenerateRandom {

    static int number;
    static int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(1, 20);
    }
}
