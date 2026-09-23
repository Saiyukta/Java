package Collections;
//Exercise 28:   (2) Fill a PriorityQueue (using offer( )) with Double values created
//using java.util.Random, then remove the elements using poll( ) and display them.

import java.util.*;

public class Exercise28 {
    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();

        Random rand = new Random();

        for(int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextDouble()); }

        System.out.println(priorityQueue);

        while(!priorityQueue.isEmpty()) {
            double number = priorityQueue.poll();
            System.out.println(number);
        }
    }
    }


