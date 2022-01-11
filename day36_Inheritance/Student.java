package day36_Inheritance;

public class Student {
    private String name;
    private int age;
    private char gender,grade;
    private String schoolName;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
}
