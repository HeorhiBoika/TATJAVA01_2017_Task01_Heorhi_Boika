package com.company;

import java.util.Scanner;

public class Task_1_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Input four-digit number");
        Scanner sc = new Scanner(System.in);
        int number;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
            int sumFirstTwoNumbers = 0;
            int sumSecondTwoNumbers = 0;
            if ((number > 999) && (number < 10000)) {
                while (number > 0) {
                    if (number > 99) {
                        sumSecondTwoNumbers += number % 10;
                    } else {
                        sumFirstTwoNumbers += number % 10;
                    }
                    number /= 10;
                }

                if (sumFirstTwoNumbers == sumSecondTwoNumbers) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            }else{
                System.out.println("Wrong Number, 999 < number < 10000 ");
            }
        } else {
            System.out.println("Enter only integer number");
        }

    }


}

