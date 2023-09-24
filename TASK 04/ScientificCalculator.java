import java.util.Scanner;

// SCIENTIFIC CALCULATOR
public class ScientificCalculator {

    // Perform basic mathematical operations
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    // Perform trigonometric functions
    public double sin(double angle) {
        return Math.sin(angle);
    }

    public double cos(double angle) {
        return Math.cos(angle);
    }

    public double tan(double angle) {
        return Math.tan(angle);
    }

    // Perform logarithmic functions
    public double log(double num) {
        return Math.log(num);
    }

    public double log10(double num) {
        return Math.log10(num);
    }

    public static void main(String[] args) {
        // Create an instance of the ScientificCalculator class
        ScientificCalculator calculator = new ScientificCalculator();

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform calculations
        double result1 = calculator.add(num1, num2);
        double result2 = calculator.subtract(num1, num2);
        double result3 = calculator.multiply(num1, num2);
        double result4 = calculator.divide(num1, num2);
        double result5 = calculator.sin(num1);
        double result6 = calculator.cos(num1);
        double result7 = calculator.tan(num1);
        double result8 = calculator.log(num1);
        double result9 = calculator.log10(num1);

        // Print the results in a table format
        System.out.println("--------------------------------------------------");
        System.out.println("| Operation     | Result                           |");
        System.out.println("--------------------------------------------------");
        System.out.printf("| Addition      | %-32.2f |\n", result1);
        System.out.printf("| Subtraction   | %-32.2f |\n", result2);
        System.out.printf("| Multiplication| %-32.2f |\n", result3);
        System.out.printf("| Division      | %-32.2f |\n", result4);
        System.out.printf("| Sin           | %-32.2f |\n", result5);
        System.out.printf("| Cos           | %-32.2f |\n", result6);
        System.out.printf("| Tan           | %-32.2f |\n", result7);
        System.out.printf("| Log           | %-32.2f |\n", result8);
        System.out.printf("| Log10         | %-32.2f |\n", result9);
        System.out.println("--------------------------------------------------");

        // Close the scanner
        scanner.close();
    }
}