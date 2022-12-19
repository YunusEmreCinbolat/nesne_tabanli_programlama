/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class PDelete {
    JFrame jframe;
    JLabel silinecekpersonelID;
    JTextField txtID;
    JButton btndelete;
    public PDelete(){
        jframe=new JFrame("Personeli Sil");
        silinecekpersonelID=new JLabel("Silinecek Personelin TC Numarası");
        silinecekpersonelID.setBounds(100, 50, 200, 50);
        txtID=new JTextField();
        txtID.setBounds(350, 60, 200, 30);
        btndelete=new JButton("Personeli sil");
        btndelete.setBounds(600, 60, 200, 30);
        jframe.setSize(500, 500);
        jframe.add(silinecekpersonelID);
        jframe.add(txtID);
        jframe.add(btndelete);
    String data[][]={ {"Ahmet","Yılmaz","534256987","5500","Temizlilk Gorevlisi"},    
                          {"Ahmet","Yılmaz","534256987","5500","Temizlilk Gorevlisi"},    
                          {"Ahmet","Yılmaz","534256987","5500","Temizlilk Gorevlisi"}};    
    String column[]={"Ad","Soyad","Telefon Numarası","Maası","Görevi"};        
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,150,200,300);     
    jframe.setSize(500, 500);
    JScrollPane sp=new JScrollPane(jt);
    sp.setBounds(10, 200, 1500, 700);
    jframe.add(sp);          
        jframe.setLayout(null);
         jframe.setVisible(true);  
    }

}
