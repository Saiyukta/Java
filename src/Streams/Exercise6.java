package Streams;

import java.util.List;

public class Exercise6 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35, 40);

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

        System.out.println("Even numbers :: ");
        numbers.stream()
                .filter(number -> number%2 == 0 )
                .forEach(System.out::println);

        System.out.println("  ");

        System.out.println("Above 18 numbers :: ");
        numbers.stream()
                .filter(number -> number > 18)
                .forEach(System.out::println);

        System.out.println("  ");

        System.out.println("Product costing more than 30,000 :: ");
        products.stream()
                .filter(product -> product.getPrice() >= 30000)
                .forEach(System.out::println);

        System.out.println("  ");

        System.out.println("price > 5000  AND category == Electronics :: ");
        products.stream()
                .filter(product -> product.getPrice() >= 5000)
                .filter(product -> product.getCategory().equals("Electronics"))
                .forEach(System.out::println);

    }
}
