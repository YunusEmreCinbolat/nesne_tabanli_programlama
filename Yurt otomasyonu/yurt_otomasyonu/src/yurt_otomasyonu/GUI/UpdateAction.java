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
import yurt_otomasyonu.DataAccess.concrates.FileAccesReader;
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class UpdateAction implements ActionListener{
    Update update;

    public UpdateAction(Update update) {
        this.update = update;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
                FileAccesReader fc = new FileAccesReader();
                Students[] sts = new Students[100];
                try {
                    sts = fc.StudentReader();
                    int i;
                    for (i = 0; i < sts.length; i++) {
                        if (update.txtID.getText().equals(sts[i].getTC())) {
                            break;
                        }

                    }

                    update.txtAd.setText(sts[i].getName());
                    update.txtsoyAd.setText(sts[i].getSurname());
                    update.tcTextField.setText(sts[i].getTC());
                    update.telefonTextField.setText(sts[i].getPhone());
                    update.dogumtarihiTextField.setText(sts[i].getDogumtarihi());
                    update.txtMail.setText(sts[i].getE_mail());
                    update.txtblok.setText(Integer.toString(sts[i].getBlokid()));
                    update.txtkangrup.setText(sts[i].getBlood_group());
                    update.txtadres.setText(sts[i].getAdress());
                    update.txtodano.setText(Integer.toString(sts[i].getOdano()));
                    update.txtVelisoyAd.setText(sts[i].getVeliadsoyad());
                  //  update.velitelefonTextField.setText(Integer.toString(sts[i].getVelitelefon()));

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
                }

    }
    
}
