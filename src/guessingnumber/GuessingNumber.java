package guessingnumber;
import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {

  
    public static void main(String[] args) {
        
        // Generate a random number
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the guessting numbers game!\n");
        int number = random.nextInt(100) + 1;

        int totalGuess = 0;

        while (true) {
            System.out.println("Please enter your guess number (1 to 100)");
            int playerGuess = scanner.nextInt();
            totalGuess++;

            if (playerGuess == number) {
                System.out.println("Correct! You win!!");
                System.out.println("You have tried " + totalGuess + " times");
                System.out.print("Do you want to play another round? (yes/no): ");
                String playAgain = scanner.next();

                if (!playAgain.equalsIgnoreCase("yes")) {
                    break; // Exit the loop only if the user enters "no"
                }

                // Generate a new random number for the next round
                number = random.nextInt(100) + 1;
                totalGuess = 0; // Reset the guess count for the new round
            } else if (number > playerGuess) {
                System.out.println("Wrong! The number is lower. Try again");
            } else {
                System.out.println("No! The number is higher. Try again");
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    

    }
}
