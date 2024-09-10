package com.vehicle.test;

import com.vehicle.car;
import com.vehicle.ElectricCar;

public class vehicletest {
    public static void main(String[] args) {

        car car = new car();
        ElectricCar electricCar = new ElectricCar();


        car.setSpeed(100.0);
        car.setFuelLevel(50.0f);
        electricCar.setSpeed(80.0);
        electricCar.setFuelLevel(60.0f);
        electricCar.setBatteryLevel(80.0);


        car.drive(5000);
        electricCar.drive(10000);


        System.out.println("Car Speed: " + car.getSpeedMph() + " mph");
        System.out.println("Car Distance Traveled: " + car.getDistanceKm() + " km");
        System.out.println("Car Remaining Fuel: " + car.calculateRemainingFuel(5.0) + "%");

        System.out.println("Electric Car Speed: " + electricCar.getSpeedMph() + " mph");
        System.out.println("Electric Car Distance Traveled: " + electricCar.getDistanceKm() + " km");
        System.out.println("Electric Car Remaining : " + electricCar.calculateRemainingFuel(10.0) + "%");
        System.out.println("Electric Car Battery Level: " + electricCar.getBatteryLevel() + "%");
    }
}
