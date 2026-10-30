package Generics;
// innerclasses/Sequence.java
// Holds a sequence of Objects.
// Exercise 4:   (3) "Generify" innerclasses/Sequence.java.

public class Exercise7 {
    interface Selector<T> {
        boolean end();
        T current();
        void next();
    }
    static class Sequence<T> {
        private final T[] items;
        private int next = 0;

        @SuppressWarnings("unchecked")
        public Sequence(int size) {
            items = (T[]) new Object[size];
        }


        public void add(T x) {
            if(next < items.length)
                items[next++] = x;
        }

        private class SequenceSelector implements Selector<T> {
            private int i = 0;
            public boolean end() { return i == items.length; }
            public T current() { return items[i]; }
            public void next() { if(i < items.length) i++; }
        }
        public Selector<T> selector() {
            return new SequenceSelector();
        }

    }

    public static void main(String[] args) {
        Sequence<Integer> sequence = new Sequence<>(10);

        for(int i = 0; i < 10; i++){
            sequence.add(Integer.valueOf(Integer.toString(i)));
        }

        Selector<Integer> selector = sequence.selector();

        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
