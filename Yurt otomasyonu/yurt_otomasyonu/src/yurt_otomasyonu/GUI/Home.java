/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class Home extends JFrame {
    JLabel baslik;
    JButton ekle;
    JButton Sil;
    JButton Guncelle;
    JButton ogrgetir;
    JFrame jframe;
    JButton pekle;
    JButton pSil;
    JButton pGuncelle;
    JButton pgetir;
    
    public Home(){
 
        jframe=new JFrame("ANASAYFA");
        baslik=new JLabel("Yurt İslemlerine Hos Geldiniz");
        ekle=new JButton("Öğrenci Ekle");
        Sil=new JButton("Öğrenci Sil");
        Guncelle=new JButton("Öğrenci Güncelle");
        ogrgetir=new JButton("Öğrenci Listele");
        pekle=new JButton("Personel Ekle");
        pSil=new JButton("Personel Sil");
        pGuncelle=new JButton("Personel Güncelle");
        pgetir=new JButton("Personel Listele");
        pekle.setBounds(250, 320, 150, 40);
        pSil.setBounds(500, 320, 150, 40);
        pGuncelle.setBounds(750, 320, 150, 40);
        pgetir.setBounds(1000, 320, 150, 40);
        ekle.setBounds(250, 200, 150, 40);
        Sil.setBounds(500,200,150,40);
        Guncelle.setBounds(750,200, 150,40);
        ogrgetir.setBounds(1000, 200, 150, 40);
        baslik.setBounds(500, 50, 500, 200);
        jframe.setSize(400, 400);
        jframe.add(baslik);
        jframe.add(ekle);
        jframe.add(pekle);
        jframe.add(pSil);
        jframe.add(pGuncelle);
        jframe.add(pgetir);
        jframe.add(Sil);
        jframe.add(Guncelle);
        jframe.add(ogrgetir);
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              ekle.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                new Record();
        }  
    });  
            Sil.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                new Delete();
        }  
    });  
              
            Guncelle.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                new Update();
        }  
    });       
            ogrgetir.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                new SAllsee();
        }  
    });       
                 pekle.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                new PRecord();
        }  
    });  
            pSil.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                new PDelete();
        }  
    });  
              
            pGuncelle.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                new PUpdate();
        }  
    });       
            pgetir.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                new Pallsee();
        }  
    });          
    }
  
}
