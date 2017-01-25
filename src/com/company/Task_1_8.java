package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Heorhi_Boika on 1/20/2017.
 */
public class Task_1_8{

    public static  void  main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = 0;
        int k = 0;
        int[] naturalNumbers;
        boolean checkNumber = true;
        try {
            System.out.println("Input size");
            size = sc.nextInt();
            System.out.println("Input k");
            k = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input number, only real numbers");
            checkNumber = false;
        }catch (NumberFormatException e) {
            System.out.println("Wrong input number, only real numbers");
            checkNumber = false;
        }
        if(checkNumber){
          naturalNumbers = new int[size];
          for(int i = 0;i< naturalNumbers.length;i++){
              naturalNumbers[i] = (int)(1 + Math.random()*100);
              System.out.println(naturalNumbers[i]);
          }
          int sumElements = 0;
            for(int i = 0;i< naturalNumbers.length;i++){
                if(naturalNumbers[i]%k == 0){
                    sumElements += naturalNumbers[i];
                }
            }
            System.out.println("Sum of elements: "+ sumElements);
        }
    }
}
