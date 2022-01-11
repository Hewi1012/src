package Hewans_Practice;

public class Cydeo {
    public String name;
   public int age;
   public char Gender;
   public char id;
   public char Grade;
   public int BatchNumber;
   public int GroupNumber;
   public static String SchoolName="cydeo";
   public static String programingLanguage = "java";

   public Cydeo(String name, int age, char gender, char id, char grade, int batchNumber, int groupNumber) {
      this.name = name;
      this.age = age;
      Gender = gender;
      this.id = id;
      Grade = grade;
      BatchNumber = batchNumber;
      GroupNumber = groupNumber;
   }

   public void study() {
         System.out.println(name + "is Studing");
      }
      public void attendClass(){
         System.out.println(name+"is present");
      }
      public void printSchoolName(){
         System.out.println("schoolName");
      }
      public void programingLanguage(){
         System.out.println("java");
      }
   public String toString() {
      return "cydeoStudentTask{" +
              "name='" + name + '\'' +
              ", age=" + age +
              ", Gender='" + Gender + '\'' +
              ", id=" + id +
              ", Grade=" + Grade +
              ", study=" + "is studying "+
              ", printSchoolName=" + "schoolName" +
              ", programingLanguage =" + "java" +
              ", attendClass=" + "is present" +

              '}';
   }
   }




