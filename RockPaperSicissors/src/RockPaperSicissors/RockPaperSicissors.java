package RockPaperSicissors;
import java.util.*;
public class RockPaperSicissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice: ");
        System.out.println("0: Rock");
        System.out.println("1: Paper");
        System.out.println("2: Scissors");
        int userChoice = scanner.nextInt();
        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid input! Please choose 0, 1, or 2.");
            return;
        }
        int computerChoice = random.nextInt(3);
        System.out.println("Your choice: " + choices[userChoice]);
        System.out.println("Computer's choice: " + choices[computerChoice]);
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 0 && computerChoice == 2) || 
                   (userChoice == 1 && computerChoice == 0) || 
                   (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
