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
import javax.swing.*;
import yurt_otomasyonu.Controller.concrates.DataDelete;
import yurt_otomasyonu.DataAccess.concrates.FileAccesReader;
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class Delete extends JFrame {

    JFrame jframe;
    JList<Students> jlist;
    JButton btndelete;
      FileAccesReader far;
       DefaultListModel<Students> st;
    public Delete() throws FileNotFoundException {
        jframe = new JFrame("Öğrenci Sil");
        
        jframe.setSize(500, 500);
     
        jframe.add(this.getBtndelete());
         far=new FileAccesReader();
        Students[] student=far.StudentReader();
        st=new DefaultListModel<>();
        for(int i=0;i<student.length;i++){
            st.add(i, student[i]);
        }
       jlist=new JList<>(st);
        jlist.setBounds(10, 100, 1400, 500);
        
        jframe.add(jlist);
        jframe.setSize(500, 500);
          
        jframe.setLayout(null);
        jframe.setVisible(true);
        btndelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataDelete dt=new DataDelete();
                Students students=new Students();
                students=jlist.getSelectedValue();
                try {
                    dt.Studentdelete(students.getTC());
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
  
    
  
   
    public JButton getBtndelete() {
        this.setBtndelete();
        return btndelete;
    }
    
    public void setBtndelete() {
        btndelete = new JButton("Öğrenciyi sil");
        btndelete.setBounds(600, 60, 200, 30);
    }
    
}
