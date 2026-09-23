package Collections;
//Exercise 18:   (3) Fill a HashMap with key-value pairs. Print the results to show
//ordering by hash code. Extract the pairs, sort by key, and place the result into a
//LinkedHashMap. Show that the insertion order is maintained.

import java.util.*;

public class Exercise18 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"alfa");
        map.put(2,"bravo");
        map.put(3,"charlie");
        map.put(4,"delta");
        map.put(5,"echo");
        map.put(6,"fox");
        map.put(7,"golf");
        map.put(8,"hotel");
        map.put(9,"india");
        map.put(10,"juliet");

        System.out.println("Original HashMap:");
        System.out.println(map);

        System.out.println("\nHash codes:");

        for (Integer key : map.keySet()) {
            System.out.println(
                    key + " -> " + key.hashCode() +
                    " keyValue : " +  map.get(key)
            );
        }

        List<Map.Entry<Integer, String>> entries =
                new ArrayList<>(map.entrySet());
        System.out.println("entries : " + entries.toString());

        entries.sort(Map.Entry.comparingByKey());

        Map<Integer, String> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("\nSorted LinkedHashMap:");
        System.out.println(sortedMap);
    }
    }


