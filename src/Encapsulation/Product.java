//Write a Java program to create a class called Product with private instance
// variables productName, productCode, and price.
// Provide public getter and setter methods to access and modify these variables.
// Add a method called applyDiscount() that takes a percentage and reduces the price by that percentage.
package Encapsulation;
public class Product{
    private String productName;
    private int productCode;
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setProductCode(int productCode){
        this.productCode = productCode;
    }

    public int getProductCode(){
        return productCode;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public double applyDiscount(int percentage){
        return price - (price * (double) percentage /100);
    }

    public static void main(String[] args){
        Product a = new Product();
        a.setPrice(100);

        System.out.println(a.applyDiscount(10));
    }
}
