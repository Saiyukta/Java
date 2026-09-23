package Collections;
//Exercise 9:   (4) Modify innerclasses/Sequence.java so that Sequence works with an
//Iterator instead of a Selector.
import java.util.Iterator;

public class Exercise9 {

    static class Sequence implements Iterable<Object> {

        private Object[] items;
        private int next = 0;

        public Sequence(int size) {
            items = new Object[size];
        }

        public void add(Object x) {

            if (next == items.length) {

                int newSize = items.length == 0
                        ? 1
                        : items.length * 2;

                Object[] newItems = new Object[newSize];

                System.arraycopy(
                        items,
                        0,
                        newItems,
                        0,
                        items.length
                );

                items = newItems;
            }

            items[next++] = x;
        }

        @Override
        public Iterator<Object> iterator() {

            return new Iterator<Object>() {

                private int index = 0;

                @Override
                public boolean hasNext() {
                    return index < next;
                }

                @Override
                public Object next() {

                    if (!hasNext()) {
                        throw new java.util.NoSuchElementException();
                    }

                    return items[index++];
                }
            };
        }
    }

    public static void main(String[] args) {

        Sequence sequence = new Sequence(3);

        sequence.add("Java");
        sequence.add("Spring");
        sequence.add("Hibernate");
        sequence.add("MySQL");
        sequence.add("Docker");
        sequence.add("AWS");

        Iterator<Object> it = sequence.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}