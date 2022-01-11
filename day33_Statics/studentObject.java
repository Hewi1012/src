package day33_Statics;
import java.util.Arrays;
public class studentObject {
    public static void main(String[] args) {

        Student student1=new Student("hewan") ;
        Student student2=new Student("hew",'A') ;
        Student student3=new Student("hewa",11) ;
        Student student4=new Student("hewo",12,'F') ;
        Student student5=new Student("hewanna",'M',28) ;
        Student student6=new Student("hewi",'M',27,15) ;
        Student student7=new Student("hewanG",'M',42,'r');


        System.out.println(student1==student2);
        Student[] students={student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));















    }
}
