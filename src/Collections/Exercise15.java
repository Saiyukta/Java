package Collections;
// evaluate the following expression, where’+’ means "push
//the following letter onto the stack," and’-’ means "pop the top of the stack and print it":
//"+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"

public class Exercise15 {

    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        String expression =
                "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";

        for (int i = 0; i < expression.length(); i++) {

            char current = expression.charAt(i);

            if (current == '+') {

                i++;

                char value = expression.charAt(i);

                stack.push(value);

            } else if (current == '-') {
                System.out.print(stack.pop());

            }
        }

        System.out.println();
    }
}