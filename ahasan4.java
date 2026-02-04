import java.util.Scanner;

public class ahasan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display menu
        System.out.println("Menu:");
        System.out.println("1. Inspirational Quote");
        System.out.println("2. Fun Fact");
        System.out.println("3. Programming Joke");
        System.out.println("4. Movie Quote");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = scanner.nextInt();
        
        // Display different saying based on user's choice
        if (choice == 1) {
            System.out.println("The only way to do great work is to love what you do. - Steve Jobs");
        } else if (choice == 2) {
            System.out.println("Did you know? Honey never spoils. Archaeologists have found 3000-year-old honey in Egyptian tombs that's still edible!");
        } else if (choice == 3) {
            System.out.println("Why do programmers prefer dark mode? Because light attracts bugs!");
        } else if (choice == 4) {
            System.out.println("May the Force be with you. - Star Wars");
        } else {
            System.out.println("Invalid choice! Please choose a number between 1 and 4.");
        }
        
        scanner.close();
    }
}
