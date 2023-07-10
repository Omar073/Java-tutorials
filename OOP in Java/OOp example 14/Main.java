// 23- Custom exception example

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            // checkAge(age);
            if (age < 18) {
            throw new AgeException("\n" + "You must be 18+ to sign up");
        } else {
            System.out.println("You are now signed up!");
        }
        } catch (Exception e) {
            System.out.println("A problem occurred: " + e);
        }
    }

    static class AgeException extends Exception {
        AgeException(String message) {
            super(message);
        }
    }
}
