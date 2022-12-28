
package yurt_otomasyonu.Person;

import java.util.Objects;

public class Students extends Person{
    
    private String veliadsoyad;
    private int velitelefon;
    private int odano;
    private int blokid;
    

    public Students() {
    }

    public Students(String Name, String Surname, String phone, String e_mail, String blood_group, String Adress, String dogumtarihi, String TC,int grade, String department, String veliadsoyad, int velitelefon, int odano, int blokid) {
               super(Name,Surname,phone,e_mail,blood_group,Adress,dogumtarihi,TC);

      
        this.veliadsoyad = veliadsoyad;
        this.velitelefon = velitelefon;
        this.odano = odano;
        this.blokid = blokid;
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
    
    
    @Override
    public String toString() {
        return "ogrenci " +"Ad: "+super.getName()+"   "+"TC: "+super.getTC()+"  Telefon numarasi: "+super.getPhone()+
                "  Dogum tarihi: "+super.getDogumtarihi()+"  Mail: "+super.getE_mail()+"  Kan grubu: "+super.getBlood_group()+"  Adres: "+super.getAdress() +" veliadsoyad: " + veliadsoyad + "  velitelefon=" 
                        + velitelefon + "  odano:" + odano + "  blok no: " + blokid ;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.veliadsoyad);
        hash = 47 * hash + this.velitelefon;
        hash = 47 * hash + this.odano;
        hash = 47 * hash + this.blokid;
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
        final Students other = (Students) obj;
       
        if (this.velitelefon != other.velitelefon) {
            return false;
        }
        if (this.odano != other.odano) {
            return false;
        }
        if (this.blokid != other.blokid) {
            return false;
        }
              return Objects.equals(this.veliadsoyad, other.veliadsoyad);
    }
    
    
    
}
