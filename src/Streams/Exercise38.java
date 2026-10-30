package Streams;

import java.util.*;

public class Exercise38 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 20, 30, 40, 80);

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

        int result = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Result = " + result);

        System.out.println(" ");

        int result1 = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Result = " + result1);

        System.out.println(" ");

        int result2 = numbers.stream()
                .reduce(0, Integer::max);
        System.out.println("Max = " + result2);

        System.out.println(" ");

        double totalProductPrice = products.stream()
                .map(Product::getPrice)
               .reduce((double) 0, Double::sum);
        System.out.println("Total = " + totalProductPrice);

        System.out.println(" ");

        double totalElectronicsPrice =
                products.stream()
                        .filter(product -> product.getCategory().equals("Electronics"))
                        .map(Product::getPrice)
                        .reduce((double) 0, Double::sum);
        System.out.println("Total Electronic's Price= " + totalElectronicsPrice);

    }

}
