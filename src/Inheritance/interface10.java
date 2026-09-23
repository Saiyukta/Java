package Inheritance;

//WAP in Java to create an interface Vehicle with a default method start().
// Implement this interface in a class Car and override the start() method.

interface Vehcle{
    void start();
}

class Cor implements Vehcle{
   @Override
   public void start(){
       System.out.println("Car start");
   }
}

//WAP in Java to create two interfaces Printable and Showable, both with a method print().
//Implement these interfaces in a class Document and override the print() method.

interface Printable {
    void print();
}

interface Showable {
    void print();
}

class Document implements Printable, Showable{
    @Override
    public void print(){
        System.out.println("This document is printable");
    }
    public static void main(String[] args) {
    Document doc = new Document();
    doc.print();

        Cor car = new Cor();
        car.start();
    }



}

