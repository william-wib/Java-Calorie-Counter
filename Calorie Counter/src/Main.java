import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the calorie counter.\nGive energy per 100 grams and total weight:");
        Scanner scanner = new Scanner(System.in);
        int energy = scanner.nextInt();
        int grams = scanner.nextInt();

        calorieCounter calories = new calorieCounter(energy, grams);
        System.out.println(calories);
    }
}