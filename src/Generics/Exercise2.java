package Generics;//Exercise 2:   (1) Create a holder class that holds three objects of the same type, along with
//the methods to store and fetch those objects and a constructor to initialize all three.

class ThreeHolder<T> {
    private T first;
    private T second;
    private T third;

    public ThreeHolder(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }
}

public class Exercise2 {
    public static void main(String[] args) {

        ThreeHolder<String> holder =
                new ThreeHolder<String>("One", "Two", "Three");

        System.out.println(holder.getFirst());
        System.out.println(holder.getSecond());
        System.out.println(holder.getThird());

        holder.setFirst("Apple");
        holder.setSecond("Banana");
        holder.setThird("Cherry");

        System.out.println("\nAfter changing values:");

        System.out.println(holder.getFirst());
        System.out.println(holder.getSecond());
        System.out.println(holder.getThird());
    }
}