package com.company;

import java.util.Scanner;

public class Task_1_3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        double cathA = 0.0;
        double cathB = 0.0;
        boolean checkA = false;
        boolean checkB = false;
        System.out.println("Input cathetus a");
        if (sc.hasNextDouble()) {
            cathA = sc.nextDouble();
            checkA = true;
        }
        if (checkA == true) {
            System.out.println("Input cathetus b");
            if (sc.hasNextDouble()) {
                cathB = sc.nextDouble();
                checkB = true;
            }
            if (checkB == true) {
                if ((cathA > 0) & (cathB > 0)) {
                    System.out.println("Square = " + squareTriangle(cathA, cathB));
                    System.out.println("Perimeter = " + perimeterTriangle(cathA, cathB, lenthHypotenuse(cathA, cathB)));
                } else {
                    System.out.println("Incorrect input");
                }
            } else {
                System.out.println("Wrong number b");
            }
        } else {
            System.out.println("Wrong number a");
        }
    }

    public static double lenthHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static double squareTriangle(double a, double b) {
        return (a * b / 2);
    }

    public static double perimeterTriangle(double a, double b, double c) {
        return (a + b + c);
    }
}
