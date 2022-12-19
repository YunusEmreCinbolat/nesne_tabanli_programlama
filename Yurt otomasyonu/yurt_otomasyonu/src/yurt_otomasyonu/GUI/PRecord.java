/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import yurt_otomasyonu.Person.Employee;
import yurt_otomasyonu.Person.Person;
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class PRecord {
    JPanel jp;
    RecordList rc;
  
    JLabel gorev;
    JLabel maas;
   
    JTextField txtgorev;
    JTextField txtmaas;
   
    JFrame jframe;

    public PRecord() {
        jframe = new JFrame("Personel Kayıt paneli");
        rc=new RecordList();
        jframe.setSize(500, 500);
       
        jframe.add(this.getJp());
         jframe.add(rc.getPanel());
        jframe.setLayout(null);
       jframe.setVisible(true);
         
           
    }

    public JLabel getGorev() {
        this.setGorev();
        return gorev;
    }

    public void setGorev() {
       
          gorev = new JLabel("Gorev ");
        gorev.setBounds(80, 250, 100, 20);
    }

    public JLabel getMaas() {
        this.setMaas();
        return maas;
    }

    public void setMaas() {
            maas = new JLabel("Maas "); 
        maas.setBounds(80, 170, 100, 20);
    }

    public JTextField getTxtgorev() {
        this.setTxtgorev();
        return txtgorev;
    }

    public void setTxtgorev() {
        txtgorev = new JTextField();
        txtgorev.setBounds(200, 250, 100, 20);
      
    }

    public JTextField getTxtmaas() {
        this.setTxtmaas();
        return txtmaas;
    }

    public void setTxtmaas() {
            
         txtmaas = new JTextField();
       
        txtmaas.setBounds(200, 170, 100, 20);
    }

    public JPanel getJp() {
        this.setJp();
        return jp;
    }

    public void setJp() {
        if(jp==null){
            jp=new JPanel();
            this.jp.add(this.getGorev());
            this.jp.add(this.getMaas());
            this.jp.add(this.getTxtgorev());
            this.jp.add(this.getTxtmaas());
           
            jp.setBounds(50, 50, 500, 500);
             jp.setVisible(true);
        }
    }
    
}
