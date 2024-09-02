public class StringFormatting {
    public static void main(String[] args) {
        String name = "simon";
        int age = 35;
        float salary = 12.12f;
        
        
        // string format
        String message = String.format("Name: %s, age: %d, salary: %.2f", name, age, salary);
        System.out.println("message = " + message);


    }
}
