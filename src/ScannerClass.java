import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        // this class from utils initialize the scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a text: ");
        // here using the method nextLine awaits from the input of the user
        // using next it will stop on the first separator so will read only one word
        // In this specific case like the method next don't use the line break
        // the next method will store the first word of the string
        // but like next line will also read the same line
        // and return the rest of the text
        // eg: Hello world two
        // word will store: Hello
        // line will store:  world two
        String word = scan.next();
        System.out.println("word = " + word);

        // using next line it will read the full line until it finds a line break
        String line = scan.nextLine();
        System.out.println("line = " + line);

        // I must close the scanner when I finish to use it
        scan.close();
    }
}
