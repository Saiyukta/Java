package Generics;
//Exercise 7:   (2) Use composition instead of inheritance to adapt Fibonacci to make it
//Iterable.

import java.util.*;

public class Exercise10 {
    static class Fibonacci {

        private int x = 0;
        private int y = 1;

        public int next() {
            int result = y;
            y = x + y;
            x = result;
            return result;
        }
    }

    public static class IterableFibonacci implements Iterable<Integer> {

        private Fibonacci fibonacci;
        private int n;

        public IterableFibonacci(int count) {
            n = count;
            fibonacci = new Fibonacci();
        }

        @Override
        public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {
                @Override
                public boolean hasNext() {
                    return n > 0;
                }

                @Override
                public Integer next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    n--;
                    return fibonacci.next();
                }

                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        }
    }

    public static void main(String[] args) {

        for (int i : new IterableFibonacci(18)) {
            System.out.print(i + " ");
        }
    }
}