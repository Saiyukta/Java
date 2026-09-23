package Inheritance;//WAP in Java to create an abstract class Appliance with an abstract method turnOn().
// Create an interface RemoteControl with a method operate().
// Implement these in a class Television.

abstract class Appliance{
    abstract void turnOn();
}

interface RemoteControl{
    void operate();
}

class Television extends Appliance implements RemoteControl{
    @Override
    void turnOn(){
        System.out.println("Turning On");
    }

    @Override
    public void operate(){
        System.out.println("Remote Controlled Television");
    }

    public static void main(String[] args) {
        Television tv = new Television();
        tv.turnOn();
        tv.operate();
    }
}