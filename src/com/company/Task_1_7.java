package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by Heorhi_Boika on 1/20/2017.
 */
public class Task_1_7 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double h = 0.0;
        boolean checkNumber = true;
        try {
            System.out.println("Input a");
            a = sc.nextDouble();
            System.out.println("Input b");
            b = sc.nextDouble();
            System.out.println("Input h");
            h = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input number, only real numbers");
            checkNumber = false;
        }
        if (checkNumber) {
            System.out.println(" x " + "       f ");
            for(double i = a;i <= b;i += h){
                double f = Math.pow(Math.sin(i), 2) - Math.cos(2*i);
                System.out.println( i  + " " + f );
            }
        }
    }

}
