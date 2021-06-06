import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
public class Main {

    static Scanner in = new Scanner(System.in);

    public static double bmi(int weight, int height) {
        return ((double) weight / (height * height)) * 703;
    }

    public static int ensure_number() {
        while (true) {
            try {
                return in.nextInt();
            } catch (Exception e) {
                System.out.println("You must enter a numeric value!");
                in.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("What is the weight?");
        int weight = ensure_number();
        System.out.print("What is the height?");
        int height = ensure_number();
        double bmi = bmi(weight, height);
        System.out.printf("Your BMI is %.1f\n", bmi);
        if (bmi <= 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 25) {
            System.out.println("You are overweight. You should see your doctor.");
        } else {
            System.out.println("You are within the ideal weight range.");
        }
        in.close();
    }
}
