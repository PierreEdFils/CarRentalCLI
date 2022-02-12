package com.careerdevs;

import com.careerdevs.classdemo1.UI;
import com.careerdevs.ui.UserInput;

import java.util.ArrayList;

public class RentalServiceTwo {
        static ArrayList <Car> availableCars = new ArrayList<>();
        static ArrayList <Car> rentedCars = new ArrayList<>();


    public static void main(String[] args) {



        Car car1 = new Car("Honda", "Accord");
        Car car2 = new Car("Chevy ", "Cruze");
        Car car3 = new Car("Toyota ", "Corolla");


        availableCars.add(car1);
        availableCars.add(car3);
        availableCars.add(car2);

        mainMenu();
//        "1) Rent"

        //  "2) Return "






    }
    public static void mainMenu() {
        System.out.println(" Welcome to Java Car Rentals  :");

        System.out.println("Would you like to...");
        System.out.println("1) Rent");
        System.out.println("2) Return ");
        System.out.println("3) Exit ");
        int userSelection  = UI.readInt("Select an option ",1,3);

        if(userSelection==1){
            rentalMenu();
        } else if (userSelection==2){
            returnMenu();
        } else {
            System.out.println(" Exit ");
        }





    }
    public static void rentalMenu() {


            System.out.println(" Available Cars :");
            for (int i = 0; i < availableCars.size() ; i++) {
                System.out.println("(" + (i + 1) + ") " + availableCars.get(i).getName());
//            System.out.println("(" + listNumber + ") " + carStorage[i].getName());

            }
            //        while (true){
//
//
//         int userSelection = UserInput.readInt("Enter a number to select the car you'd like to rent");
//
//
//        if (userSelection <= availableCars.size()) {
//
//            System.out.println(" Thank you! You are now renting  " +availableCars.get(userSelection -1).getName());
//
//        }
//        else {
//            System.out.println("Car selection invalid, please try again ");
//
//
//        }
//
//
//
//
//    }
           int  userSelection = UI.readInt("Enter a number to select the car you'd like to rent",1,3);

//        rentedCars.add(availableCars.get(userSelection-1));
//        availableCars.remove(userSelection-1);
//
//            System.out.println("Car selection invalid, please try again ");

            if (userSelection <= availableCars.size()) {

                System.out.println(" Thank you! You are now renting  " +availableCars.get(userSelection -1).getName());
                rentedCars.add( availableCars.get(userSelection -1));
                availableCars.remove(userSelection-1);

            }
            else {
                System.out.println("Car selection invalid, please try again ");


            }
        mainMenu();


    }
    public static void returnMenu() {
        for (int i = 0; i < rentedCars.size() ; i++) {

            System.out.println("(" + (i + 1) + ") "+ rentedCars.get(i).getName());
        }
       int  userSelection = UI.readInt("Enter a number to select the car you'd like to return",1,3);

        if (userSelection <= rentedCars.size()) {

            System.out.println(" Thank you, you have returned   " +rentedCars.get(userSelection -1).getName());
            availableCars.add( rentedCars.get(userSelection -1));
            rentedCars.remove(userSelection-1);

        }
        else {
            System.out.println("Car selection invalid, please try again ");


        }
        mainMenu();
    }


}
