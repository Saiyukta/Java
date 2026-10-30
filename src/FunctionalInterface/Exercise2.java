package FunctionalInterface;

import java.util.function.Predicate;

public class Exercise2 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isOdd = number -> number % 2 != 0;
        Predicate<Integer> isPositive = number -> number > 0;
        Predicate<Integer> isGreaterThan100 =number -> number > 100;

        int[] numbers = {-10, 5, 20, 101, 200};

        for (int number : numbers) {

            System.out.println("Number: " + number);

            System.out.println("  Is even?            "
                    + isEven.test(number));

            System.out.println("  Is odd?             "
                    + isOdd.test(number));

            System.out.println("  Is positive?        "
                    + isPositive.test(number));

            System.out.println("  Greater than 100?   "
                    + isGreaterThan100.test(number));

            System.out.println();
        }

        Predicate<Integer> positiveAndEven =
                isPositive.and(isEven);

        Predicate<Integer> positiveAndGreaterThan100 =
                isPositive.and(isGreaterThan100);

        System.out.println("Testing combined predicates:");
        System.out.println();

        System.out.println(
                "Is 20 positive and even? "
                        + positiveAndEven.test(20)
        );

        System.out.println(
                "Is 101 positive and greater than 100? "
                        + positiveAndGreaterThan100.test(101)
        );


    }
}
