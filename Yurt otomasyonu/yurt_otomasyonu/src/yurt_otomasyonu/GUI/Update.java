/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class Update extends JFrame {

    JFrame jframe;
    RecordList rc;
    JLabel guncelogrID;
    JTextField txtID;
    JButton btnguncel;
    JLabel Blok;
    JLabel Odano;
    JLabel VeliAdSoyad;
    JLabel VeliTelefon;
    JLabel sinif;
    JTextField txtVelisoyAd;
    JTextField txtblok;
    JTextField txtodano;
    JFormattedTextField velitelefonTextField;

    public Update() {
        rc = new RecordList();
        jframe = new JFrame("Öğrenci Güncelle");
        jframe.setSize(500, 500);
        rc = new RecordList();

        jframe.setContentPane(rc.setPanel());
        rc.build();
        jframe.add(this.getGuncelogrID());
        jframe.add(this.getTxtID());
        jframe.add(this.getBtnguncel());
        jframe.setSize(500, 50);
        jframe.add(this.getTxtVelisoyAd());
        jframe.add(this.getBlok());
        jframe.add(this.getTxtblok());
        jframe.add(this.getTxtodano());
        jframe.add(this.getVelitelefonTextField());
        jframe.add(this.getOdano());
        jframe.add(this.getVeliAdSoyad());
        jframe.add(this.getVeliTelefon());

        jframe.setLayout(null);
        jframe.setVisible(true);
    }

    public JLabel getGuncelogrID() {
        this.setGuncelogrID();
        return guncelogrID;
    }

    public void setGuncelogrID() {
        guncelogrID = new JLabel("Güncellenecek Öğrencinin TC Numarası");
        guncelogrID.setBounds(350, 50, 250, 50);
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
        btnguncel = new JButton("Öğrenciyi Getir");
        btnguncel.setBounds(850, 60, 150, 50);
    }

    public JLabel getBlok() {
        this.setBlok();
        return Blok;
    }

    public void setBlok() {
        Blok = new JLabel("Blok");
        Blok.setBounds(80, 370, 100, 20);
    }

    public JLabel getOdano() {
        this.setOdano();
        return Odano;
    }

    public void setOdano() {
        Odano = new JLabel("Oda no");
        Odano.setBounds(80, 470, 100, 20);
    }

    public JLabel getVeliAdSoyad() {
        this.setVeliAdSoyad();
        return VeliAdSoyad;
    }

    public void setVeliAdSoyad() {
        VeliAdSoyad = new JLabel("Veli ad soyad");
        VeliAdSoyad.setBounds(80, 520, 100, 20);
    }

    public JLabel getVeliTelefon() {
        this.setVeliTelefon();
        return VeliTelefon;
    }

    public void setVeliTelefon() {
        VeliTelefon = new JLabel("Veli Telefon");
        VeliTelefon.setBounds(80, 570, 100, 20);
    }

    public JLabel getSinif() {
        return sinif;
    }

    public void setSinif(JLabel sinif) {
        this.sinif = sinif;
    }

    public JTextField getTxtVelisoyAd() {
        this.setTxtVelisoyAd();
        return txtVelisoyAd;
    }

    public void setTxtVelisoyAd() {
        txtVelisoyAd = new JTextField();
        txtVelisoyAd.setBounds(200, 520, 100, 20);
    }

    public JTextField getTxtblok() {
        this.setTxtblok();
        return txtblok;
    }

    public void setTxtblok() {
        txtblok = new JTextField();
        txtblok.setBounds(200, 370, 100, 20);

    }

    public JTextField getTxtodano() {
        this.setTxtodano();
        return txtodano;
    }

    public void setTxtodano() {
        txtodano = new JTextField();
        txtodano.setBounds(200, 470, 100, 20);
    }

    public JFormattedTextField getVelitelefonTextField() {
        this.setVelitelefonTextField();
        return velitelefonTextField;
    }

    public void setVelitelefonTextField() {
        velitelefonTextField = new JFormattedTextField();
        velitelefonTextField.setBounds(200, 570, 100, 20);
    }

}
