package Generics;
//Exercise 9:   (1) Modify GenericMethods.java so that f( ) accepts three arguments, all
//of which are of a different parameterized type.
//Exercise 10:   (1) Modify the previous exercise so that one of f( )’s arguments is non
//parameterized.

public class Exercise12 {
    public static class GenericMethods {
        //int -> non-parameterized
        //a -> parameterized
        //b -> parameterized
        public <A, B> void f(int x, A a, B b) {
            System.out.println(x);
        }

    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f(0, 1, 3.2);
        gm.f(1, "one", 1);
        gm.f(1, "two", 1.0);
        gm.f(1, 1.666, true);
        gm.f(1, "B","A");
        gm.f(1, gm, gm);
    }
}
