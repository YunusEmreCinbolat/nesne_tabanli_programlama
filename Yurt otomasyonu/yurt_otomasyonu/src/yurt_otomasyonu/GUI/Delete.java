/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author user
 */
public class Delete extends JFrame {

    JFrame jframe;
    JLabel silinecekogrID;
    JTextField txtID;
    JButton btndelete;
    JTable jt;
    JScrollPane sp;
    String data[][];
    String column[]={"AD","SOYAD","Telefon Numarası","Blok","Oda No"};  

    public Delete() {
        jframe = new JFrame("Öğrenci Sil");
        
        jframe.setSize(500, 500);
        jframe.add(this.getSilinecekogrID());
        jframe.add(this.getTxtID());
        jframe.add(this.getBtndelete());
        jframe.add(this.getJt());
        
        jframe.setSize(500, 500);
        
        jframe.add(this.getJt());        
        jframe.setLayout(null);
        jframe.setVisible(true);
        getBtndelete().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tc = getTxtID().getText();
            }
        });
    }
    
    public String[][] getData() {
        
        return data;
    }
    
    public void setData(String[][] data) {
        this.data = data;
    }
    
 
    
    public JTable getJt() {
        this.setJt();
        return jt;
    }
    
    public void setJt() {
        jt = new JTable(data, column);        
        jt.setBounds(30, 150, 200, 300);        
        sp = new JScrollPane(jt);
        sp.setBounds(10, 200, 1500, 700);        
    }
    
    public JLabel getSilinecekogrID() {
        this.setSilinecekogrID();
        return silinecekogrID;
    }
    
    public void setSilinecekogrID() {
        silinecekogrID = new JLabel("Silinecek Öğrencinin TC Numarası");
        silinecekogrID.setBounds(100, 50, 200, 50);
    }
    
    public JTextField getTxtID() {
        this.setTxtID();
        return txtID;
    }
    
    public void setTxtID() {
        txtID = new JTextField();
        txtID.setBounds(350, 60, 200, 30);
    }
    
    public JButton getBtndelete() {
        this.setBtndelete();
        return btndelete;
    }
    
    public void setBtndelete() {
        btndelete = new JButton("Öğrenciyi sil");
        btndelete.setBounds(600, 60, 200, 30);
    }
    
}
