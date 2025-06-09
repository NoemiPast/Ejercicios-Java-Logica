import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request data from the user
        System.out.print("Enter your height in meters (mt): ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms (kg): ");
        double weight = scanner.nextDouble();

        // Calculate BMI using the class: BMICalculator
        double BMI = BMICalculator.calculateBMI(weight, height);
        String diagnosis = BMICalculator.getDiagnosis(BMI);

        // Show results
        System.out.printf("\nYour BMI is: %.2f%n", BMI); // \n: inserts a new line before printing the text
        // %.2f: Format specifier for two decimal numbers
        System.out.println("Diagnosis: " + diagnosis);

        scanner.close();
    }
}