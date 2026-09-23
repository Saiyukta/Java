//List
package Collections;

import java.util.*;

 class Task1 {
    public static void main ( String[] args){

        ArrayList<String> students = new ArrayList<>();

        List<Integer> friends = new LinkedList<>();

        students.add("A");
        students.add("B");
        students.add("C");
        students.add("D");
        students.add("E");
        students.add("F");

        students.remove("D");
        students.remove(1);

        students.set(1, "G");




        System.out.println(students);
    }



}