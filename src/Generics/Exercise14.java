package Generics;

import java.util.*;

// Exercise 13:
// Overload fill() for List, Queue and Set.

public class Exercise14 {

    public static <T> List<T> fill(
            List<T> list,
            Generator<T> gen,
            int n) {

        for (int i = 0; i < n; i++) {
            list.add(gen.next());
        }

        return list;
    }

    public static <T> Queue<T> fill(
            Queue<T> queue,
            Generator<T> gen,
            int n) {

        for (int i = 0; i < n; i++) {
            queue.add(gen.next());
        }

        return queue;
    }

    public static <T> Set<T> fill(
            Set<T> set,
            Generator<T> gen,
            int n) {

        for (int i = 0; i < n; i++) {
            set.add(gen.next());
        }

        return set;
    }

    public interface Generator<T> {
        T next();
    }

    public static class Fibonacci implements Generator<Integer> {

        private int x = 0;
        private int y = 1;

        @Override
        public Integer next() {
            int result = y;
            y = x + y;
            x = result;
            return result;
        }
    }

    public static void main(String[] args) {

        List<Integer> list =
                fill(new ArrayList<Integer>(), new Fibonacci(), 8);

        Queue<Integer> queue =
                fill((Queue<Integer>) new LinkedList<Integer>(), new Fibonacci(), 8);

        Set<Integer> set =
                fill(new LinkedHashSet<Integer>(), new Fibonacci(), 8);

        System.out.println("List:");
        System.out.println(list);

        System.out.println("\nQueue:");
        System.out.println(queue);

        System.out.println("\nSet:");
        System.out.println(set);
    }
}