package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by Heorhi_Boika on 1/20/2017.
 */
public class Task_1_6{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[3];
        boolean checkNumber = true;
        try {
            System.out.println("Input three numbers");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = sc.nextDouble();
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input number, only real numbers");
            checkNumber = false;
        }
        if (checkNumber) {
            System.out.println("Sum of min and max value: " + (minValue(numbers) + maxValue(numbers)));
        }
    }

    public static double minValue(double[] numbers) {
        double minVal = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (minVal > numbers[i]) {
                minVal = numbers[i];
            }
        }
        return minVal;
    }

    public static double maxValue(double[] numbers) {
        double maxVal = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (maxVal < numbers[i]) {
                maxVal = numbers[i];
            }
        }
        return maxVal;
    }
}
