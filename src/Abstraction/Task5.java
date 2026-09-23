package Abstraction;
//Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume()
// and calculateSurfaceArea().
// Create subclasses Sphere and Cube that extend the Shape3D class and
// implement the respective methods to calculate the volume and surface area of each shape.

abstract class Shape3D{
    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
}

class Sphere extends Shape3D{
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * (radius * radius);
    }
}

class Cube extends Shape3D{
    private double sideLength;

    public Cube(double sideLength){
        this.sideLength = sideLength;
    }

    @Override
    public double calculateVolume() {
        return sideLength * sideLength * sideLength;

    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }
}

class Task5{
    public static void main(String[] args){
        Shape3D sphere = new Sphere(20);
        Shape3D cube = new Cube(10);

        System.out.println(sphere.calculateSurfaceArea());
        System.out.println(cube.calculateSurfaceArea());
        System.out.println(sphere.calculateVolume());
        System.out.println(cube.calculateVolume());
    }
}