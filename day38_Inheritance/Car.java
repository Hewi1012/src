package day38_Inheritance;

public class Car {
    public String brand;
    public String model;
    public int year;
    public String color;
    public double miles;

    public Car(String brand, String model, int year, String color, double miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.miles = miles;
    }
    public void start(){
        System.out.println(brand+"brand Starting");
    }
    public void drive(){
        System.out.println(brand+"brand driving");
    }
   // public void toString(){

    }

