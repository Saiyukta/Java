//WAP in Java to create a class MathOperations with a static method add(int a, int b).
// Extend this class to AdvancedMath with a static method subtract(int a, int b).

package Inheritance;

class MathOperations{
     int add(int a, int b){
        return a + b;
    }
}

class AdvancedMath extends MathOperations{
     int add(int a, int b, int c){
       return a + b + c;
    }

    public static void main(String[] args){
       AdvancedMath addition = new AdvancedMath();
     System.out.println(addition.add(1,2,3));
}}