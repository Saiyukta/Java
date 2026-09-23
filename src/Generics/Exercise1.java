package Generics;
//Exercise 1:(1) Use Holders with the typeinfo.pets library to show that a Holders
//that is specified to hold a base type can also hold a derived type.

class Pet {
    public String toString() {
        return "Pet";
    }
}

class Dog extends Pet {
    public String toString() {
        return "Dog";
    }
}

class Holder<T> {
    private T value;

    public Holder(T value) {
        this.value = value;
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        // Holder is specified to hold Pet objects
        Holder<Pet> holder = new Holder<Pet>(new Dog());

        // No cast is needed
        Pet pet = holder.get();

        Holder<Pet> petHolder = new Holder<Pet>(new Pet());

        System.out.println(petHolder.get());

//        System.out.println(pet);
    }
}