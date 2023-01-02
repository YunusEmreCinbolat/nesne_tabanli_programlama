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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import yurt_otomasyonu.Controller.concrates.DomitoryManager;
import yurt_otomasyonu.Person.Person;
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class Record extends JFrame {

    JLabel Blok;
    JLabel Odano;
    JLabel VeliAdSoyad;
    JLabel VeliTelefon;
    JLabel sinif;

    JTextField txtVelisoyAd;
    JTextField txtblok;
    JTextField txtodano;
    JTextField velitelefonTextField;
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
    JTextField tcTextField;
    JTextField telefonTextField;
    JTextField dogumtarihiTextField;
    JTextField txtadres;
    JButton kaydet;
    DomitoryManager domitoryManager;

    JFrame jframe;

    public Record() {
        jframe = new JFrame("Kayıt paneli");
        jframe.setSize(500, 50);
        jframe.add(this.getBlok());
        jframe.add(this.getOdano());
        jframe.add(this.getTxtVelisoyAd());
        jframe.add(this.getTxtblok());
        jframe.add(this.getTxtodano());
        jframe.add(this.getVeliAdSoyad());
        jframe.add(this.getVeliTelefon());
        jframe.add(this.getVelitelefonTextField());
        jframe.add(this.getAd());
        jframe.add(this.getAdres());
        jframe.add(this.getDogumTarihi());
        jframe.add(this.getDogumtarihiTextField());
        jframe.add(this.getKan_grup());
        jframe.add(this.getKaydet());
        jframe.add(this.getMail());
        jframe.add(this.getSoyad());
        jframe.add(this.getTC());
        jframe.add(this.getTcTextField());
         jframe.add(this.getTelefonTextField());
        jframe.add(this.getTelefonno());
         jframe.add(this.getTxtAd());
         jframe.add(this.getTxtMail());
         jframe.add(this.getTxtadres());
         jframe.add(this.getTxtkangrup());
         jframe.add(this.getTxtsoyAd());
        kaydet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Students p=new Students();
                p.setName(txtAd.getText());
                p.setSurname(txtsoyAd.getText());
                p.setTC(tcTextField.getText());
                p.setPhone((telefonTextField.getText()));
                p.setDogumtarihi(dogumtarihiTextField.getText());
                p.setE_mail(txtMail.getText());
                p.setBlokid((Integer.parseInt(txtblok.getText())));
                p.setBlood_group(txtkangrup.getText());
                p.setAdress(txtadres.getText());
                p.setOdano((Integer.parseInt(txtodano.getText())));
                p.setVeliadsoyad(txtVelisoyAd.getText());
                p.setVelitelefon((Integer.parseInt(velitelefonTextField.getText())));
                domitoryManager=new DomitoryManager();
                domitoryManager.studentController(p);
                
            }
        });
        
        jframe.setLayout(null);
        jframe.setVisible(true);
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

    public JTextField getTcTextField() {
        this.setTcTextField();
        return tcTextField;
    }

    public void setTcTextField() {
        tcTextField = new JFormattedTextField();
        tcTextField.setBounds(200, 80, 100, 20);
    }

    public JTextField getTelefonTextField() {
        this.setTelefonTextField();
        return telefonTextField;
    }

    public void setTelefonTextField() {
        telefonTextField = new JFormattedTextField();
        telefonTextField.setBounds(200, 110, 100, 20);

    }

    public JTextField getDogumtarihiTextField() {
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
    }

    public JLabel getBlok() {
        this.setBlok();
        return Blok;
    }

    public void setBlok() {
        Blok = new JLabel("Blok");
        Blok.setBounds(80, 270, 100, 20);
    }

    public JLabel getOdano() {
        this.setOdano();
        return Odano;
    }

    public void setOdano() {
        Odano = new JLabel("Oda no");
        Odano.setBounds(80, 370, 100, 20);
    }

    public JLabel getVeliAdSoyad() {
        this.setVeliAdSoyad();
        return VeliAdSoyad;
    }

    public void setVeliAdSoyad() {
        VeliAdSoyad = new JLabel("Veli ad soyad");
        VeliAdSoyad.setBounds(80, 420, 100, 20);

    }

    public JLabel getVeliTelefon() {
        this.setVeliTelefon();
        return VeliTelefon;
    }

    public void setVeliTelefon() {
        VeliTelefon = new JLabel("Veli Telefon");
        VeliTelefon.setBounds(80, 470, 100, 20);
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
        txtVelisoyAd.setBounds(200, 420, 100, 20);
    }

    public JTextField getTxtblok() {
        this.setTxtblok();
        return txtblok;
    }

    public void setTxtblok() {
        txtblok = new JTextField();
        txtblok.setBounds(200, 270, 100, 20);

    }

    public JTextField getTxtodano() {
        this.setTxtodano();
        return txtodano;
    }

    public void setTxtodano() {
        txtodano = new JTextField();
        txtodano.setBounds(200, 370, 100, 20);

    }

    public JTextField getVelitelefonTextField() {
        this.setVelitelefonTextField();
        return velitelefonTextField;
    }

    public void setVelitelefonTextField() {
        velitelefonTextField = new JTextField();
        velitelefonTextField.setBounds(200, 470, 100, 20);

    }
}
