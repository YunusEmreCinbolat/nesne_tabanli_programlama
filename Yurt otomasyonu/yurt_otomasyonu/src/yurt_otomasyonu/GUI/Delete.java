/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import javax.swing.*;

/**
 *
 * @author user
 */
public class Delete extends JFrame{
    JFrame jframe;
    JLabel silinecekogrID;
    JTextField txtID;
    JButton btndelete;
    public Delete(){
        jframe=new JFrame("Öğrenci Sil");
        silinecekogrID=new JLabel("Silinecek Öğrencinin TC Numarası");
        silinecekogrID.setBounds(100, 50, 200, 50);
        txtID=new JTextField();
        txtID.setBounds(350, 60, 200, 30);
        btndelete=new JButton("Öğrenciyi sil");
        btndelete.setBounds(600, 60, 200, 30);
        jframe.setSize(500, 500);
        jframe.add(silinecekogrID);
        jframe.add(txtID);
        jframe.add(btndelete);
             String data[][]={ {"Yunus Emre","Cinbolat","553****","D","11"},    
                          {"Yunus Emre","Cinbolat","553****","D","11"},    
                          {"Yunus Emre","Cinbolat","553****","D","11"}};    
    String column[]={"AD","SOYAD","Telefon Numarası","Blok","Oda No"};         
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
