package Inheritance;

//WAP in Java to create a class Animal with a method sound().
// Extend this class to Dog and Cat classes, overriding the sound() method to make respective animal sounds.
//----------------------------------------------------------------------------------------------------------------------
//WAP in Java to create a class Animal with a method eat().
// Extend this class to Mammal and override the eat() method.
// Further extend Mammal to Dog and override the eat() method again.

 class Animal {
     void sound() {
         System.out.println("animal sound");
     }

     void eat(){
         System.out.println("eat");
     }
 }

 class Mammal extends Animal {
     @Override
     void eat(){
         System.out.println("Mammals can eat");
     }
 }

class Dog extends Mammal {
    @Override
    void eat() {
        System.out.println("Dogs can eat");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("meow!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        cat.sound();
    }
}