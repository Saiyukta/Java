package Inheritance;
//WAP in Java to create a Vehicle class with a constructor that takes make and model.
// Extend this class to a Car class and add a property year. Use the super keyword to call the parent class constructor.

class Vehicle{
   private String company_name;
   private String model_name;
   private final double mileage;
   private int year;

    Vehicle(String company_name, String model_name, double mileage, int year){
        this.company_name = company_name;
        this.model_name = model_name;
        this.mileage = mileage;
        this.year = year;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setModel_name(String model_name){
        this.model_name = model_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public double getMileage() {
        return mileage;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

class Car extends Vehicle{

    Car(String company_name, String model_name, double mileage, int year){
        super(company_name, model_name, mileage, year);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 27, 2025);
        System.out.println(car.getCompany_name() + " " + car.getModel_name() +  " " + car.getMileage());
    }
}

