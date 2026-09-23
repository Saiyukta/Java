//Write a Java program to create a class called Shape with a method called getArea().
//Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
//----------------------------------------------------------------------------------------------------------------------------------
//WAP in Java to create a class Shape with a method area().
// Extend this class to Rectangle and Circle classes, implementing the area() method.
// Create an array of different shapes and calculate their areas.
//----------------------------------------------------------------------------------------------------------------------------------
//WAP in Java to create an abstract class Shape with an abstract method area().
// Extend this class to Rectangle and Circle classes, providing implementations for the area() method.

package Inheritance;

abstract class Shape{
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
   private double w;
   private double h;

//    Rectangle(double w, double h) {
//        this.w = w;
//        this.h = h;
//    }

    public double getWidth(){
        return w;
    }

    public double getHeight(){
        return h;
    }

    public void setWidth(double w){
        this.w = w;
    }

    public void setHeight(double h){
        this.h = h;
    }

    @Override
    double getArea(){
        return w * h;
    }
}

public class Circle extends Shape {
  private double radius;

    @Override
    double getArea(){
        return Math.PI * radius * radius;
    }

    double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

    void setRadius(double radius){
        this.radius = radius;
    }

    double getRadius(){
        return radius;
    }
}

class Task3{
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        System.out.println(rectangle.getArea());

        Circle circle = new Circle();
        circle.setRadius(10);
        System.out.println(circle.getArea());
        System.out.println(circle.calculatePerimeter());




//      Shape[] shapes = {
//              new Rectangle(),
//              new Circle(10)
//      };
//
//      for(Shape shape: shapes){
//
//          System.out.println("Area: " + shape.getArea());
//      }
    }}

