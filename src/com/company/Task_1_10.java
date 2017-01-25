package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1_10 {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int[][] array;
        boolean checkNumber = true;
        try {
            System.out.println("Input size of first array");
            N = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input number, only real numbers");
            checkNumber = false;
        }catch (NumberFormatException e) {
            System.out.println("Wrong input number, only real numbers");
            checkNumber = false;
        }
        if(checkNumber){
            if((N%2==0) & (N > 0)){
                array = new int[N][N];
                for(int i =0;i<array.length;i++){
                    int size = N;
                    int inc;
                    for(int j=0;j<array[i].length;j++){
                        if((i+1)%2!=0){
                            inc = j+1;
                            array[i][j] = inc;
                        }else{
                            array[i][j] = size--;
                        }
                    }
                }
                for(int i =0;i<array.length;i++){
                    for(int j=0;j<array[i].length;j++) {
                    System.out.print(array[i][j]+" ");
                    }
                    System.out.println();
                }
            }else{
                System.out.println("Error, N - even and positive number");
            }
        }
    }
}
