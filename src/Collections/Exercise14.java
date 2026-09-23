package Collections;

//Exercise 14:   (3) Create an empty LinkedList<Integer>. Using a Listlterator, add
//Integers to the List by always inserting them in the middle of the List.

import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise14 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {

            ListIterator<Integer> iterator = list.listIterator();

            int middle = list.size() / 2;

            for (int j = 0; j < middle; j++) {
                iterator.next();
            }

            iterator.add(i);

            System.out.println(list);
        }
    }
}