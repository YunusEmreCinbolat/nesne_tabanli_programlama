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
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import yurt_otomasyonu.Controller.concrates.DataDelete;
import yurt_otomasyonu.DataAccess.concrates.FileAccesReader;
import yurt_otomasyonu.Person.Employee;
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class PDelete {

    JFrame jframe;
    JList<Employee> jlist;
    JButton btndelete;
    FileAccesReader far;
       DefaultListModel<Employee> st;
    public PDelete() throws FileNotFoundException {
        
        jframe = new JFrame("Personeli Sil");
         far=new FileAccesReader();
        Employee[] employee=far.EmployeeReader();
        st=new DefaultListModel<>();
        for(int i=0;i<employee.length;i++){
            st.add(i, employee[i]);
        }
        jlist=new JList<>(st);
        jlist.setBounds(10, 100, 1400, 500);
       jframe.add(getBtndelete());
        jframe.add(jlist);
        jframe.setSize(500, 500);
          
        jframe.setLayout(null);
        jframe.setVisible(true);
        btndelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataDelete dt=new DataDelete();
                Employee employee=new Employee();
                employee=jlist.getSelectedValue();
                try {
                    dt.Employeedelete(employee.getTC());
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
        btndelete = new JButton("Personeli sil");
        btndelete.setBounds(600, 60, 200, 30);
    }

}
