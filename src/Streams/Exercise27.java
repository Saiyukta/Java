package Streams;

import java.util.*;

public class Exercise27 {
    public static void main(String[] args) {
        List<List<Integer>> numbers = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8, 9)
        );

        List<List<String>> groups = List.of(
                List.of("Alice", "Bob"),
                List.of("Charlie", "David"),
                List.of("Eva", "Frank")
        );

        List<List<Product>> products = List.of(
                List.of(new Product("Laptop", "Electronics", 100000),
                        new Product("Phone", "Electronics", 70000)),
                List.of(new Product("Chair", "Furniture", 8000),
                        new Product("Desk", "Furniture", 15000)),
                List.of( new Product("Keyboard", "Electronics", 3000),
                        new Product("Mouse", "Electronics", 2000))
        );

        //Flatten Numbers
        numbers.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        System.out.println(" ");

        //Flatten Names
        groups.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        System.out.println(" ");

        //Nested Product Categories
        products.stream()
                .flatMap(Collection::stream)
                .filter(product -> product.getPrice() > 10000)
                .forEach(System.out::println);

    }
}
