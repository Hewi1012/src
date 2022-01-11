package day35_Encapsulation.encapsulation;

public class Employee {
  private String name;
  private char age;
  private int gender;
  private double salary;

    public String getName() {
        return name;
    }

    public char getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(char age) {
        this.age = age;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
    /*1. Create an Employee Class:
    private variables:
    name, gender, age, salary

    Encapsulate all the private fields

                1. Name can not be empty
                2. gender can not anything other than female or male
                3. age can not be zero , negative or greater than 150
            4. salary can not be zero or negative
     /**

}
    }

     */