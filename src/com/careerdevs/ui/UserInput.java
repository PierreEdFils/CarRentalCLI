package com.careerdevs.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
     private static Scanner scanner = new Scanner(System.in);

     public static String readString(String question) {
         System.out.print(question+"\nInput :");
          return  scanner.nextLine();
     }

     public static int readInt (String question){
         while (true){
             System.out.print(question+"\nNumber :");

             try{

                 int temp = scanner.nextInt(); //exception risks
                 scanner.nextLine();
                 return temp;

             } catch(InputMismatchException e){
                 System.out.println("You must enter an integer, try again");

             }


         }


     }
}
