package day31_constrouctor.scrumTask;

public class Tester {
    public String name;
    public int employeeId;
    public String jobTitle;
    public double Salary;


    public Tester(String name, int employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        Salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", Salary=$" + Salary +
                '}';
    }
    public void smokeTesting(){
        System.out.println(name+"is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+"is creating ticket");
    }
}
