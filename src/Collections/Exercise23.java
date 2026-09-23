package Collections;
//Starting with Statistics.java, create a program that runs the test
//repeatedly and looks to see if any one number tends to appear more than the others in the
//results.
import java.util.*;

public class Exercise23 {

    public static void main(String[] args) {

        Random random = new Random();

        int numberOfExperiments = 1000;
        int numbersPerExperiment = 100;
        int range = 20;

        int[] mostFrequent = new int[range];

        for (int experiment = 0;
             experiment < numberOfExperiments;
             experiment++) {

            int[] counts = new int[range];

            for (int i = 0; i < numbersPerExperiment; i++) {

                int number = random.nextInt(range);

                counts[number]++;
            }

            int highestCount = 0;
            int mostFrequentNumber = 0;

            for (int number = 0; number < range; number++) {

                if (counts[number] > highestCount) {
                    highestCount = counts[number];
                    mostFrequentNumber = number;
                }
            }

            mostFrequent[mostFrequentNumber]++;
        }

        System.out.println("Number of experiments: "
                + numberOfExperiments);

        System.out.println();

        for (int number = 0; number < range; number++) {

            System.out.println(
                    number + " was most frequent in "
                            + mostFrequent[number]
                            + " experiments"
            );
        }
    }
}