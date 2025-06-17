import java.util.Scanner;

public class SwapWithTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();

        // Displaying before swap
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Displaying after swap
        System.out.println("After swapping: a = " + a + ", b = " + b);

        sc.close(); // Closing the scanner (good practice)
    }
}

