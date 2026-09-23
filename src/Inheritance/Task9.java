//WAP in Java to create a class Employee with a method calculateSalary().
// Extend this class to PermanentEmployee and ContractEmployee,
// overriding the calculateSalary() method to calculate salaries differently.
package Inheritance;

class Employe{
    private int id;
    private String name;
    private double salary;

    Employe(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    double calculateSalary(){
        return 0;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public String getFormattedSalary(){
        return String.format("$%.2f", this.salary);
    }
}

class PermanentEmployee extends Employe{
    double annualSalary;

    PermanentEmployee(String name,int id, double salary, double annualSalary){
        super(name,id,salary);
        this.annualSalary = annualSalary;
    }

    @Override
    double calculateSalary(){
        return annualSalary/12;
    }
}

class ContractEmployee extends Employe{
    double hours;
    double wages;

    ContractEmployee(String name,int id, double salary, double hours, double wages){
        super(name,id,salary);
        this.hours = hours;
        this.wages = wages;
    }

    @Override
    double calculateSalary(){
        return hours * wages;
    }

    public static void main(String[] args){
        Employe a = new PermanentEmployee("John", 1, 100000, 1200000);
        Employe b = new ContractEmployee("Snow", 2, 35000, 120, 12.5);

       System.out.println("Salary of a = " + a.getFormattedSalary());
        System.out.println("Salary of b = " + b.getFormattedSalary());

    }
}