package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Heorhi_Boika on 1/20/2017.
 */
public class Task_1_5 {

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
            for (int i = 0; i < numbers.length; i++) {
                if (isPositiveNumber(numbers[i])) {
                    System.out.println("Positive number: " + Math.pow(numbers[i], 2));
                } else {
                    System.out.println("Negative number: " + Math.pow(numbers[i], 4));
                }
            }
        }
    }

    public static boolean isPositiveNumber(double number) {
        if (number < 0) {
            return false;
        }
        return true;
    }
}
