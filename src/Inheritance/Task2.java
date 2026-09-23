package Inheritance;

class Vahicle{
    void drive(){
        System.out.println("drive method called");
    }
}

class Cer extends Vahicle{
    @Override
    void drive() {
        System.out.println("driving a car");
    }
}

class Task2{
    public static void main(String[] args){
        Vahicle a = new Cer();
        a.drive();
    }
}