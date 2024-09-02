import java.util.Scanner;

public class ReadingTypes {
    public static void main(String[] args) {
        // Reading an int
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert your age:");
        // this will let us insert only int numbers
        // if we try to insert others like a text will throw an error:
        // InputMismatchException
        int age = scan.nextInt();
        System.out.println("age = " + age);


        // double
        System.out.println("Insert your height:");
        double height = scan.nextDouble();
        System.out.println("height = " + height);


        // to use next line before one of the methos without a break line at the end
        // I must create a line break
        scan.nextLine();


        // Data conversion
        // we can make conversion with different types like:
        System.out.println("Insert an integer:");
        int intString = Integer.parseInt(scan.nextLine());
        System.out.println("realInteger = " + intString);

        System.out.println("Insert an float:");
        float floatString = Float.parseFloat(scan.nextLine());
        System.out.println("realInteger = " + floatString);

        // there are more like ....
        // Double.parseDouble();
        // Boolean.parseBoolean();

        scan.close();

    }
}
