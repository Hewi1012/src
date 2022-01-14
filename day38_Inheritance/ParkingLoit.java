package day38_Inheritance;

public class ParkingLoit {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("camery", 2020, "gray", 2000);


        Tesla tesla = new Tesla("Model S", 2022, "Red", 12000);

        BMW BMW = new BMW("BMW s", 2023, "red", 20000);
        toyota.start();
        tesla.start();
        BMW.start();

    }
}