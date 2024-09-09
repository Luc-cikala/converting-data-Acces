package com.vehicle.test;
import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class VehicleTest {

    public static void main(String[] args) {
       
        Car myCar = new Car();
        car.setSpeed(speed:120);
        car.setFuelLevel(fuel:100);
        car.drive(drive:100000);


        System.out.println(x"car:");
        System.out.println("car speed in (MPH: " + car.getSpeedMph());
        System.out.println("Remaining Fuel: " + car.calculateRemainingFuel(distance:5));

        ElectricCar myElectricCar = new ElectricCar();
        electricCar.setSpeed(speed:100);
        electricCar.setFuelLevel(fuel:100); 
        electricCar.setBatteryLevel(battery:100); 
        electricCar.drive(distance:100000);

        System.out.println(x:"ElectricCar:");
        System.out.println("Electric car Speed in (MPH): " + electricCar.getSpeedMph());
        System.out.println("Electric car Distance in (km): " + electricCar.getDistanceKm());
        System.out.println("Remaining Battery: " + electricCar.getBatteryLevel() + "%");
    }
}
