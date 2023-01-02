/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import yurt_otomasyonu.Controller.concrates.DataUpdate;
import yurt_otomasyonu.DataAccess.concrates.FileAccesReader;
import yurt_otomasyonu.Person.Employee;

/**
 *
 * @author user
 */
public class PUpdateAction implements ActionListener {

    PUpdate pupdate;

    public PUpdateAction(PUpdate pupdate) {
        this.pupdate = pupdate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FileAccesReader fc = new FileAccesReader();
        Employee[] emp = new Employee[100];
        try {
             emp = fc.EmployeeReader();
            int i;
            for (i = 0; i < emp.length; i++) {
                if (pupdate.txtID.getText().equals(emp[i].getTC())) {
                    break;
                }

            }
            pupdate.txtAd.setText(emp[i].getName());
            pupdate.txtsoyAd.setText(emp[i].getSurname());
            pupdate.tcTextField.setText(emp[i].getTC());
            pupdate.telefonTextField.setText(emp[i].getPhone());
            pupdate.dogumtarihiTextField.setText(emp[i].getDogumtarihi());
           // pupdate.txtmaas.setText(Integer.toString(emp[i].getSalary()));
            pupdate.txtMail.setText(emp[i].getE_mail());
            pupdate.txtgorev.setText(emp[i].getTask());
            pupdate.txtkangrup.setText(emp[i].getBlood_group());
            pupdate.txtadres.setText(emp[i].getAdress());

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
          fc = new FileAccesReader();

                try {
                    emp = fc.EmployeeReader();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(PUpdate.class.getName()).log(Level.SEVERE, null, ex);
                }
                int i;
                for (i = 0; i < emp.length; i++) {
                    if (pupdate.txtID.getText().equals(emp[i].getTC())) {
                        emp[i].setName(pupdate.txtAd.getText());
                        emp[i].setSurname(pupdate.txtsoyAd.getText());
                        emp[i].setTC(pupdate.tcTextField.getText());
                        emp[i].setPhone(pupdate.telefonTextField.getText());
                        emp[i].setDogumtarihi(pupdate.dogumtarihiTextField.getText());
                        emp[i].setSalary(Integer.parseInt(pupdate.txtmaas.getText()));
                        emp[i].setE_mail(pupdate.txtMail.getText());
                        emp[i].setTask(pupdate.txtgorev.getText());
                        emp[i].setBlood_group(pupdate.txtkangrup.getText());
                        emp[i].setAdress(pupdate.txtadres.getText());
                        break;
                    }

                }
                DataUpdate du=new DataUpdate();
                du.EmployeeUpdate(emp);


    }

}
