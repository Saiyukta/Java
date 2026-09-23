package Collections;
// Create a new class called Gerbil with an int gerbilNumber that’s
//initialized in the constructor. Give it a method called hop( ) that displays which gerbil
//number this is, and that it’s hopping. Create an ArrayList and add Gerbil objects to the
//List. Now use the get( ) method to move through the List and call hop( ) for each Gerbil.

import java.util.*;

public class Exercise1 {

    static class Gerbil {
        int gerbilNumber;

        Gerbil(int gerbilNumber) {
            this.gerbilNumber = gerbilNumber;
        }

        void hop() {
            System.out.println(
                    "Gerbil " + this.gerbilNumber + " is hopping"
            );
        }
    }

    public static void main(String[] args) {

        ArrayList<Gerbil> gerbils = new ArrayList<>();

        gerbils.add(new Gerbil(1));
        gerbils.add(new Gerbil(2));
        gerbils.add(new Gerbil(3));

        for (Gerbil gerbil : gerbils) {
            gerbil.hop();
        }
    }
}