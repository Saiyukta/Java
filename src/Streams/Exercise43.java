package Streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class Exercise43 {
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

        products.stream()
                .map(Product::getName)
                .toList()
                .forEach(System.out::println);

        System.out.println(" ");

        //Extract all unique product categories.
        Set<String> set = products.stream()
                .map(Product::getCategory)
                .collect(Collectors.toSet());
        System.out.println(set);

        System.out.println(" ");

        //join names
        String s = products.stream()
                .map(Product::getName)
                .collect(Collectors.joining(","));
        System.out.println(s);

        System.out.println(" ");

        //Group Products by Category
        Map<String, List<Product>> map =
                products.stream()
                        .collect(Collectors.groupingBy(Product::getCategory));
        System.out.println(map);

        System.out.println(" ");

        //Count Products Per Category
        Map<String, Long> result = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
        System.out.println(result);




    }
}
