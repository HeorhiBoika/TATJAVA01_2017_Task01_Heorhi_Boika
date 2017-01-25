package com.company;

import java.util.Scanner;

public class Task_1_4 {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double x = 0.0,y = 0.0;
        boolean checkX = false;
        boolean checkY = false;
        boolean checkPoint = false;
        System.out.println("Enter x");
        if(scanner.hasNextDouble()){
            x = scanner.nextDouble();
            checkX = true;
        }
        if(checkX == true){
            System.out.println("Enter y");
            if(scanner.hasNextDouble()){
                y = scanner.nextDouble();
                checkY = true;
            }
            if(checkY == true){
                if((x >= -4) & (x <= 4) & (y >= -3) & (y <=4)){
                    if((x>=-2) & (x<=2) & (y > 0) ){
                        checkPoint = true;
                    }
                   if(y <= 0){
                       checkPoint = true;
                   }
                    if(checkPoint == true){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                }else{
                    System.out.println("-4 <= x <= 4, -3 <= y <=4");
                }
            }else{
                System.out.println("Wrong coordinate y");
            }
        }else{
            System.out.println("Wrong coordinate x");
        }
    }
}
