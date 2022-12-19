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
import yurt_otomasyonu.Business.concrates.DomitoryManager;
import yurt_otomasyonu.Person.Person;
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class Record extends JFrame {
      RecordList rc;

      DomitoryManager domitorymanager;
    
      JLabel Blok;
      JLabel Odano;
      JLabel VeliAdSoyad;
      JLabel VeliTelefon;
      JLabel sinif;
    
      JTextField txtVelisoyAd;
      JTextField txtblok;
      JTextField txtodano;
      JTextField velitelefonTextField;
    
      JFrame jframe;

    public Record(){
        rc=new RecordList();
        domitorymanager= new DomitoryManager();
        jframe=new JFrame("Kayıt paneli");
        jframe.setSize(500, 50);
        jframe.add(rc.getKaydet());
        jframe.add(rc.getAd());
        jframe.add(rc.getAdres());
        jframe.add(rc.getDogumTarihi());
        jframe.add(rc.getDogumtarihiTextField());
        jframe.add(rc.getKan_grup());
        jframe.add(rc.getMail());
        jframe.add(rc.getSoyad());
        jframe.add(rc.getTC());
        jframe.add(rc.getTcTextField());
        jframe.add(rc.getTelefonTextField());
        jframe.add(rc.getTelefonno());
        jframe.add(rc.getTxtAd());
        jframe.add(rc.getTxtadres());
        jframe.add(rc.getTxtMail());
        jframe.add(rc.getTxtkangrup());
        jframe.add(rc.getTxtsoyAd());
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
    public JLabel getBlok() {
        this.setBlok();
        return Blok;
    }

    public void setBlok() {
          Blok=new JLabel("Blok");
        Blok.setBounds(80, 270, 100, 20);
    }

    public JLabel getOdano() {
        this.setOdano();
        return Odano;
    }

    public void setOdano() {
         Odano=new JLabel("Oda no");
        Odano.setBounds(80,370 , 100, 20);
    }

    public JLabel getVeliAdSoyad() {
        this.setVeliAdSoyad();
        return VeliAdSoyad;
    }

    public void setVeliAdSoyad( )
    {
         VeliAdSoyad=new JLabel("Veli ad soyad");
        VeliAdSoyad.setBounds(80,420 , 100, 20);

    }

    public JLabel getVeliTelefon() {
        this.setVeliTelefon();
        return VeliTelefon;
    }

    public void setVeliTelefon( ) {
         VeliTelefon=new JLabel("Veli Telefon");
        VeliTelefon.setBounds(80,470 , 100, 20);
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
        
         txtVelisoyAd=new JTextField();
        txtVelisoyAd.setBounds(200, 420, 100, 20);
    }

    public JTextField getTxtblok() {
        this.setTxtblok();
        return txtblok;
    }

    public void setTxtblok() {
        txtblok=new JTextField();
         txtblok.setBounds(200, 270,100,20);
             
    }

    public JTextField getTxtodano() {
        this.setTxtodano();
        return txtodano;
    }

    public void setTxtodano() {
             txtodano=new JTextField();  
        txtodano.setBounds(200, 370, 100, 20);

    }

    public JTextField getVelitelefonTextField() {
        this.setVelitelefonTextField();
        return velitelefonTextField;
    }

    public void setVelitelefonTextField() {
         velitelefonTextField=new JTextField();
        velitelefonTextField.setBounds(200, 470, 100, 20);
     
    }
}