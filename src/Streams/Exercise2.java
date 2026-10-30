package Streams;
//Stream Does Not Store Data

import java.util.List;
import java.util.stream.Stream;

public class Exercise2 {

    public static void main(String[] args) {
        List<String> names = List.of(
                "Alice",
                "Bob",
                "Charlie"
        );

        names.forEach(System.out::println);
        names.forEach(System.out::println); //collections can be reused

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

        Stream<Product> stream = products.stream();
//        System.out.println(stream); //output :: java.util.stream.ReferencePipeline$Head@8efb846

        stream.forEach(System.out::println);
//        stream.forEach(System.out::println); //output :: IllegalStateException: stream has already been operated upon or closed

    }
}
