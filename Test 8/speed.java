/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_programs_PT;

import java.util.Scanner;

/**
 *
 * @author menaga
 */
public class speed {
    
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the following details of the Car:");
        System.out.println("Speed: ");
        double cs=scanner.nextDouble();
        System.out.println("Number of passengers: ");
        int cp=scanner.nextInt();

        Car car=new Car(cs,cp);

        System.out.println("Enter the following details of the Motor cycle:");
        System.out.println("Speed: ");
        double ms=scanner.nextDouble();
        System.out.println("Number of passengers: ");
        int mp=scanner.nextInt();

        Motorcycle motorcycle = new Motorcycle(ms,mp);

        scanner.close();

        double car_speed = car.calculatespeed();
        double motorcycle_speed = motorcycle.calculatespeed();
        System.out.println("---------------RESULT--------------------");
        System.out.println("Car Speed: "+car_speed);
        System.out.println("Motorcycle Speed: "+motorcycle_speed);

        if (car_speed>motorcycle_speed) 
        {
            System.out.println("Car is faster.");
        } 
        else if (motorcycle_speed>car_speed) 
        {
            System.out.println("Motorcycle is faster.");
        } 
        else 
        {
            System.out.println("Both have the same effective speed.");
        }
    }
}

class Vehicle {
    protected double speed;

    public Vehicle(double speed)
    {
        this.speed=speed;
    }

    public double calculatespeed()
    {
        return speed;
    }
}

class Car extends Vehicle
{
    private int numberOfPassengers;

    public Car(double speed,int numberOfPassengers) 
    {
        super(speed);
        this.numberOfPassengers=numberOfPassengers;
    }

    @Override
    public double calculatespeed() 
    {
        return speed*numberOfPassengers;
    }
}

class Motorcycle extends Vehicle 
{
    private int numberOfWheels;

    public Motorcycle(double speed, int numberOfWheels) 
    {
        super(speed);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public double calculatespeed() 
    {
        return speed * numberOfWheels;
    }
}
