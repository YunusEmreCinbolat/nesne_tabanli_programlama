/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author user
 */
public class Pallsee extends JFrame {
      JFrame f;    
      JButton detay;
    public Pallsee(){
    detay=new JButton("Personel Detay");
    f=new JFrame();    
    String data[][]={ {"Ahmet","Yılmaz","534256987","5500","Temizlilk Gorevlisi"},    
                          {"Ahmet","Yılmaz","534256987","5500","Temizlilk Gorevlisi"},    
                          {"Ahmet","Yılmaz","534256987","5500","Temizlilk Gorevlisi"}};    
    String column[]={"Ad","Soyad","Telefon Numarası","Maası","Görevi"};         
    JTable jt=new JTable(data,column);    
        
    f.setSize(500, 500);
    JScrollPane sp=new JScrollPane(jt); 
    sp.setBounds(50, 150, 200, 300);
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);
}     
}
