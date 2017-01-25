package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1_9 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int sizeArrayFirst = 0;
        int sizeArraySecond = 0;
        int k = 0;
        int[] arraysFirst;
        int[] arraysSecond;
        boolean checkNumber = true;
        try {
            System.out.println("Input size of first array");
            sizeArrayFirst = sc.nextInt();
            System.out.println("Input size of second array");
            sizeArraySecond = sc.nextInt();
            System.out.println("Input k");
            k = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input number, only real numbers");
            checkNumber = false;
        } catch (NumberFormatException e) {
            System.out.println("Wrong input number, only real numbers");
            checkNumber = false;
        }
        if (checkNumber) {
            if ((k < sizeArrayFirst) & (sizeArrayFirst > 0) & (sizeArraySecond > 0)) {
                arraysFirst = new int[sizeArrayFirst];
                arraysSecond = new int[sizeArraySecond];
                for (int i = 0; i < arraysFirst.length; i++) {
                    arraysFirst[i] = (int) (1 + Math.random() * 100);
                    System.out.print(arraysFirst[i] + " ");
                }
                System.out.println();
                for (int i = 0; i < arraysSecond.length; i++) {
                    arraysSecond[i] = (int) (1 + Math.random() * 100);
                    System.out.print(arraysSecond[i] + " ");
                }
                System.out.println();
                int[] unionArray = new int[(sizeArrayFirst + sizeArraySecond)];
                for (int i = 0; i <= k; i++) {
                    unionArray[i] = arraysFirst[i];
                }
                for (int i = 0; i < sizeArraySecond; i++) {
                    unionArray[k + i + 1] = arraysSecond[i];
                }
                for (int i = k + 1; i < sizeArrayFirst; i++) {
                    unionArray[sizeArraySecond + i] = arraysFirst[i];
                }
                for (int i = 0; i < unionArray.length; i++) {
                    System.out.print(unionArray[i] + " ");
                }
            } else {
                System.out.println("Error, sizeFirstArray > 0, sizeSecondArray > 0, k < sizeFirstArray");
            }
        }
    }
}
