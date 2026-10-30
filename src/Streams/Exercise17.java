package Streams;

import java.util.*;

public class Exercise17 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 10, 30, 20, 40, 30);

        List<Product> products = List.of(
                new Product("Laptop", "Electronics", 100000),
                new Product("Phone", "Electronics", 70000),
                new Product("Headphones", "Electronics", 5000),
                new Product("Chair", "Furniture", 8000),
                new Product("Desk", "Furniture", 15000),
                new Product("Monitor", "Electronics", 30000),
                new Product("Keyboard", "Electronics", 3000),
                new Product("Mouse", "Electronics", 2000)
        );


        numbers.stream().distinct().forEach(System.out::println);

        List<String> words = List.of(
                "Java",
                "Spring",
                "Java",
                "Python",
                "Spring",
                "Java"
        );

        System.out.println(" ");
        words.stream().distinct().forEach(System.out::println);

        System.out.println(" ");
        products.stream()
                .map(Product::getCategory)
                .distinct()
                .forEach(System.out::println);
    }
}
