package Collections;
//Exercise 12:   (3) Create and populate a List<Integer>. Create a second List<Integer>
//of the same size as the first, and use ListIterators to read elements from the first List and
//insert them into the second in reverse order. (You may want to explore a number of different
//ways to solve this problem.)

import java.util.*;

public class Exercise12 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        );

        List<Integer> list2 = new ArrayList<>(list.size());

        ListIterator<Integer> it = list.listIterator(list.size());

        while (it.hasPrevious()) {
            Integer value = it.previous();
            list2.add(value);
        }

        System.out.println("list:  " + list);
        System.out.println("list2: " + list2);
    }
}