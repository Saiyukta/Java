package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exercise3 {
    static class Student {
        String name;
        int age;
        double marks;

        Student(String name, int age, double marks) {
            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        @Override
        public String toString() {
            return name + " | Age: " + age + " | Marks: " + marks;
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("A", 17, 85));
        students.add(new Student("B", 20, 72));
        students.add(new Student("C", 19, 35));
        students.add(new Student("D", 21, 92));
        students.add(new Student("E", 16, 45));

        Predicate<Student> isAdult = student -> student.age > 18;
        Predicate<Student> passed =  student -> student.marks > 40;
        Predicate<Student> distinction = student -> student.marks >= 75;
        Predicate<Student> adultAndPass = isAdult.and(passed);

        for(Student student : students){
            System.out.println(student.toString());
           System.out.println("isAdult ? " +isAdult.test(student) );
            System.out.println("passed ? " +passed.test(student) );
            System.out.println("distinction ? " +distinction.test(student) );
            System.out.println("adultAndPass ? " + adultAndPass.test(student));
            System.out.println("                              ");
        }
    }
}

