package Abstraction;//Write a Java program to create an abstract class Employee with
// abstract methods calculateSalary() and displayInfo().
// Create subclasses Manager and Programmer that extend the Employee class and
// implement the respective methods to calculate salary and display information for each role.

abstract class Employee {
    private String name;
    public abstract double calculateSalary();
    public abstract String displayInfo();
    public  Employee (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class Manager extends Employee{
    private double salary;
    private double bonus;

    public Manager(String name, double salary, double bonus){
        super(name);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return salary + bonus;
    }

    @Override
    public String displayInfo(){
        return getName();
    }
}

class Programmer extends Employee{
    private double hour;
    private double wagePerHour;

    public Programmer(String name, double hour, double wagePerHour){
        super(name);
        this.hour = hour;
        this.wagePerHour = wagePerHour;
    }

    @Override
    public double calculateSalary(){
        return hour * wagePerHour;
    }

    @Override
    public String displayInfo(){
        return getName();
    }

}

class Task4{
    public static void main(String[] args){
        Employee A = new Manager("John", 20000, 10000);
        System.out.println(A.calculateSalary());
        System.out.println(A.displayInfo());

        Employee B = new Programmer("Snow", 40, 100);
        System.out.println(B.calculateSalary());
        System.out.println(B.displayInfo());
    }
}