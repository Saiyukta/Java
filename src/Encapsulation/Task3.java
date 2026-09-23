//Write a Java program to create a class called House with
// private instance variables address, numberOfRooms, and area.
//Provide public getter and setter methods to access and modify these variables.
// Add a method called calculatePrice() that returns the price of the house
// based on its area and a price per square meter.

package Encapsulation;

class House{
    private String address;
    private int numberOfRooms;
    private double area;

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public double calculatePrice(double area, double pricePerSquareMeter){
        return area * pricePerSquareMeter;
    }
}

class Task3{
    public static void main(String[] args){
        House a = new House();

        System.out.println( a.calculatePrice(10, 20));
    }
}