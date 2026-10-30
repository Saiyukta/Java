package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;

public class Exercise9 {
    public static void main(String[] args) {

        List<String> names =
                new ArrayList<>(
                        List.of("Charlie", "Alice", "Bob")
                );

        // Using method reference
        names.sort(String::compareTo);

        System.out.println(names);
    }
}

// Using lambda function
//        names.sort((a, b) -> a.compareTo(b));
//        System.out.println(names);