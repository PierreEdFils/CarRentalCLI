package com.careerdevs;

public class RentalService {
    public static void main(String[] args) {
        System.out.println("Welcome to Pierre Car Rental App");

        //traditional array/standard array
        // create list/arr
        Car[] carStorage = new Car[3];

        /*
        1) Honda Accord
        2) Chevy Cruze
        3) Toyota Corolla
         */
        Car car1 = new Car("Honda", "Accord");
        Car car2 = new Car("Chevy ", "Cruze");
        Car car3 = new Car("Toyota ", "Corolla");

        //print car1 make
//        System.out.println(car1.getMake());

        //store obj instance in list/arr
        carStorage[0] = car1;
        carStorage[1] = car2;
        carStorage[2] = car3;

        //how do we list just Rented /Available cars?

        car2.setRented(true);

        //solution (std arr) : iterate through the array , only display cars where isRented is false
        System.out.println(" Available Cars :");
        int listNumber = 1;
        for (int i = 0; i < carStorage.length; i++) {
//            System.out.println(carStorage[i].getMake() + " "+ carStorage[i].getModel());

            if (!carStorage[i].isRented()) {
                System.out.println("(" + listNumber + ") " + carStorage[i].getName());
                listNumber++;
            }

        }
            //output goal
        /*
        Available Cars
        1) Honda Accord
        2) Chevy Cruze
        3) Toyota Corolla
         */
            System.out.println(" All Cars :");

            for (int i = 0; i < carStorage.length; i++) {
////            System.out.println(carStorage[i].getMake() + " "+ carStorage[i].getModel());
                String carStatus;
                if (!carStorage[i].isRented()) {
                    carStatus = " Available";
                } else {

                    carStatus = " Unavailable";
                }
                System.out.println("(" + (i + 1) + ") " + carStorage[i].getName() + "(" + carStatus + ")");
            }

    }
}
