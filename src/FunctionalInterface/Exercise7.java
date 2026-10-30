package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Printer {
    public void print(Integer number) {
        System.out.println("Num: " + number);
    }
}

public class Exercise7 {

    public static void main(String[] args) {
        List<String> numbers = List.of("10", "20", "30", "40");
        List<String> names =
                List.of("java", "spring", "hibernate");
        List<String> list1 =
                new ArrayList<>(
                        List.of("Charlie", "Alice", "Bob")
                );
        Predicate<String> isEmpty = String::isEmpty;

        Printer printer = new Printer();
        Consumer<Integer> consumer =  printer::print ; //particular obj

        for(String number : numbers) {
            consumer.accept(Integer.parseInt(number));
        }

        List<Integer> numbersWithMethodReference =
                numbers.stream()
                        .map(Integer::parseInt) //static method
                        .toList();


        System.out.println(numbersWithMethodReference);

        numbers.forEach(System.out::println);

        List<String> list = names.stream().map(String::toUpperCase).toList(); //arbitrary obj
        System.out.println(list);
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("Java"));



    }

}
