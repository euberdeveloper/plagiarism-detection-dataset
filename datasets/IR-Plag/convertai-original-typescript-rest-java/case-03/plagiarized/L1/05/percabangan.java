package IR;

import java.util.Scanner;

public class percabangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();//inputan weight
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();//inputan feet
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();//inputan inches
        double height = feet * 12 + inches;// menghitung tinggi       
        double bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254)); //menghitung BMI
        //menampilkan hasil
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
