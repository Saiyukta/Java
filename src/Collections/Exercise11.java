package Collections;
//Exercise 11:   (2) Write a method that uses an Iterator to step through a Collection and
//print the toString( ) of each object in the container. Fill all the different types of
//Collections with objects and apply your method to each container.

import java.util.*;

public class Exercise11 {
    static void printCollection(Collection<?> collection) {
        Iterator<?> i = collection.iterator();
        while (i.hasNext()) {
            Object object = i.next();
            System.out.println(object.toString());
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("MySQL");
        list.add("Docker");
        list.add("AWS");

        printCollection(list);

        Set<String> set = new LinkedHashSet<>();
        set.add("setItem2");
        set.add("setItem1");
        set.add("setItem3");

        printCollection(set);
    }
}
