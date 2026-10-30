package Streams;

import java.util.*;

public class Exercise20 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50, 60);

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

        numbers.stream()
                .limit(3)
                .forEach(System.out::println);

        System.out.println(" ");

        products.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println(" ");

        products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .limit(2)
                .forEach(System.out::println);

        System.out.println(" ");

        //Find Expensive Product Names
        //products above price 1000 are expensive
        products.stream()
                .filter(product -> product.getPrice() > 1000)
                .map(Product::getName)
                .sorted()
                .forEach(System.out::println);

        System.out.println(" ");

        //Electronics Under 50,000
        products.stream()
                .filter(product -> product.getCategory().equals("Electronics"))
                .filter(product -> product.getPrice() <= 50000)
                .sorted(Comparator.comparing(Product::getPrice))
                .forEach(System.out::println);

        System.out.println(" ");

        //Top 3 Electronics
        products.stream()
                .filter(product -> product.getCategory().equals("Electronics"))
                .limit(3)
                .forEach(System.out::println);

        System.out.println(" ");

        //Expensive Product Names in Uppercase
        products.stream()
                .filter(product -> product.getPrice() >= 50000)
                .map(Product::getName)
                .sorted()
                .forEach(System.out::println);

        System.out.println(" ");
                 }
}
