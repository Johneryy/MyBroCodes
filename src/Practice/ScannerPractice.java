package Practice;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you "+name+"?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your favorite food "+name+" ?");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("Your favorite food is "+food);
    }

}
