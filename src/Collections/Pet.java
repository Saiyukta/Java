package Collections;

public class Pet implements Comparable<Pet> {

    private static int counter = 0;
    private final int id;

    public Pet() {
        id = counter++;
    }

    public String id() {
        return String.valueOf(id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + id + ")";
    }

    @Override
    public int compareTo(Pet other) {
        return Integer.compare(this.id, Integer.parseInt(other.id()));
    }
}