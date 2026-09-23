package Collections;
////Exercise 3:   (2) Modify innerclasses/Sequence.java so that you can add any number
////of elements to it.

public class Exercise3 {

    static class Sequence {

        private Object[] items;
        private int next = 0;

        public Sequence(int size) {
            items = new Object[size];
        }

        public void add(Object x) {

            if (next == items.length) {
                Object[] newItems = new Object[items.length * 2];

                System.arraycopy(items, 0, newItems, 0, items.length);

                items = newItems;
            }

            items[next++] = x;
        }

        public void display() {
            for (int i = 0; i < next; i++) {
                System.out.println(items[i]);
            }
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

        sequence.display();
    }
}