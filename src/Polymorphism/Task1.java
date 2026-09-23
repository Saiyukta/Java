package Polymorphism;//Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine().
// Create two subclasses Car and Motorcycle. Override the startEngine() and
// stopEngine() methods in each subclass to start and stop the engines differently.

class Vehicle {
    public void startEngine(){
        System.out.println("Starting Vehicle's Engine");
    }

    public void stopEngine(){
        System.out.println("Stoping Vehicle's Engine");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine(){
        System.out.println("Starting Car's Engine");
    }

    @Override
    public void stopEngine(){
        System.out.println("Stoping Car's Engine");
    }
}

class MotorCycle extends Vehicle {
    @Override
    public void startEngine(){
        System.out.println("Starting MotorCycle's Engine");
    }

    @Override
    public void stopEngine(){
        System.out.println("Stoping MotorCycle's Engine");
    }
}

class Task1 {
    public static void main(String[] args){
        Vehicle car = new Car();
        Vehicle motorcycle = new MotorCycle();

        car.startEngine();
        motorcycle.startEngine();

    }
}