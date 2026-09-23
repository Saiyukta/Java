package Generics;
//generic repository using generic collection

import java.util.*;

public class Exercise6 {
    static class Repository<T> {

        private List<T> data = new ArrayList<>();

        public void save(T object) {
            data.add(object);
        }

        public List<T> findAll() {
            return data;
        }
    }

    public static void main(String[] args) {
        Repository<String> names = new Repository<>();

        names.save("Alice");
        names.save("Bob");

        System.out.println(names.findAll());

        Repository<Integer> numbers = new Repository<>();
        numbers.save(10);
        numbers.save(20);
        System.out.println(numbers.findAll());

    }
}
