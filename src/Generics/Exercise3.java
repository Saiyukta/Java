package Generics;
//Generic Class

class Box<T>{
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class Exercise3 {

    public static void main(String[] args) {
        Box<String> box = new Box<>();

        box.set("Hello");

        String value = box.get();

        System.out.println(value);
    }
}
