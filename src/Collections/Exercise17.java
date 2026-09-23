package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Exercise 17:
// Take the Gerbil class in Exercise 1 and put it into a Map instead,
// associating each Gerbil's name as a String key for each Gerbil value.
// Get an Iterator for keySet() and use it to move through the Map,
// looking up the Gerbil for each key and printing out the key and
// telling the Gerbil to hop.

class Gerbil {

    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("gerbilNumber = " + gerbilNumber);
    }
}

public class Exercise17 {

    public static void main(String[] args) {

        Map<String, Gerbil> gerbils = new HashMap<>();

        gerbils.put("Fuzzy", new Gerbil(1));
        gerbils.put("Spot", new Gerbil(2));
        gerbils.put("Rocky", new Gerbil(3));

        Iterator<String> iterator = gerbils.keySet().iterator();

        while (iterator.hasNext()) {

            String name = iterator.next();

            Gerbil gerbil = gerbils.get(name);

            System.out.println(name);
            gerbil.hop();
        }
    }
}