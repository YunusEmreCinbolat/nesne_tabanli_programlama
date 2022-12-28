/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.Domitory;

/**
 *
 * @author user
 */
public class Room {
   private int numberroom;
   private int numberbed;
   private int numberoffloors;
    public Room() {
    }

    public Room(int numberroom, int numberbed, int numberoffloors) {
        this.numberroom = numberroom;
        this.numberbed = numberbed;
        this.numberoffloors = numberoffloors;
    }

    public int getNumberroom() {
        return numberroom;
    }

    public void setNumberroom(int numberroom) {
        this.numberroom = numberroom;
    }

    public int getNumberbed() {
        return numberbed;
    }

    public void setNumberbed(int numberbed) {
        this.numberbed = numberbed;
    }

    public int getNumberoffloors() {
        return numberoffloors;
    }

    public void setNumberoffloors(int numberoffloors) {
        this.numberoffloors = numberoffloors;
    }

   
   
    
}
