import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println("*** Random numbers ***");
        Random random = new Random();

        // Generate a random number between 0 and 9
        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber = " + randomNumber);


        // generate a random between 3 and 10
        // the random method generate a number between 0 and 7
        // min number is 3, the min numbers is 0 + 3
        // max number is 10 because the mas is 7 + 3
        int randomNumber2 = random.nextInt(8) + 3;
        System.out.println(randomNumber2);
        
        
        // generate a float between 0.0 and 1.0
        float floatNumber = random.nextFloat();
        System.out.println("floatNumber = " + floatNumber);


        // simulate a dice
        int dice = random.nextInt(6) + 1;
        System.out.println("dice = " + dice);


    }
}
