package Streams;

import java.util.List;

public class Exercise5 {
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
                .filter(p -> {
                    System.out.println("Filtering " + p.getName());
                    return p.getPrice() > 5000;
                })  // OUPUT :: Nothing gets printed.
                .forEach(System.out::println); //now output is printed

        //because Intermediate operations are lazy, and They don't execute until a terminal operation triggers the pipeline.
    }
}
