package Generics;
//Exercise 6:   (1) Use RandomList with two more types in addition to the one shown in
//main( ).

import java.util.*;

public class Exercise9 {
    public static class RandomList<T> {
        private final ArrayList<T> storage = new ArrayList<>();
        private final Random rand = new Random(47);
        public void add(T item) { storage.add(item); }
        public T select() {
            return storage.get(rand.nextInt(storage.size()));
        }
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for(String s: ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" "))
            rs.add(s);

        for(int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");


        RandomList<Integer> rr = new RandomList<>();
        for(int i = 0; i < 11; i++)
            rr.add(i);

        for(int i = 0; i < 11; i++)
            System.out.print(rr.select() + " ");


        RandomList<Double> rd = new RandomList<>();
        for (double i = 0; i < 11; i++)
            rd.add(i);

        for(int i = 0; i < 11; i++)
            System.out.print(rd.select() + " ");

    }
}