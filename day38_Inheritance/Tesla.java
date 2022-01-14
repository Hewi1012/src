package day38_Inheritance;

public class Tesla extends Car{
    public Tesla( String model, int year, String color, int miles) {
        super("Tesla", model, year, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand + " "+ model +" is AutoPilot mode");
    }
    @Override
    public void start() {
        System.out.println("Say \"Start\" to start "+brand+" "+model);
    }

}
