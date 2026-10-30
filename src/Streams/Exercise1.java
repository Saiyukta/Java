package Streams;
//Understanding Streams
//Collection vs Stream

import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
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

        System.out.println("Collection:: ");
        System.out.println(products);

        System.out.println("Stream:: ");
        products.stream()
                .forEach(System.out::println);
    }
}
