/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.Person;

import java.util.Objects;

/**
 *
 * @author user
 */
public class Person {
    private String Name;
    private String Surname;
    private String phone;
    private String e_mail;
    private String blood_group;
    private String Adress;
    private String dogumtarihi;
    private String TC;

    public Person() {
    }

    public Person(String Name, String Surname, String phone, String e_mail, String blood_group, String Adress, String dogumtarihi, String TC) {
        this.Name = Name;
        this.Surname = Surname;
        this.phone = phone;
        this.e_mail = e_mail;
        this.blood_group = blood_group;
        this.Adress = Adress;
        this.dogumtarihi = dogumtarihi;
        this.TC = TC;
    }
    

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

   
  
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + ", Surname=" + Surname + ", phone=" + phone + ", e_mail=" + e_mail + ", blood_group=" + blood_group + ", Adress=" + Adress + ", dogumtarihi=" + dogumtarihi + ", TC=" + TC + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.Name);
        hash = 97 * hash + Objects.hashCode(this.Surname);
        hash = 97 * hash + Objects.hashCode(this.phone);
        hash = 97 * hash + Objects.hashCode(this.e_mail);
        hash = 97 * hash + Objects.hashCode(this.blood_group);
        hash = 97 * hash + Objects.hashCode(this.Adress);
        hash = 97 * hash + Objects.hashCode(this.dogumtarihi);
        hash = 97 * hash + Objects.hashCode(this.TC);
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.Surname, other.Surname)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.e_mail, other.e_mail)) {
            return false;
        }
        if (!Objects.equals(this.blood_group, other.blood_group)) {
            return false;
        }
        if (!Objects.equals(this.Adress, other.Adress)) {
            return false;
        }
        if (!Objects.equals(this.dogumtarihi, other.dogumtarihi)) {
            return false;
        }
        return Objects.equals(this.TC, other.TC);
    }
       
    
}
