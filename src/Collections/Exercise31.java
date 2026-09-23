package Collections;
import java.util.*;

abstract class Shape {
    @Override
    public abstract String toString();
}

class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    @Override
    public String toString() {
        return "Square";
    }
}

class TriangleShape extends Shape {
    @Override
    public String toString() {
        return "Triangle";
    }
}

//random generator
public class Exercise31 implements Iterable<Shape> {

    private Random rand = new Random();
    private int size;

    public Exercise31(int size) {
        this.size = size;
    }
    public Shape next() {
        switch (rand.nextInt(3)) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new TriangleShape();
            default:
                throw new RuntimeException("Invalid shape");
        }
    }

    @Override
    public Iterator<Shape> iterator() {

        return new Iterator<Shape>() {
            private int count = 0;

            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public Shape next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                count++;
                return Exercise31.this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {

        Exercise31 generator = new Exercise31(5);

        for (Shape shape : generator) {
            System.out.println(shape);
        }
    }
}