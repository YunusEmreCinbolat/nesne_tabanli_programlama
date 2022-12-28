/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import yurt_otomasyonu.Person.Yonetici;

/**
 *
 * @author user
 */
public class LoginScreen extends JFrame{
    JFrame jf;
    JLabel username;
    JLabel userpassword;
    JTextField txtusername;
    JTextField txtuserpaswword;
    JButton giris;
    public LoginScreen() {
        jf=new JFrame("Giriş Ekranı");
        jf.setSize(500,500);
        jf.add(this.getGiris());
        jf.add(this.getTxtusername());
        jf.add(this.getTxtuserpaswword());
        jf.add(this.getUsername());
        jf.add(this.getUserpassword());
        jf.setLayout(null);
        jf.setVisible(true);
       giris.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Yonetici Y=new Yonetici();
                if(Y.getAd().equals(txtusername.getText()) && Y.getSifre().equals(txtuserpaswword.getText())){
                    Home h=new Home();
                    
                }
                else{
                       JOptionPane.showMessageDialog(null, "Enter a valid Number",
                                   "ERROR", JOptionPane.ERROR_MESSAGE);
                }
              } 
             });
                        

}
    public JButton getGiris() {
        this.setGiris();
        return giris;
    }

    public void setGiris() {
        giris=new JButton("GİRİŞ");
        giris.setBounds(150, 150, 100,50);
    }
    
    public JLabel getUsername() {
       this.setUsername();
        return username;
    }

    public void setUsername() {
        username=new JLabel("Kullanıcı adı");
        username.setBounds(20, 40, 100, 20);
        
    }

    public JLabel getUserpassword() {
        this.setUserpassword();
        return userpassword;
    }

    public void setUserpassword() {
        userpassword=new JLabel("Şifre");
        userpassword.setBounds(20, 80, 100, 20);
    }

    public JTextField getTxtusername() {
        this.setTxtusername();
        return txtusername;
    }

    public void setTxtusername() {
        txtusername=new JTextField();
        txtusername.setBounds(150, 40, 150, 20);
    }

    public JTextField getTxtuserpaswword() {
        this.setTxtuserpaswword();
        return txtuserpaswword;
    }

    public void setTxtuserpaswword() {
        txtuserpaswword=new JTextField();
        txtuserpaswword.setBounds(150, 80, 100, 20);
    }
    
    
    
    
}
