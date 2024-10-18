import java.util.*;

public class CalculatorUsingFunction {
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
                System.out.println("Sum = " + Addition(num1, num2));
                break;
            case 2:
                System.out.println("Subtraction = " + Subtraction(num1, num2));
                break;
            case 3:
                System.out.println("Multiplication = " + Multiplication(num1, num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Division = " + Division(num1, num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
        }
        sc.close();
    }

    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static double Division(int num1, int num2) {
        return (double) num1 / num2;
    }
}
