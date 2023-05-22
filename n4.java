//A Company manufactures Vehicles, which could be a Helicopter, a Car, or a Train depending on the customer’s demand.
// Each Vehicle instance has a method called move, which prints on the console the nature of movement of the vehicle.
// For example, the Helicopter Flies in Air, the Car Drives on Road and the Train Runs on Track.
// Write a program that accepts input from the user on the kind of vehicle the user wants to order,
// and the system should print out nature of movement. Implement all Java coding best practices to implement this program.

import java.util.Scanner;
public class n4 {

    void move() {
        System.out.println("Undefined movement.");
    }
}

class Helicopter extends n4 {

    void move() {
        System.out.println("The helicopter flies in the air.");
    }
}

class Car extends n4 {

    void move() {
        System.out.println("The car drives on the road.");
    }
}

class Train extends n4 {

    void move() {
        System.out.println("The train runs on the track.");
    }
}

class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the type of vehicle (helicopter/car/train): ");
        String vehicleType = scanner.nextLine().toLowerCase();

        n4 vehicle;
        if (vehicleType.equals("helicopter")) {
            vehicle = new Helicopter();
        } else if (vehicleType.equals("car")) {
            vehicle = new Car();
        } else if (vehicleType.equals("train")) {
            vehicle = new Train();
        } else {
            System.out.println("Invalid vehicle type.");
            return;
        }

        vehicle.move();
    }
}

