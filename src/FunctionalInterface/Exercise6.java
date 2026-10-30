package FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name " + name + ", Price " + price;
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        Consumer<String> printer = name -> System.out.println(name);
        printer.accept("Hello");

        Consumer<Product> productDetails =
                product -> System.out.println(product.name + ", " + product.price);
        productDetails.accept(new Product("Laptop" , 400000.00));

        BiFunction<String, Double ,Product> creator2 = Product::new; //constructor reference

        Product product2 = creator2.apply("Laptop2", 300000.00);
        System.out.println("product2 = " + product2);
    }
}
