package Practice;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game!..Enter q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game\nCiao!");
        }
        else {
            System.out.println("You are still playing the game!");
        }
    }
}
