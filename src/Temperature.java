import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f, c;

        System.out.print("Enter temperature in Fahrenheit: ");
        f = sc.nextFloat();

        c = (f - 32) * 5 / 9; // Conversion formula
        System.out.println("Temperature in Celsius = " + c);
    }
}

