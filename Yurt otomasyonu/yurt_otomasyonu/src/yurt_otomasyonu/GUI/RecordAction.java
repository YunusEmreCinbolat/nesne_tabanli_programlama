/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import yurt_otomasyonu.Controller.concrates.DomitoryManager;
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class RecordAction implements ActionListener    {
    Record record;
    DomitoryManager domitoryManager;
    public RecordAction(Record record) {
        this.record = record;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
          Students p=new Students();
                p.setName(record.txtAd.getText());
                p.setSurname(record.txtsoyAd.getText());
                p.setTC(record.tcTextField.getText());
                p.setPhone((record.telefonTextField.getText()));
                p.setDogumtarihi(record.dogumtarihiTextField.getText());
                p.setE_mail(record.txtMail.getText());
                p.setBlokid((Integer.parseInt(record.txtblok.getText())));
                p.setBlood_group(record.txtkangrup.getText());
                p.setAdress(record.txtadres.getText());
                p.setOdano((Integer.parseInt(record.txtodano.getText())));
                p.setVeliadsoyad(record.txtVelisoyAd.getText());
                p.setVelitelefon((Integer.parseInt(record.velitelefonTextField.getText())));
                domitoryManager=new DomitoryManager();
                domitoryManager.studentController(p);
                
    }
    
}
