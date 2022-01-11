package Hewans_Practice;

public class checkNew {
public String make,model ;

 public int year ,  price;
public String color;

    public checkNew(String make, String model, int year, int price, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String toString() {
        return "checkNew{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}