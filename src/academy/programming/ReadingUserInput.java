package academy.programming;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt(); // hasNextInt is to check if it is a number or not

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // Handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2022 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years olds.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close(); // close it after using
    }
}
