package day31_constrouctor;

public class Rectangle {
    public double length,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calcArea(){
        return length * width;

    }
    public double clacPerimeter(){
        return 2 *(length + width);
    }
}
