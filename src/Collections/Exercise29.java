package Collections;
//Exercise 29:   (2) Create a simple class that inherits from Object and contains no
//members, and show that you cannot successfully add multiple elements of that class to a
//PriorityQueue. This issue will be fully explained in the Containers in Depth chapter.

import java.util.*;

class SimpleClass {
}

public class Exercise29 {
//    public static void main(String[] args) {

//        PriorityQueue<SimpleClass> queue = new PriorityQueue<>();
//
//        queue.offer(new SimpleClass());
//        queue.offer(new SimpleClass());
//
//        System.out.println(queue);
//        public class EnvironmentVariables {
            public static void main(String[] args) {
                for(Map.Entry entry: System.getenv().entrySet()) {
                    System.out.println(entry.getKey() + ": " +
                            entry.getValue());
                }
            }
        }
//    }
//}

//PriorityQueue needs either natural ordering (Comparable) or an external ordering (Comparator) to handle multiple objects.