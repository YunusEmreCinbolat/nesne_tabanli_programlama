/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author user
 */
public class SAllsee extends JFrame {
    JFrame f;    
    public SAllsee(){    
    f=new JFrame();    
          String data[][]={ {"Yunus Emre","Cinbolat","553****","D","11"},    
                          {"Yunus Emre","Cinbolat","553****","D","11"},    
                          {"Yunus Emre","Cinbolat","553****","D","11"}};    
    String column[]={"AD","SOYAD","Telefon Numarası","Blok","Oda No"};             
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,150,200,300);     
    f.setSize(500, 500);
    JScrollPane sp=new JScrollPane(jt);
    sp.setBounds(10, 200, 1500, 700);
    f.add(sp);          
    f.setSize(500, 500);

    f.setSize(300,400);    
    f.setVisible(true);
}     
    
}
