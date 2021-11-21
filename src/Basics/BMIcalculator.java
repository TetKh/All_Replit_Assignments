package Basics;

public class BMIcalculator {

    public static void main(String[] args) {
BMIcalculator(90, 1.8);

    }

    public static void BMIcalculator(double weight, double height) {
        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Your BMI is " + bmi + " and you are underweight!");
        } else if (bmi >= 18.5 && bmi < 25){
            System.out.println("Your BMI is " + bmi + " and you are normal!");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Your BMI is " + bmi + " and you are overweight!");
        } else if (bmi >= 30)
            System.out.println("Your BMI is " + bmi + " and you are obese!");
    }

}