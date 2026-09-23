package Abstraction;
//Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine().
// Create subclasses Car and Motorcycle that extend the Vehicle class and
// implement the respective methods to start and stop the engines for each vehicle type.

abstract class Vehicle{
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle{

    @Override
    public void startEngine() {
        System.out.println("Starting Car Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stoping Car Engine");
    }
}

class MotorCycle extends Vehicle{

    @Override
    public void startEngine() {
        System.out.println("Starting MotorCycle Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stoping MotorCycle Engine");
    }
}

class Task6{
    public static void main(String[] args){
        Vehicle a = new Car();
        Vehicle b = new MotorCycle();

        a.startEngine();
        a.stopEngine();

        b.startEngine();
        b.stopEngine();
    }
}