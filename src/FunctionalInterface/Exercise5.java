package FunctionalInterface;

import java.util.function.Function;

public class Exercise5 {

    static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Product A = new Product("X" , 400000.00);

        Function<Product, String> productName = product -> product.name;
        Function<Product, Double> productPrice = product -> product.price;
        Function<Product, Double> discountedPrice = product -> product.price * 0.90;

        System.out.println(productName.apply(A));
        System.out.println(productPrice.apply(A));
        System.out.println(discountedPrice.apply(A));
    }
}
