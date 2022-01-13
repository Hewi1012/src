package day38_Inheritance;

public class BMW extends Car{
    public BMW( String model, int year, String color, int miles) {
        super("BMW", model, year, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand + " "+ model +" is breaking down");
    }

    public void racing(){
        System.out.println(brand + " "+ model +" is a racing car");
    }

}
