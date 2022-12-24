/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import yurt_otomasyonu.DataAccess.concrates.FileAccessWriter;
import yurt_otomasyonu.Person.Employee;

/**
 *
 * @author user
 */
public class GUIActionListener implements ActionListener {

    RecordList recordlist;
    FileAccessWriter fc;
    Employee em;

    public GUIActionListener(RecordList recordlist) {
        this.recordlist = recordlist;
        fc = new FileAccessWriter();
        em = new Employee();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String girdi = em.toString();
        try {
            fc.Fileacces(girdi);
        } catch (IOException ex) {
            Logger.getLogger(GUIActionListener.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
