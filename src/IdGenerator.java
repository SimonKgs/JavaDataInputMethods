import java.util.Random;
import java.util.Scanner;

public class IdGenerator {
    public static void main(String[] args) {

        // generate a unique ID
        // TWO FIRST LETTERS ON UPPERCASE FROM NAME AND SURNAME
        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER YOUR NAME:");
        String userName = scan.nextLine();
        String userToId = userName.trim().substring(0, 2).toUpperCase();

        System.out.println("ENTER YOUR SURNAME:");
        String surname = scan.nextLine();
        String surnameToId = surname.trim().substring(0, 2).toUpperCase();

        // ALSO 2 LAST DIGITS FROM THE YEAR
        System.out.println("ENTER YOUR BIRTH YEAR:");
        String birthYear = scan.nextInt() + "";
        String yearToId = birthYear.trim().substring(birthYear.length() - 2);

        // GENERATE A NUMBER BETWEEN 1 and 9999
        // IF IT DOESN'T HAVE 4 NUMBERS IT WILL FILL IT BY ZEROS
        Random randomNumber = new Random();
        int random = randomNumber.nextInt(9999) + 1;

        // %04 indicates that this will be 4 digits and completed with 0s
        String randomToId = String.format("%04d", random);

        // my way without methods works but much better to read and maintain with String.format
        // adding 0s to fill the four numbers
        // if (random < 10) {
        //     randomToId = "000" + random;
        // } else if (random < 100) {
        //     randomToId = "00" + random;
        // } else if (random < 1000) {
        //     randomToId = "0" +random;
        // } else {
        //     randomToId = random + "";
        // }
        
        String uniqueId = String.join("", userToId, surnameToId, yearToId, randomToId);

        System.out.println("uniqueId = " + uniqueId);


    }
}
