package Collections;

// Exercise 21:
// Using a Map<String,Integer>, follow the form of
// UniqueWords.java to create a program that counts the occurrence
// of words in a file. Sort the results using Collections.sort()
// with String.CASE_INSENSITIVE_ORDER and display the result.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Exercise21 {

    public static void main(String[] args) throws IOException {

        Map<String, Integer> map = new HashMap<>();

        Path path = Paths.get("input.txt");

        List<String> lines = Files.readAllLines(path);

        for (String line : lines) {

            String[] words = line.split("\\W+");

            for (String word : words) {

                if (word.isEmpty()) {
                    continue;
                }

                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort(
                Map.Entry.comparingByKey(
                        String.CASE_INSENSITIVE_ORDER
                )
        );

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}