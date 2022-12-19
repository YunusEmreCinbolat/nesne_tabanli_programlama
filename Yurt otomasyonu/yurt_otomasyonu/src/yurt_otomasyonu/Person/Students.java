
package yurt_otomasyonu.Person;

public class Students extends Person{
    private int grade;
    private String department;
    private String veliadsoyad;
    private int velitelefon;
    private int odano;
    private int blokid;
    public Students(int grade, String department) {
        this.grade = grade;
        this.department = department;
    }

    public Students() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getBlokid() {
        return blokid;
    }

    public void setBlokid(int blokid) {
        this.blokid = blokid;
    }
    
    public int getOdano() {
        return odano;
    }

    public void setOdano(int odano) {
        this.odano = odano;
    }

    public String getVeliadsoyad() {
        return veliadsoyad;
    }

    public void setVeliadsoyad(String veliadsoyad) {
        this.veliadsoyad = veliadsoyad;
    }

    public int getVelitelefon() {
        return velitelefon;
    }

    public void setVelitelefon(int velitelefon) {
        this.velitelefon = velitelefon;
    }
    
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    
    
}
