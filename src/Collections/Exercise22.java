package Collections;
//Exercise 22:   (5) Modify the previous exercise so that it uses a class containing a String
//and a count field to store each different word, and a Set of these objects to maintain the list
//of words.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Exercise22 {
    static class WordCount {

        String word;
        int count;

        WordCount(String word) {
            this.word = word;
            this.count = 1;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (!(obj instanceof WordCount)) {
                return false;
            }

            WordCount other = (WordCount) obj;

            return word.equalsIgnoreCase(other.word);
        }

        @Override
        public int hashCode() {
            return word.toLowerCase().hashCode();
        }

        @Override
        public String toString() {
            return word + " -> " + count;
        }
    }

        public static void main(String[] args) throws IOException {

            Set<WordCount> words = new HashSet<>();

            Path path = Path.of("input.txt");

            List<String> lines = Files.readAllLines(path);

            for (String line : lines) {

                String[] inputWords = line.split("\\W+");

                for (String word : inputWords) {

                    if (word.isEmpty()) {
                        continue;
                    }

                    WordCount existingWord = null;

                    for (WordCount wordCount : words) {
                        if (wordCount.word.equalsIgnoreCase(word)) {
                            existingWord = wordCount;
                            break;
                        }
                    }

                    if (existingWord != null) {
                        existingWord.count++;
                    }

                    else {
                        words.add(new WordCount(word));
                    }
                }
            }
            List<WordCount> sortedWords = new ArrayList<>(words);

            Collections.sort(
                    sortedWords,
                    Comparator.comparing(
                            wordCount -> wordCount.word,
                            String.CASE_INSENSITIVE_ORDER
                    )
            );

            for (WordCount wordCount : sortedWords) {
                System.out.println(wordCount);
            }
        }


}
