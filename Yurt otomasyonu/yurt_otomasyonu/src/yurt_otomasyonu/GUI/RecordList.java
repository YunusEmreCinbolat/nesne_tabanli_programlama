/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

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
public class RecordList extends JFrame{
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
    public RecordList(){
    
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
        this.setTxtAd();
        return txtAd;
    }

    public void setTxtAd() {
         txtAd = new JTextField();
         txtAd.setBounds(200, 20, 100, 20);
    }

    public JTextField getTxtsoyAd() {
        this.setTxtsoyAd();
        return txtsoyAd;
    }

    public void setTxtsoyAd() {
      txtsoyAd = new JTextField();
      txtsoyAd.setBounds(200, 50, 100, 20);
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
        kaydet=new JButton("Kaydet");
        kaydet.setBounds(250,500,100,20);
    }

    public JPanel getPanel() {
        this.setPanel();
        return this.panel;
    }

    public void setPanel() {
        if(this.panel==null){
            panel=new JPanel();
            panel.setSize(800, 500);
            this.panel.add(this.getAd());
            this.panel.add(this.getAdres());
            this.panel.add(this.getDogumTarihi());
            this.panel.add(this.getDogumtarihiTextField());
            this.panel.add(this.getKan_grup());
            this.panel.add(this.getKaydet());
            this.panel.add(this.getMail());
            this.panel.add(this.getSoyad());
            this.panel.add(this.getTC());
            this.panel.add(this.getTcTextField());
            this.panel.add(this.getTelefonTextField());
            this.panel.add(this.getTelefonno());
           this.panel.add(this.getTxtAd());
          this.panel.add(this.getTxtMail());
           this.panel.add(this.getTxtadres());
           this.panel.add(this.getTxtkangrup());
           this.panel.add(this.getTxtsoyAd());
           this.setLayout(null);
        }
    }
              

}
