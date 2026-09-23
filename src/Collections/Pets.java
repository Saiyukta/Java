package Collections;

import java.util.ArrayList;
import java.util.List;

public class Pets {

    public static List<Pet> arrayList(int size) {

        List<Pet> pets = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            pets.add(new Pet());
        }

        return pets;
    }
}