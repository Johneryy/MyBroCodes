package Chapter2;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first score  ->");
        int firstscore = input.nextInt();
        System.out.println("Enter your second score ->");
        int num2 = input.nextInt();

        int Total = firstscore + num2;
        System.out.println("Your score is "+Total);

    }
}
