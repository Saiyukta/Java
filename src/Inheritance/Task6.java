package Inheritance;
//WAP in Java to create a class Person with properties name and age, and a method greet().
//Extend this class to a Student class which adds a property grade.
//Implement a displayGrade() method in Student that prints the grade.
class Person {
    private String name;
     int age;
    private String country;

    Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

//WAP in Java to create a class Person with properties firstName and lastName.
//Add getters and setters for fullName.
//Extend this class to Employee and include an additional property employeeId.
//----------------------------------------------------------------------------
//WAP in Java to create a class Employee with a method calculateSalary().
// Extend this class to PermanentEmployee and ContractEmployee,
// overriding the calculateSalary() method to calculate salaries differently.

 class Employee extends Person{
    int employeeId;

    Employee(String name, int age, String country, int employeeId){
        super(name, age, country);
        this.employeeId = employeeId;
    }
    void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + getName());
    }

}


//WAP in Java to extend the Person class to a Teacher class.
// Override the greet() method in Teacher to include the subject they teach.
// WAP in Java to create a Teacher class that extends Person.
// Use the super keyword to call the greet() method from the Person class within the overridden greet() method.

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String country, String subject) {
        super(name, age, country);
        this.subject = subject;
    }

    @Override
    void greet(){
        super.greet();
        System.out.println("Hello, i teach " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String country,String grade) {
        super(name, age , country);
        this.grade = grade;
    }

    void displayGrade() {
        System.out.println("I am in grade " + grade + ".");
    }

    public static void main(String[] args) {
        Student student = new Student("John", 16, "AB road", "A+");
        student.setCountry("India");
        System.out.println(student.getCountry());
        System.out.println(student.getName());
        System.out.println(student.age);

//        student.greet();
//        student.displayGrade();
//
//        Teacher teacher = new Teacher("Snow" , 54, "China", "Chem");
//        teacher.greet();
//
//        Employee employee = new Employee("Employee" , 26,  "India" , 234);
//        employee.displayEmployeeInfo();
    }
}