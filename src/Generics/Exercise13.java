package Generics;
import  java.util.*;

//Exercise 11:   (1) Test New.java by creating your own classes and ensuring that New will
//work properly with them.
//Exercise 12:   (1) Repeat the previous exercise using explicit type specification.

public class Exercise13 {
    public static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
    public static class New {
        public static <K,V> Map<K,V> map() {
            return new HashMap<K,V>();
        }
        public static <T> List<T> list() {
            return new ArrayList<T>();
        }
        public static <T> LinkedList<T> lList() {
            return new LinkedList<T>();
        }
        public static <T> Set<T> set() {
            return new HashSet<T>();
        }
        public static <T> Queue<T> queue() {
            return new LinkedList<T>();
        }

        public <A> void f(A a) {
            System.out.println(a);
        }


    }

    public static class ExplicitTypeSpecification {
        static void f(Map<Person, List<Pet>> petPeople) {}
        public static void main(String[] args) {
            f(New.<Person, List<Pet>>map());
        }
    }

    public static void main(String[] args) {
        Map<String, List<String>> sls = New.map();
        List<String> ls = New.<String>list();//Explicit type inference
        LinkedList<String> lls = New.lList();
        Set<String> ss = New.set();
        Queue<String> qs = New.queue();

        Map<Integer, Person> ms = New.<Integer, Person>map();//Explicit type inference
        ms.put(1, new Person("Jack"));
        ms.put(2, new Person("Peter"));
        ms.put(3, new Person("Mary"));
        System.out.println(ms);


    }

}

