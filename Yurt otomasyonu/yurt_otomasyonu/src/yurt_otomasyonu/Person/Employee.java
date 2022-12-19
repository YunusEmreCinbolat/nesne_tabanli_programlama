
package yurt_otomasyonu.Person;

public class Employee extends Person {
    private String task;
    private int Salary;
    private int seniorty;
    private int working_hours;

    public Employee() {
      
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public int getSeniorty() {
        return seniorty;
    }

    public void setSeniorty(int seniorty) {
        this.seniorty = seniorty;
    }

    public int getWorking_hours() {
        return working_hours;
    }

    public void setWorking_hours(int working_hours) {
        this.working_hours = working_hours;
    }
    
    
}
