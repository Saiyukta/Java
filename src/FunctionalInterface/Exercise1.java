package FunctionalInterface;

@FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }

public class Exercise1 {

    static void execute(
            int a,
            int b,
            Calculator calculator){
        int result = calculator.calculate(a, b);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;

        System.out.println("Addition: " + addition.calculate(10, 5));
        System.out.println("Subtraction: " + subtraction.calculate(10, 5));
        System.out.println("Multiplication: " + multiplication.calculate(10, 5));
        System.out.println("Division: " + division.calculate(10, 5));

        execute(10, 5, (a, b) -> a + b);
        execute(10, 5, (a, b) -> a - b);
        execute(10, 5, (a, b) -> a * b);
        execute(10, 5, (a, b) -> a / b);

    }
}
