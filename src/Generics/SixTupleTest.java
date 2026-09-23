package Generics;

public class SixTupleTest {

    static SixTuple<String, Integer, Double, Character, Boolean, String> getTuple() {
        return new SixTuple<String, Integer, Double, Character, Boolean, String>(
                "Hello",
                100,
                25.5,
                'A',
                true,
                "World"
        );
    }

    public static void main(String[] args) {
        SixTuple<String, Integer, Double, Character, Boolean, String> tuple =
                getTuple();

        System.out.println(tuple);

        // Cannot modify because all fields are final
        // tuple.first = "Changed"; // Compile-time error
    }
}