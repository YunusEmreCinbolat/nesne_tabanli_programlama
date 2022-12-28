/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.Person;

/**
 *
 * @author user
 */
public class Yonetici extends Person {
    private String ad="Yazilim";
    private String sifre="inonu";

    public Yonetici() {
    }

    public Yonetici(String Name, String Surname, String phone, String e_mail, String blood_group, String Adress, String dogumtarihi, String TC) {
        super(Name, Surname, phone, e_mail, blood_group, Adress, dogumtarihi, TC);
    }
    
    

    public String getAd() {
        return ad;
    }


    public String getSifre() {
        return sifre;
    }

  
    
    
}
