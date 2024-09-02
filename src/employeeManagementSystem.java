import java.util.Scanner;

public class employeeManagementSystem {
    public static void main(String[] args) {
        // make a program to get data from a user then print them on terminal
        Scanner scan = new Scanner(System.in);

        // in this case like there is a line with a break between each scanner I don't need to force the break line
        System.out.println("Insert your name:");
        String name = scan.nextLine();
        System.out.println("Insert your age:");
        int age = scan.nextInt();
        System.out.println("Insert your salary:");
        double salary = scan.nextDouble();
        System.out.println("are you boss of some department?: ");
        boolean isBossOfDepartment = scan.nextBoolean();

        System.out.printf("""
                
                Employee name: %s
                age: %d
                salary: %.2f
                is boss: %b
                
                """, name, age, salary, isBossOfDepartment);
    }
}
