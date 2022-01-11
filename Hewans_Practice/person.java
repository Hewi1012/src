package Hewans_Practice;

public class person {
    public String name;
    public int age;
    public char Gender;

    public static boolean isHuman, hasNose, hasWings, numberOfhead, numberofEyes;

    public person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        Gender = gender;}

        public String eat() {
            System.out.println(name + "is eating");
            return name;

        }
        public String drink() {
            System.out.println(name + "is drinking");
            return name;
        }
        public String sleep() {
            System.out.println(name + "sleeping");
            return name;
        }

        public String toString () {
            return "person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", Gender=" + Gender +
                    ", eat=" + "is eating" +
                    ", drink=" + "is drinking" +
                    ", sleep=" + "is sleeping" +
                    '}';
        }
    }


