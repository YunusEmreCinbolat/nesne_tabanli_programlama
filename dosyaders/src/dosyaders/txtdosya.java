package dosyaders;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class txtdosya extends JFrame  {
    JLabel model=null;
    JLabel renk=null;
    JLabel beygir=null;
    JTextField textmodel=null;
    JTextField textrenk=null;
    JTextField textbeygir=null;
    JButton kaydet=null;    
    JTextArea listele=null;
    public txtdosya(){
     
        model=new JLabel();
        model.setBounds(10,10,30,20);
        model.setText("Model");
        renk=new JLabel();
        renk.setBounds(10, 40, 30, 20);
        renk.setText("Renk");
        beygir=new JLabel();
        beygir.setBounds(10, 70, 80, 20);
        beygir.setText("Beygir");
        textmodel=new JTextField();
        textrenk=new JTextField();
        textbeygir=new JTextField();
        textmodel.setBounds(60,60,120,120);
        textrenk.setBounds(20,50,120,120);
        textbeygir.setBounds(20,80,120,120);
        kaydet=new JButton();
        kaydet.setText("Kaydet");
        listele=new JTextArea();
        listele.setBounds(60, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Kayıt Dosyasi");
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        this.add(model);
        this.add(renk);
        this.add(beygir);
          this.add(textmodel);
        this.add(textrenk);
        this.add(textbeygir);
        this.add(kaydet);
        this.add(listele);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==kaydet){
           
        }        
   
        
    
}
}
