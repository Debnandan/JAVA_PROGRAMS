import java.util.*;

class UserInputDemo {
    public static void main(String[] args) {
        // Using try-with-resources to ensure the Scanner is closed
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    System.out.print("Enter third number: ");
                    int c = sc.nextInt();
            
                    int total = a + b + c;
                    System.out.println("Total = " + total);
                    
                    // Ask if the user wants to continue
                    System.out.print("Do you want to perform another calculation? (yes/no): ");
                    String response = sc.next();
                    if (!response.equalsIgnoreCase("yes")) {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter integers only.");
                    sc.next(); // Clear the invalid input
                }
            }
        } // note: Scanner is automatically closed here
    }
}

