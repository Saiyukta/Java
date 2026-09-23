package Collections;
//Exercise 8:   (1) Modify Exercise l so it uses an Iterator to move through the List while
//calling hop( ).

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class Exercise8 {

    static class Gerbil {
        int gerbilNumber;

        Gerbil(int gerbilNumber) {
            this.gerbilNumber = gerbilNumber;
        }

        void hop() {
            System.out.println(
                    "Gerbil " + gerbilNumber + " is hopping"
            );
        }
    }

    public static void main(String[] args) {

      List<Gerbil> gerbils = new ArrayList<>();
        gerbils.add(new Gerbil(1));
        gerbils.add(new Gerbil(2));
        gerbils.add(new Gerbil(3));

        Iterator<Gerbil> it = gerbils.iterator();
                while (it.hasNext()) {
                    Gerbil gerbil = it.next();
                    gerbil.hop();
                }

    }
}
