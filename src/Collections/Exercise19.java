package Collections;
//Exercise 19:
//Repeat the previous exercise with a HashSet and LinkedHashSet.

import java.util.*;


public class Exercise19 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Orange");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Banana");
        hashSet.add("Grapes");

        System.out.println(hashSet);

        List<String> list = new ArrayList<>(hashSet);

        Collections.sort(list);

        Set<String> linkedHashSet = new LinkedHashSet<>();

        for(String s: list){
            linkedHashSet.add(s);
        }

        System.out.println(linkedHashSet);


    }
}
