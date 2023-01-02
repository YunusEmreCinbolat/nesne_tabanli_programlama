/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.Domitory;

/**
 *
 * @author user
 */
public class Domitory{  
    int capacity;
    int personel;
    String location;
    int year;
    private block block;
    private dining_hall dininghall;
    
    public Domitory() {
    }

    public Domitory( dining_hall dininghall,block block,int capacity, int personel, String location, int year) {
        this.block=block;
        this.dininghall=dininghall;
        this.capacity = capacity;
        this.personel = personel;
        this.location = location;
        this.year = year;
        
    }

    public dining_hall getDininghall() {
        return dininghall;
    }

    public void setDininghall(dining_hall dininghall) {
        this.dininghall = dininghall;
    }

    public block getBlock() {
        return block;
    }

    public void setBlock(block block) {
        this.block = block;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPersonel() {
        return personel;
    }

    public void setPersonel(int personel) {
        this.personel = personel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
