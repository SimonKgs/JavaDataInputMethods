import java.util.Scanner;

public class KitchenRecipes {
    public static void main(String[] args) {
        // Make a program with ask for some a recipe
        // It should ask for the name, ingredients, time of preparation and difficulty
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert the name of the recipe:");
        String recipe = scan.nextLine();
        System.out.println("Insert the ingredients separated by coma\",\":");
        String ingredients = scan.nextLine();
        System.out.println("Insert the time of preparation in minutes:");
        int timeOfPreparation = Integer.parseInt(scan.nextLine());
        System.out.println("difficulty (\"easy\", \"medium\", \"hard\"): ");
        String difficulty = scan.nextLine();

        System.out.printf("""
                
                ****************
                
                Name: %s
                Ingredients: %s
                time of preparation: %d minutes
                difficulty: %s
                
                ****************
                
                """, recipe, ingredients, timeOfPreparation, difficulty);




    }
}
