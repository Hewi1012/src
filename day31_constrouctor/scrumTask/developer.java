package day31_constrouctor.scrumTask;

public class developer {
    public String name;
    public int employeeId;
    public String jobTitle;
    public double Salary;

    public developer(String name, int employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        Salary = salary;
    }

    public String toString() {
        return "developer{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", Salary=$" + Salary +
                '}';
    }
    public void coding(){
        System.out.println(name+"is coding");
    }
    public void unitTesting(){
        System.out.println(name+"is unitTesting");
    }
    public void fixingBug(){
        System.out.println(name+"is fixing Bug");
    }
}
