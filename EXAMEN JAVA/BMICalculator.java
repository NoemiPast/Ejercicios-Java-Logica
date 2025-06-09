/*Ask the user for his weight (kg) and height (mt).
Calculate the Body Mass Index (BMI) and give a diagnosis based on:
- Less than 18.5: Underweight
- 18.5 - 24.9: Normal weight
- 25 - 29.9: Overweight
- 30 or more: Obesity
*/

public class BMICalculator {

    //Calculate BMI receiving two parameters
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height); //It returns the result
    }

    //It's giving the result based on BMI
    public static String getDiagnosis(double BMI) {
        if (BMI < 18.5) {
            return "Low weight";
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            return "Normal weight";
        } else if (BMI >= 25 && BMI <= 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}