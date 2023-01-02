/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.Domitory;

/**
 *
 * @author user
 */
public class block {
    private String name;
    private int numberoffloors;
    private String location;
    private int numberofpersons;
    private Room room;

    public block() {
    }

    public block(Room room,String name, int numberoffloors, String location, int numberofpersons) {
       this.room=room;
        this.name = name;
        this.numberoffloors = numberoffloors;
        this.location = location;
        this.numberofpersons = numberofpersons;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberoffloors() {
        return numberoffloors;
    }

    public void setNumberoffloors(int numberoffloors) {
        this.numberoffloors = numberoffloors;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberofpersons() {
        return numberofpersons;
    }

    public void setNumberofpersons(int numberofpersons) {
        this.numberofpersons = numberofpersons;
    }
    
    
}
