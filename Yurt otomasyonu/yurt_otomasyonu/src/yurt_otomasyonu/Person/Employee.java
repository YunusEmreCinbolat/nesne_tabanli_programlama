
package yurt_otomasyonu.Person;

import java.util.Objects;

public class Employee extends Person {
    private String task;
    private int Salary;
    private int seniorty;
    private int working_hours;

    public Employee() {
      
    }

    public Employee(String Name, String Surname, String phone, String e_mail, String blood_group, String Adress, String dogumtarihi, String TC,String task, int Salary, int seniorty, int working_hours) {
        super(Name,Surname,phone,e_mail,blood_group,Adress,dogumtarihi,TC);
        this.task = task;
        this.Salary = Salary;
        this.seniorty = seniorty;
        this.working_hours = working_hours;
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

    @Override
    public String toString() {
        return "Calisan  " + "Ad: " + super.getName() + "  Soyadı: " +super.getSurname() + " TC: " + super.getTC() + "  Doğum Tarihi: " + super.getDogumtarihi() 
                + "  Maas: "+getSalary()+"  Mail: "+super.getE_mail()+"  Görev: "+this.getTask()+" Kan grubu: "+super.getBlood_group()+"  Adres: "+super.getAdress();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.task);
        hash = 59 * hash + this.Salary;
        hash = 59 * hash + this.seniorty;
        hash = 59 * hash + this.working_hours;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.Salary != other.Salary) {
            return false;
        }
        if (this.seniorty != other.seniorty) {
            return false;
        }
        if (this.working_hours != other.working_hours) {
            return false;
        }
        return Objects.equals(this.task, other.task);
    }
    
    
}
