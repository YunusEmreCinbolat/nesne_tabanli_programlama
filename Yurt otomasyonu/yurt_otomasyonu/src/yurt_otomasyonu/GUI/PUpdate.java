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
public class PUpdate extends JFrame {

    RecordList rc;
    JFrame jframe;
    JLabel guncelpersonelID;
    JTextField txtID;
    JButton btnguncel;
    JLabel gorev;
    JLabel maas;
    JTextField txtgorev;
    JTextField txtmaas;

    public PUpdate() {
        rc = new RecordList();
        jframe = new JFrame("Personel Güncelle");
        rc = new RecordList();

        jframe.setContentPane(rc.setPanel());
        rc.build();

        jframe.setSize(500, 500);
        jframe.add(this.getGuncelpersonelID());
        jframe.add(this.getTxtID());
        jframe.add(this.getBtnguncel());
        jframe.setSize(500, 500);
        jframe.add(this.getMaas());
        jframe.add(this.getTxtmaas());
        jframe.add(this.getGorev());
        jframe.add(this.getTxtgorev());
        jframe.setLayout(null);
        jframe.setVisible(true);

    }

    public JLabel getGuncelpersonelID() {
        this.setGuncelpersonelID();
        return this.guncelpersonelID;
    }

    public void setGuncelpersonelID() {
        guncelpersonelID = new JLabel("Güncellenecek Personelin TC Numarası");
        guncelpersonelID.setBounds(350, 50, 250, 50);
    }

    public JTextField getTxtID() {
        this.setTxtID();
        return txtID;
    }

    public void setTxtID() {
        txtID = new JTextField();
        txtID.setBounds(600, 60, 200, 30);
    }

    public JButton getBtnguncel() {
        this.setBtnguncel();

        return btnguncel;
    }

    public void setBtnguncel() {
        btnguncel = new JButton("Personeli Getir");
        btnguncel.setBounds(850, 60, 150, 50);
    }

    public JLabel getGorev() {
        this.setGorev();
        return gorev;
    }

    public void setGorev() {
        gorev = new JLabel("Gorev ");
        gorev.setBounds(80, 350, 100, 20);
    }

    public JLabel getMaas() {
        this.setMaas();
        return maas;
    }

    public void setMaas() {
        maas = new JLabel("Maas ");
        maas.setBounds(80, 270, 100, 20);
    }

    public JTextField getTxtgorev() {
        this.setTxtgorev();
        return txtgorev;
    }

    public void setTxtgorev() {
        txtgorev = new JTextField();
        txtgorev.setBounds(200, 350, 100, 20);
    }

    public JTextField getTxtmaas() {
        this.setTxtmaas();
        return txtmaas;
    }

    public void setTxtmaas() {
        txtmaas = new JTextField();

        txtmaas.setBounds(200, 270, 100, 20);

    }

}