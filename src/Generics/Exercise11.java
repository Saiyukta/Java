package Generics;
//Exercise 8:   (2) Following the form of the Coffee example, create a hierarchy of
//StoryCharacters from your favorite movie, dividing them into GoodGuys and BadGuys.
//Create a generator for StoryCharacters, following the form of CoffeeGenerator.

import java.util.*;

interface Generator<T> {
    T next();
}

public class Exercise11 {
    public static class StoryCharacters {
        private static long counter = 0;
        private final long id = counter++;
        public String toString() {
            return getClass().getSimpleName() + " " + id;
        }
    }
    public static class GoodGuys extends StoryCharacters {}
    public static class BadGuys extends StoryCharacters {}

    public static class CharacterGenerator implements Generator<StoryCharacters>, Iterable<StoryCharacters> {
        private final Class[] types = { GoodGuys.class, BadGuys.class};
        private static final Random rand = new Random(47);
        public CharacterGenerator() {}

        private int size = 0;
        public CharacterGenerator(int sz) { size = sz; }
        public StoryCharacters next() {
            try {
                return (StoryCharacters) types[rand.nextInt(types.length)].newInstance();
            } catch(Exception e) {
                throw new RuntimeException(e);
            }
        }
        class CharacterIterator implements Iterator<StoryCharacters> {
            int count = size;
            public boolean hasNext() {
                return count > 0;
            }

            public StoryCharacters next() {
                count--;
                return CharacterGenerator.this.next();
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
        public Iterator<StoryCharacters> iterator() {
            return new CharacterIterator();
        }

    }

    public static void main(String[] args) {
        CharacterGenerator gen = new CharacterGenerator();
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());
        for(StoryCharacters c : new CharacterGenerator(5))
            System.out.println(c);
    }
}
