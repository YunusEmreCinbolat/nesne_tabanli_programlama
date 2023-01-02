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
import yurt_otomasyonu.Controller.concrates.DataDelete;
import yurt_otomasyonu.Person.Employee;

/**
 *
 * @author user
 */
public class ActionPDelete implements ActionListener {
    PDelete pdelete;

    public ActionPDelete(PDelete pdelete) {
        this.pdelete = pdelete;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
          DataDelete dt=new DataDelete();
                Employee employee=new Employee();
                employee=pdelete.jlist.getSelectedValue();
                try {
                    dt.Employeedelete(employee.getTC());
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
                }

    }
    
}
