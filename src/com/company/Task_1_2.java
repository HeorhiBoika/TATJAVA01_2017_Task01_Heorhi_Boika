package com.company;

import java.util.Scanner;

public class Task_1_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Input A");
        double numberA = 0.0;
        boolean checkA = false;
        if (sc.hasNextDouble()) {
            numberA = sc.nextDouble();
            checkA = true;
        }
        if (checkA == true) {
            double numberB = 0.0;
            boolean checkB = false;
            System.out.println("Input B");
            if (sc.hasNextDouble()) {
                numberB = sc.nextDouble();
                checkB = true;
            }
            if (checkB == true) {
                double numberC = 0.0;
                boolean checkC = false;
                System.out.println("Input C");
                if (sc.hasNextDouble()) {
                    numberC = sc.nextDouble();
                    checkC = true;
                }
                if (checkC == true) {
                    System.out.println("Result = " + resultCalculateExpression(numberA, numberB, numberC));
                } else {
                    System.out.println("Wrong number c");
                }
            } else {
                System.out.println("Wrong number b");
            }
        } else {
            System.out.println("Wrong number a");
        }
    }

    public static double resultCalculateExpression(double a, double b, double c) {
        return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
    }

}
