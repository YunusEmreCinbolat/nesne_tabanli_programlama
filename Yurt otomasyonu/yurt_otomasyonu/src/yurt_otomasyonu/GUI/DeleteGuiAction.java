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
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class DeleteGuiAction implements ActionListener {
    Delete delete;

    public DeleteGuiAction(Delete delete) {
        this.delete = delete;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        DataDelete dt=new DataDelete();
                Students students=new Students();
                students=delete.jlist.getSelectedValue();
                try {
                    dt.Studentdelete(students.getTC());
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
                }
      
    }
    
}
