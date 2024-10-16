import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter 1 for Addition \n" +
                        "Enter 2 for Subtraction \n" +
                        "Enter 3 for Multiplication \n" +
                        "Enter 4 for Division \n" +
                        "Enter: ");

        int operation = sc.nextInt();

        if (operation < 1 || operation > 4) {
            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            sc.close();
            return;
        }
        
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Sum = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication = " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Division = " + ((double) num1 / num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
        }
        sc.close();
    }
}
