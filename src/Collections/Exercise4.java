package Collections;
//Exercise 4:   (3) Create a generator class that produces character names (as String
//objects) from your favorite movie (you can use Snow White or Star Wars as a fallback) each
//time you call next( ), and loops around to the beginning of the character list when it runs out
//of names. Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a
//LinkedHashSet, and a TreeSet, then print each container.

import java.util.*;

public class Exercise4 {

    static class CharacterGenerator {

        private String[] characters = {
                "Luke",
                "Lee",
                "Han",
                "Chan",
                "Soda"
        };

        private int index = 0;

        public String next() {
            String character = characters[index];

            index++;

            if (index == characters.length) {
                index = 0;
            }

            return character;
        }
    }

    static Collection<String> fill(Collection<String> collection,
                                   CharacterGenerator generator,
                                   int count) {

        for (int i = 0; i < count; i++) {
            collection.add(generator.next());
        }

        return collection;
    }

    public static void main(String[] args) {

        CharacterGenerator generator = new CharacterGenerator();

        String[] array = new String[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = generator.next();
        }

        System.out.println("Array:");
        System.out.println(Arrays.toString(array));

        System.out.println("\nArrayList:");
        System.out.println(
                fill(new ArrayList<>(), generator, 8)
        );

        System.out.println("\nLinkedList:");
        System.out.println(
                fill(new LinkedList<>(), generator, 8)
        );

        System.out.println("\nHashSet:");
        System.out.println(
                fill(new HashSet<>(), generator, 8)
        );

        System.out.println("\nLinkedHashSet:");
        System.out.println(
                fill(new LinkedHashSet<>(), generator, 8)
        );

        System.out.println("\nTreeSet:");
        System.out.println(
                fill(new TreeSet<>(), generator, 8)
        );
    }
}