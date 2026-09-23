package Abstraction;
//Write a Java program to create an abstract class Animal with an abstract method called sound().
// Create subclasses Lion and Tiger that extend the Animal class and
// implement the sound() method to make a specific sound for each animal.
//-------------------------------------------------------------------------------------------------------------
//Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
// Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and
// sleep() methods differently based on their specific behavior.

abstract class Animal{
    public abstract void sound();
    public abstract void eat();
    public abstract void sleep();
}

class Lion extends Animal{
    @Override
    public void sound(){
        System.out.println("Lion's roar");
    }

    @Override
    public void eat(){
        System.out.println("Carnivorous");
    }

    @Override
    public void sleep(){
        System.out.println("Lion sleeps on grassland.");
    }
}

class Tiger extends Animal{
    @Override
    public void sound(){
        System.out.println("Tiger's roar");
    }

    @Override
    public void eat(){
        System.out.println("Carnivorous");
    }

    @Override
    public void sleep(){
        System.out.println("Tiger sleeps in a hidden spot.");
    }
}

class Deer extends Animal{
    @Override
    public void sound(){
        System.out.println("What sound a Deer make?");
    }

    @Override
    public void eat(){
        System.out.println("Herbivorous");
    }

    @Override
    public void sleep(){
        System.out.println("Deer makes a bleating sound.");
    }
}

class Main{
    public static void main(String[] args){
        Animal a = new Lion();
        Animal b = new Tiger();
        Animal c = new Deer();

        a.sound();
        b.sound();
        c.eat();
    }
}