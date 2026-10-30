package FunctionalInterface;

import java.util.function.Function;

public class Exercise4 {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = String::length; //replaced lambda (text -> text.lenght()) to method reference (arbitrary obj)

        Function<String, String> uppercase = String::toUpperCase;

        Function<Integer, Integer> square = number -> number * number;

        Function<Double, Double> discount = price -> price * 0.90;

        System.out.println("length = " + stringLength.apply("Hello"));
        System.out.println("uppercase = " + uppercase.apply("Hello"));
        System.out.println("square = " + square.apply(2));

        Function<Integer, String> numberToString =
                number -> "Number: " + number;

        System.out.println("\nNumber to String:");

        System.out.println(numberToString.apply(10));

        System.out.println(numberToString.apply(50));
    }
}
