import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        while (true) {
            System.out.print("Guess a number between 1 and 100: ");
            int guess = input.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You won!");
                System.out.print("Play again? (y/n): ");
                String playAgain = input.next();

                switch (playAgain) {
                    case "y":
                        secretNumber = random.nextInt(100) + 1;
                        break;
                    case "n":
                        return;
                    default:
                        System.out.println("Please enter 'y' or 'n'");
                        break;
                }
            } else if (guess < secretNumber) {
                System.out.println("Too low! Guess again.");
            } else {
                System.out.println("Too high! Guess again.");
            }
        }
    }
}
