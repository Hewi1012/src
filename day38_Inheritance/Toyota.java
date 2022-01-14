package day38_Inheritance;

public class Toyota extends Car{
    public Toyota( String model, int year, String color, int miles) {
        super("Toyota", model, year, color, miles);
    }
    public void reliable(){
        System.out.println(brand + " "+ model +" is reliable");
    }
    public void start(){
        System.out.println("Twist the key to ignition to start "+brand+" "+model);
    }
}
