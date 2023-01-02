/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import java.awt.AWTEventMulticaster;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import yurt_otomasyonu.Controller.concrates.DomitoryManager;
import yurt_otomasyonu.Person.Employee;
import yurt_otomasyonu.Person.Person;
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class PRecord {
    DomitoryManager domitoryManager;
    JLabel gorev;
    JLabel maas;

    JTextField txtgorev;
    JTextField txtmaas;

    JFrame jframe;
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

    public PRecord() {
        jframe = new JFrame("Personel Kayıt paneli");
        jframe.setSize(1000, 1000);
        jframe.add(this.getGorev());
        jframe.add(this.getMaas());
        jframe.add(this.getTxtgorev());
        jframe.add(this.getTxtgorev());
        jframe.add(this.getTxtmaas());
        jframe.add(this.getAd());
        jframe.add(this.getAdres()) ;
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
        jframe.setLayout(null);
        jframe.setVisible(true);
        kaydet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Employee em = new Employee();
                em.setName(txtAd.getText());
                em.setSurname(txtsoyAd.getText());
                em.setTC(tcTextField.getText());
                em.setPhone(telefonTextField.getText());
                em.setDogumtarihi(dogumtarihiTextField.getText());
                em.setSalary(Integer.parseInt(txtmaas.getText()));
                em.setE_mail(txtMail.getText());
                em.setTask(txtgorev.getText());
                em.setBlood_group(txtkangrup.getText());
                em.setAdress(txtadres.getText());
                domitoryManager=new DomitoryManager();
                domitoryManager.employeeController(em);
            }
        });
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

}
