/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import java.io.FileNotFoundException;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import yurt_otomasyonu.DataAccess.concrates.FileAccesReader;
import yurt_otomasyonu.Person.Employee;
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class Pallsee extends JFrame {

    JFrame f;
    JButton detay;
    FileAccesReader far;
       DefaultListModel<Employee> em; 

    public Pallsee() throws FileNotFoundException {
        detay = new JButton("Personel Detay");
        f = new JFrame();
         far=new FileAccesReader();
        Employee[] emlist=far.EmployeeReader();
        em=new DefaultListModel<>();
        for(int i=0;i<emlist.length;i++){
            em.add(i, emlist[i]);
        }
        JList<Employee> jlist=new JList<>(em);
        jlist.setBounds(10, 10, 1400, 500);
        f.add(jlist);

        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

   

}
