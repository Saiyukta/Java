package Generics;

import java.util.*;

public class Exercise15 {

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

    // List version
    public static <T> List<T> fill(
            List<T> list,
            Generator<T> gen,
            int n) {

        for (int i = 0; i < n; i++)
            list.add(gen.next());

        return list;
    }

    // LinkedList version
    public static <T> LinkedList<T> fill(
            LinkedList<T> list,
            Generator<T> gen,
            int n) {

        for (int i = 0; i < n; i++)
            list.add(gen.next());

        return list;
    }

    // Queue version
    public static <T> Queue<T> fill(
            Queue<T> queue,
            Generator<T> gen,
            int n) {

        for (int i = 0; i < n; i++)
            queue.add(gen.next());

        return queue;
    }

    // Set version
    public static <T> Set<T> fill(
            Set<T> set,
            Generator<T> gen,
            int n) {

        for (int i = 0; i < n; i++)
            set.add(gen.next());

        return set;
    }

    public static void main(String[] args) {

        List<Integer> list =
                fill(new ArrayList<Integer>(),
                        new Fibonacci(), 5);

        LinkedList<Integer> linkedList =
                fill(new LinkedList<Integer>(),
                        new Fibonacci(), 5);

        Queue<Integer> queue =
                fill(new LinkedList<Integer>(),
                        new Fibonacci(), 5);

        Set<Integer> set =
                fill(new LinkedHashSet<Integer>(),
                        new Fibonacci(), 5);

        System.out.println("List:       " + list);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Queue:      " + queue);
        System.out.println("Set:        " + set);
    }
}