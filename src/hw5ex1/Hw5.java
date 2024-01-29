package hw5ex1;

import java.util.Random;
import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(101);
        System.out.println("Let the game begin!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        while (true) {
            System.out.print("Enter a number between 0 and 100: ");
            int guess = scanner.nextInt();
            if (guess < numberToGuess) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.printf("Congratulations, %s!%n", name);
                break;
            }
        }
    }
}
