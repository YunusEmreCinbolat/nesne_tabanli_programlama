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
    String data[][];
    String column[];
    JTable jt;

    public Pallsee() {
        detay = new JButton("Personel Detay");
        f = new JFrame();

        f.setSize(500, 500);
        f.add(this.getJt());
        f.setSize(300, 400);
        f.setVisible(true);
    }

    public JTable getJt() {
        this.setJt();
        return jt;
    }

    public void setJt() {
        jt = new JTable(data, column);

        JScrollPane sp = new JScrollPane(jt);
        sp.setBounds(50, 150, 200, 300);

    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public String[] getColumn() {
        this.setColumn();
        return column;
    }

    public void setColumn() {
        this.column = {"Ad"
        ,"Soyad","Telefon Numarası","Maası","Görevi"};
    }

}
