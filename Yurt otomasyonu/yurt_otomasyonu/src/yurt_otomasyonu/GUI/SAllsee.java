/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import java.io.FileNotFoundException;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import yurt_otomasyonu.DataAccess.concrates.FileAccesReader;
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class SAllsee extends JFrame {

    JFrame f;
    JTable jt;
    FileAccesReader far;
       DefaultListModel<Students> st; 
    public SAllsee() throws FileNotFoundException {
        f = new JFrame();
        far=new FileAccesReader();
        Students[] student=far.StudentReader();
        st=new DefaultListModel<>();
        for(int i=0;i<student.length;i++){
            st.add(i, student[i]);
        }
        JList<Students> jlist=new JList<>(st);
        jlist.setBounds(10, 10, 1400, 500);
        
        f.setSize(500, 500);
        f.add(jlist);
        f.setLayout(null);
        f.setVisible(true);
    }

    

   
}
