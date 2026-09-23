package Encapsulation;//Write a Java program to create a class called “Book” with private instance variables title,
// author, and price.
// Provide public getter and setter methods to access and modify these variables.
// Add a method called applyDiscount() that takes a percentage as a parameter and reduces the price by that percentage.

class Book{
    private String title;
    private String author;
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void applyDiscount(double percentage){
        if (percentage > 0 && percentage <= 100) {
            this.price -= this.price * (percentage / 100);
        }

    }

}

class Main{
    public static void main(String[] args){
        Book a = new Book();
        a.setTitle("Spiti Valley");
        a.setAuthor("Himachal");
        a.setPrice(3000.00);

        a.applyDiscount(50);
        System.out.println(a.getPrice());

        Book b = new Book();
        a.setTitle("Book B");
        a.setAuthor("Author B");
        a.setPrice(1000.00);

        a.applyDiscount(10);
        System.out.println(a.getPrice());
    }
}