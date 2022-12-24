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
    String data[][];
    String column[];
    JTable jt;
    JScrollPane sp;

    public PDelete() {
        jframe = new JFrame("Personeli Sil");

        jframe.setSize(500, 500);
        jframe.add(this.getSilinecekpersonelID());
        jframe.add(this.getTxtID());
        jframe.add(this.getBtndelete());

        jframe.add(this.getJt());
        jframe.setLayout(null);
        jframe.setVisible(true);
    }

    public JTable getJt() {
        this.setJt();
        return jt;
    }

    public void setJt() {
        jt = new JTable(data, column);
        jt.setBounds(30, 150, 200, 300);
        jframe.setSize(500, 500);
        JScrollPane sp = new JScrollPane(jt);
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
        column =    {"Ad"
        ,"Soyad","Telefon Numarası","Maası","Görevi"};

    }

    public JLabel getSilinecekpersonelID() {
        this.setSilinecekpersonelID();
        return silinecekpersonelID;
    }

    public void setSilinecekpersonelID() {
        silinecekpersonelID = new JLabel("Silinecek Personelin TC Numarası");
        silinecekpersonelID.setBounds(100, 50, 200, 50);
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
        btndelete = new JButton("Personeli sil");
        btndelete.setBounds(600, 60, 200, 30);
    }

}
