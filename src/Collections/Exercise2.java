package Collections;
//Exercise 2:   (1) Modify SimpleCollection.java to use a Set for c.


import java.util.*;

public class Exercise2 {

    public class SimpleCollection {
        public static void main(String[] args) {
            Collection<Integer> c = new HashSet<>();
            for(int i = 0; i < 10; i++)
                c.add(i); // Autoboxing
            for(Integer i : c)
                System.out.print(i + ", ");
        }
    }
}
