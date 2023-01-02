/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import yurt_otomasyonu.Controller.concrates.DomitoryManager;
import yurt_otomasyonu.Person.Employee;

/**
 *
 * @author user
 */
public class PrecordAction implements ActionListener{
     PRecord precord;
     DomitoryManager domitoryManager;
    public PrecordAction(PRecord precord) {
        this.precord = precord;
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
          Employee em = new Employee();
                em.setName(precord.txtAd.getText());
                em.setSurname(precord.txtsoyAd.getText());
                em.setTC(precord.tcTextField.getText());
                em.setPhone(precord.telefonTextField.getText());
                em.setDogumtarihi(precord.dogumtarihiTextField.getText());
                em.setSalary(Integer.parseInt(precord.txtmaas.getText()));
                em.setE_mail(precord.txtMail.getText());
                em.setTask(precord.txtgorev.getText());
                em.setBlood_group(precord.txtkangrup.getText());
                em.setAdress(precord.txtadres.getText());
                domitoryManager=new DomitoryManager();
                domitoryManager.employeeController(em);
        
    }
    
           
    
}
