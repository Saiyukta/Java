package Generics;

public class Sequence<T> {

    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(T x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    public T get(int i) {
        return (T) items[i];
    }

    public static void main(String[] args) {

        Sequence<String> sequence = new Sequence<String>(5);

        sequence.add("One");
        sequence.add("Two");
        sequence.add("Three");

        String s1 = sequence.get(0);
        String s2 = sequence.get(1);
        String s3 = sequence.get(2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


         sequence.add(String.valueOf(100));
        System.out.println(sequence.get(3));

    }
}

