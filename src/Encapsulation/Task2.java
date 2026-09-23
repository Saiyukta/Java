//Write a Java program to create a class called Smartphone with private instance variables brand, model,
// and storageCapacity.
// Provide public getter and setter methods to access and modify these variables.
// Add a method called increaseStorage() that takes an integer value and increases the storageCapacity by that value.

package Encapsulation;

class Smartphone{
    private String brand;
    private String model;
    private int storageCapacity = 0;

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void increaseStorage(int a){
        storageCapacity += a;
    }
}

class Task2{
    public static void main(String[] args)
    {
        Smartphone iphone13 = new Smartphone();
        iphone13.setStorageCapacity(30);
        System.out.println("Storage Capacity = " + iphone13.getStorageCapacity());
        iphone13.increaseStorage(20);
        System.out.println("Increased Storage Capacity = " + iphone13.getStorageCapacity());
    }
}