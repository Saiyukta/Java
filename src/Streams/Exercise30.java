package Streams;

import java.util.Comparator;
import java.util.List;

public class Exercise30 {
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

        long count = products.stream()
                .filter(product -> product.getPrice() > 10000)
                .count();
        System.out.println("count = " + count);

        System.out.println(" ");

        long electronicCount = products.stream()
                .filter(product -> product.getCategory().equals("Electronics"))
                .count();
        System.out.println("electronicCount = " + electronicCount);

        System.out.println(" ");

        //Is there at least one product costing more than ₹100,000?
         boolean a = products.stream()
                 .anyMatch(product -> product.getPrice() > 100000);
         System.out.println("Is there at least one product costing more than ₹100,000? = " + a);

        System.out.println(" ");

         //Are all products cheaper than ₹200,000?
        boolean b =  products.stream()
                 .allMatch(product -> product.getPrice() < 200000);
        System.out.println("Are all products cheaper than ₹200,000? " + b);

        System.out.println(" ");

        //Are there any products with a negative price?
        boolean c = products.stream()
                 .noneMatch(product -> product.getPrice() < 0);
        System.out.println("Are there any products with a negative price? " + c);

        System.out.println(" ");

        //Find the first product whose price is greater than ₹50,000
        products.stream()
                .filter(product -> product.getPrice() > 50000 )
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println(" ");

        //Find the cheapest product
        products.stream()
                .min(Comparator.comparing(Product::getPrice))
                .ifPresent(System.out::println);

        System.out.println(" ");

        //Find the most expensive product.
        products.stream()
                .max(Comparator.comparing(Product::getPrice))
                .ifPresent(System.out::println);


    }
}
