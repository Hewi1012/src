package day20_arrays;
import java.util.Arrays;

public class arrayMonth {
    public static void main(String[] args) {

     String [] months ={"January","February","March","April","May","June","Juliy","August","Septemebr" ,"October","November",
             //          0           1          2       3       4    5      6        7        8            9          10
             "December"};
             //11
        System.out.println(Arrays.toString(months));

    int number = 5;
    if(number <1 ||number > 11){
        System.err.println("Invalid Number");
        System.exit(0);
    }


   System.out.println(months[number-1]) ;

















    }
}
