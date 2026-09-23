package Collections;
//Exercise 16:   (5) Create a Set of the vowels. count
//and display the number of vowels in each input word, and also display the total number of
//vowels in the input file.
//Exercise 20:   (3) Modify Exercise 16 so that you keep a count of the occurrence of each
//vowel.


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Exercise16 {

    public static void main(String[] args) throws IOException {

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);

        Path path = Path.of("input.txt");

        List<String> lines = Files.readAllLines(path);

        int totalVowels = 0;

        for (String line : lines) {

            String[] words = line.split("\\W+");

            for (String word : words) {

                if (word.isEmpty()) {
                    continue;
                }

                int vowelCount = 0;

                for (char character : word.toLowerCase().toCharArray()) {

                    if (vowels.contains(character)) {
                        vowelCount++;
                        map.put(character, map.get(character) + 1);
                    }
                }

                System.out.println(word + " -> " + vowelCount);

                totalVowels += vowelCount;
            }
        }

        System.out.println("--------------------");
        System.out.println("Total vowels: " + totalVowels);

        System.out.println("--------------------");
        System.out.println("Total vowels: " + map);


    }
}