package Generics;
//Generic Method with Two Type Parameters

public class Exercise4 {

    public static <K, V> void printPair(K key, V value) {

        System.out.println(key + " = " + value);
    }

    public static <T> T getFirst(T[] array) {
        return array[0];
    }

    public static void main(String[] args) {

        String[] names = {"John", "Snow"};

        String firstName = getFirst(names);
        System.out.println("First Name: " + firstName);

        printPair(101, "Alice");
    }
}
