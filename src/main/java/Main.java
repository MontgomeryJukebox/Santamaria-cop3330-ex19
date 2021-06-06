import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
public class Main {

    public static double bmi(int weight, int height) {
        return ((double) weight / (height * height)) * 703;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the weight?");
        int weight = in.nextInt();
        System.out.print("What is the height?");
        int height = in.nextInt();
        double bmi = bmi(weight, height);
        System.out.printf("Your BMI is %.1f\n", bmi);
        if (bmi <= 18.5) {
            System.out.println("You are underweight.");
        } if (bmi >= 25) {
            System.out.println("You are overweight. You should see your doctor.");
        } else {
            System.out.println("You are within the ideal weight range.");
        }
    }
}
