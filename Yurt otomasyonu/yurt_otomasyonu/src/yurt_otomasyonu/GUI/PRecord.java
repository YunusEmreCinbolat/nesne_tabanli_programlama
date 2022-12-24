/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import yurt_otomasyonu.Person.Employee;
import yurt_otomasyonu.Person.Person;
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class PRecord extends RecordList {

    JPanel jp;
    RecordList rc;

    JLabel gorev;
    JLabel maas;

    JTextField txtgorev;
    JTextField txtmaas;

    JFrame jframe;

    public PRecord() {
        jframe = new JFrame("Personel Kayıt paneli");
        jframe.setSize(1000, 1000);
        rc = new RecordList();

        jframe.setContentPane(rc.setPanel());
        rc.build();
        jframe.add(this.getGorev());
        jframe.add(this.getMaas());
        jframe.add(this.getTxtgorev());
        jframe.add(this.getTxtgorev());
        jframe.add(this.getTxtmaas());
        jframe.setVisible(true);
    }

    public JLabel getGorev() {
        this.setGorev();
        return gorev;
    }

    public void setGorev() {

        gorev = new JLabel("Gorev ");
        gorev.setBounds(80, 250, 100, 20);
    }

    public JLabel getMaas() {
        this.setMaas();
        return maas;
    }

    public void setMaas() {
        maas = new JLabel("Maas ");
        maas.setBounds(80, 170, 100, 20);
    }

    public JTextField getTxtgorev() {
        this.setTxtgorev();
        return txtgorev;
    }

    public void setTxtgorev() {
        txtgorev = new JTextField();
        txtgorev.setBounds(200, 250, 100, 20);

    }

    public JTextField getTxtmaas() {
        this.setTxtmaas();
        return txtmaas;
    }

    public void setTxtmaas() {

        txtmaas = new JTextField();

        txtmaas.setBounds(200, 170, 100, 20);
    }

    public JPanel setJp() {
        if (this.jp == null) {
            jp = new JPanel();
            jp.setLayout(null);
        }
        return jp;
    }

}
