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
    String data[][];
    String column[];
    JTable jt;
    JScrollPane sp;

    public SAllsee() {
        f = new JFrame();

        f.add(sp);
        f.setSize(500, 500);
        f.setSize(300, 400);
        f.setVisible(true);
    }

    public JTable getJt() {
        return jt;
    }

    public void setJt(JTable jt) {
        jt = new JTable(data, column);
        jt.setBounds(30, 150, 200, 300);
        sp = new JScrollPane(jt);
        sp.setBounds(10, 200, 1500, 700);
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public String[] getColumn() {
        return column;
    }

    public void setColumn(String[] column) {
        this.column =  =
        {"AD"
        ,"SOYAD","Telefon Numarası","Blok","Oda No"};
    }

}