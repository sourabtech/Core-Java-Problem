package LabProgram;


class Vehicle {  //Parent class Vehicle
 public void drive() {
     System.out.println("Repairing a vehicle");
 }
}



class Car extends Vehicle {  //Child class Car
 @Override
 public void drive() {
     System.out.println("Repairing a car");
 }
}


public class ReppairingCar { //Main class
 public static void main(String[] args) {
     Vehicle vehicle = new Vehicle();
     Car car = new Car();
     vehicle.drive(); //  Repairing a vehicle
     car.drive(); //  Repairing a car
 }

}


