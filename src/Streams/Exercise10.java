package Streams;

import java.util.List;

public class Exercise10 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

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

        System.out.println("Output 1 :: ");
        numbers.stream()
                .map(i -> i * i)
                .forEach(System.out::println);

        List<String> names = List.of(
                "alice",
                "bob",
                "charlie"
        );

        System.out.println(" ");
        System.out.println("Output 2 :: ");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("Output 3 :: ");
        List<String> productNames = products.stream()
                .map(Product::getName)
                .toList();
        System.out.println(productNames);

        System.out.println(" ");
        System.out.println("Output 4 :: ");
        List<Double> productPrices = products.stream()
                .map(Product::getPrice)
                .toList();
        System.out.println(productPrices);
    }
}
