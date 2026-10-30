package Streams;

import java.util.*;

public class Exercise14 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(50, 10, 40, 20, 30));

        numbers.sort(Comparator.naturalOrder());
        numbers.forEach(System.out::println);

        List<Product> products = new ArrayList<>(List.of(
                new Product("Laptop", "Electronics", 100000),
                new Product("Phone", "Electronics", 70000),
                new Product("Headphones", "Electronics", 5000),
                new Product("Chair", "Furniture", 8000),
                new Product("Desk", "Furniture", 15000),
                new Product("Monitor", "Electronics", 30000),
                new Product("Keyboard", "Electronics", 3000),
                new Product("Mouse", "Electronics", 2000)
        ));

        System.out.println(" ");
       products.sort(Comparator.comparing(Product::getPrice));
       products.forEach(System.out::println);

        System.out.println(" ");
       products.forEach(System.out::println);
    }
}
