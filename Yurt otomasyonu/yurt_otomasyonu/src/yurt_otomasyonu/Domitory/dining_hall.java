/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.Domitory;

/**
 *
 * @author user
 */
public class dining_hall {
    private int numberoftable;
    private int numberoftill;
    private int numberofpersons;
    private String location;

    public dining_hall() {
    }

    public dining_hall(int numberoftable, int numberoftill, int numberofpersons, String location) {
        this.numberoftable = numberoftable;
        this.numberoftill = numberoftill;
        this.numberofpersons = numberofpersons;
        this.location = location;
    }

    public int getNumberoftable() {
        return numberoftable;
    }

    public void setNumberoftable(int numberoftable) {
        this.numberoftable = numberoftable;
    }

    public int getNumberoftill() {
        return numberoftill;
    }

    public void setNumberoftill(int numberoftill) {
        this.numberoftill = numberoftill;
    }

    public int getNumberofpersons() {
        return numberofpersons;
    }

    public void setNumberofpersons(int numberofpersons) {
        this.numberofpersons = numberofpersons;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
}
