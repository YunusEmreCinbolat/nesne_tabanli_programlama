/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class RecordList {

    JPanel panel;
    JLabel Ad;
    JLabel Soyad;
    JLabel TC;
    JLabel Telefonno;
    JLabel dogumTarihi;
    JLabel Mail;
    JLabel Adres;
    JLabel kan_grup;
    JTextField txtkangrup;
    JTextField txtAd;
    JTextField txtsoyAd;
    JTextField txtMail;
    JFormattedTextField tcTextField;
    JFormattedTextField telefonTextField;
    JFormattedTextField dogumtarihiTextField;
    JTextField txtadres;
    JButton kaydet;

    public void build() {
        this.setPanel().add(this.getAd());
        this.setPanel().add(this.getAdres());
        this.setPanel().add(this.getDogumTarihi());
        this.setPanel().add(this.getDogumtarihiTextField());
        this.setPanel().add(this.getKan_grup());
        this.setPanel().add(this.getKaydet());
        this.setPanel().add(this.getMail());
        this.setPanel().add(this.getSoyad());
        this.setPanel().add(this.getTC());
        this.setPanel().add(this.getTcTextField());
        this.setPanel().add(this.getTelefonTextField());
        this.setPanel().add(this.getTelefonno());
        this.setPanel().add(this.getTxtAd());
        this.setPanel().add(this.getTxtMail());
        this.setPanel().add(this.getTxtadres());
        this.setPanel().add(this.getTxtkangrup());
        this.setPanel().add(this.getTxtsoyAd());
    }

    public JLabel getAd() {
        this.setAd();
        return Ad;
    }

    public void setAd() {
        Ad = new JLabel("Ad");
        Ad.setBounds(80, 20, 100, 20);

    }

    public JLabel getSoyad() {
        this.setSoyad();
        return Soyad;
    }

    public void setSoyad() {
        Soyad = new JLabel("Soyad");
        Soyad.setBounds(80, 50, 100, 20);
    }

    public JLabel getTC() {
        this.setTC();
        return TC;
    }

    public void setTC() {
        TC = new JLabel("TC");
        TC.setBounds(80, 80, 100, 20);
    }

    public JLabel getTelefonno() {
        this.setTelefonno();
        return Telefonno;
    }

    public void setTelefonno() {
        Telefonno = new JLabel("Telefon Numarası");
        Telefonno.setBounds(80, 110, 100, 20);
    }

    public JLabel getDogumTarihi() {
        this.setDogumTarihi();
        return dogumTarihi;
    }

    public void setDogumTarihi() {
        dogumTarihi = new JLabel("Dogum Tarihi");
        dogumTarihi.setBounds(80, 140, 100, 20);
    }

    public JLabel getMail() {
        this.setMail();
        return Mail;
    }

    public void setMail() {
        Mail = new JLabel("Mail");
        Mail.setBounds(80, 200, 100, 20);
    }

    public JLabel getAdres() {
        this.setAdres();
        return Adres;
    }

    public void setAdres() {
        Adres = new JLabel("Adres");
        Adres.setBounds(80, 330, 100, 20);

    }

    public JLabel getKan_grup() {
        this.setKan_grup();
        return kan_grup;
    }

    public void setKan_grup() {
        kan_grup = new JLabel("Kan Grubu");
        kan_grup.setBounds(80, 290, 100, 20);
    }

    public JTextField getTxtkangrup() {
        this.setTxtkangrup();
        return txtkangrup;
    }

    public void setTxtkangrup() {
        txtkangrup = new JTextField();
        txtkangrup.setBounds(200, 290, 100, 20);
    }

    public JTextField getTxtAd() {
        txtAd = new JTextField();
        txtAd.setBounds(200, 20, 100, 20);
        return txtAd;
    }

    public void setTxtAd() {
    }

    public JTextField getTxtsoyAd() {
        txtsoyAd = new JTextField();
        txtsoyAd.setBounds(200, 50, 100, 20);
        return txtsoyAd;
    }

    public void setTxtsoyAd() {
    }

    public JTextField getTxtMail() {
        this.setTxtMail();
        return txtMail;
    }

    public void setTxtMail() {
        txtMail = new JTextField();
        txtMail.setBounds(200, 200, 100, 20);
    }

    public JFormattedTextField getTcTextField() {
        this.setTcTextField();
        return tcTextField;
    }

    public void setTcTextField() {
        tcTextField = new JFormattedTextField();
        tcTextField.setBounds(200, 80, 100, 20);
    }

    public JFormattedTextField getTelefonTextField() {
        this.setTelefonTextField();
        return telefonTextField;
    }

    public void setTelefonTextField() {
        telefonTextField = new JFormattedTextField();
        telefonTextField.setBounds(200, 110, 100, 20);

    }

    public JFormattedTextField getDogumtarihiTextField() {
        this.setDogumtarihiTextField();
        return dogumtarihiTextField;
    }

    public void setDogumtarihiTextField() {
        dogumtarihiTextField = new JFormattedTextField();
        dogumtarihiTextField.setBounds(200, 140, 100, 20);
    }

    public JTextField getTxtadres() {
        this.setTxtadres();
        return txtadres;
    }

    public void setTxtadres() {
        txtadres = new JTextField();
        txtadres.setSize(10, 10);
        txtadres.setBounds(200, 330, 100, 20);

    }

    public JButton getKaydet() {
        this.setKaydet();
        return kaydet;
    }

    public void setKaydet() {
        kaydet = new JButton("Kaydet");
        kaydet.setBounds(250, 500, 100, 20);
        this.kaydet.addActionListener(new GUIActionListener(this));
    }

    public JPanel setPanel() {
        if (this.panel == null) {
            panel = new JPanel();
            panel.setLayout(null);
        }
        return panel;
    }

}
