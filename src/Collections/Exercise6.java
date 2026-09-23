package Collections;

import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
        );
        System.out.println("1: " + numbers);
        numbers.add(10);

        System.out.println("2: " + numbers);
        System.out.println("3: " + numbers.contains(10));
        System.out.println("4: " + numbers.remove(9));
        System.out.println("5: after removal " + numbers);
//        System.out.println("6: index of " + numbers.indexOf(9));
        numbers.add(3, 10);
        System.out.println("6: " + numbers);

        List<Integer> sub = numbers.subList(1, 5);
        System.out.println("7: " + sub);
        System.out.println("8: " + sub.contains(10));
        System.out.println("9: " + numbers.containsAll(sub));

        Collections.sort(sub);
        System.out.println("sorted subList: " + sub);

        Collections.shuffle(sub);
        System.out.println("shuffled subList: " + sub);

        List<Integer> copy = new ArrayList<>(numbers);

        sub = Arrays.asList(numbers.get(1),  numbers.get(5));
        System.out.println("10: " + sub);

        copy.retainAll(sub);
        System.out.println("11: " + copy);

        copy = new ArrayList<>(numbers);
        System.out.println("12: " + copy);
        copy.remove(2);
        System.out.println("13: " + copy);
        copy.removeAll(sub);
        System.out.println("14: " + copy);

        copy.set(1, 5);
        System.out.println("15: " + copy);

        copy.addAll(2, sub);
        System.out.println("16: " + copy);

        copy.clear();
        System.out.println("17: " + copy);
        System.out.println("18: " + copy.isEmpty());

        Object[] o = numbers.toArray();
        System.out.println("19: " + Arrays.toString(Arrays.stream(o).toArray()));
        System.out.println("19: " + o[2]);

    }
}
