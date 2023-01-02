/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.GUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
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
    JLabel resim;

    public Home() {

        jframe = new JFrame("ANASAYFA");
        jframe.setSize(400, 400);
        JLabel arkaplan=new JLabel(new ImageIcon("C:\\Users\\user\\OneDrive\\Belgeler\\Yurt otomasyonu\\yurt_otomasyonu\\src\\yurt_otomasyonu\\image\\unnamed.jpg"));
        jframe.add(arkaplan);
        arkaplan.setLayout(new FlowLayout());
        jframe.add(this.getBaslik());
        jframe.add(this.getEkle());
        jframe.add(this.getPekle());
        jframe.add(this.getpSil());
        jframe.add(this.getpGuncelle());
        jframe.add(this.getPgetir());
        jframe.add(this.getSil());
        jframe.add(this.getGuncelle());
        jframe.add(this.getOgrgetir());
        jframe.add(this.getResim());
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ekle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Record();
            }
        });
        Sil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    new Delete();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        Guncelle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Update();
            }
        });
        ogrgetir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    new SAllsee();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        pekle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new PRecord();
            }
        });
        pSil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    new PDelete();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        pGuncelle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new PUpdate();
            }
        });
        pgetir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    new Pallsee();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public JLabel getResim() {
        this.setResim();
        return resim;
    }

    public void setResim() {
        Icon foto=new ImageIcon("C:\\Users\\user\\OneDrive\\Belgeler\\Yurt otomasyonu\\yurt_otomasyonu\\src\\yurt_otomasyonu\\image\\unnamed.jpg");
        resim=new JLabel(foto);
        resim.setBounds(350,300,700,600);
        
    }
    
    public JLabel getBaslik() {
        this.setBaslik();
        return baslik;
    }

    public void setBaslik() {
        
        baslik = new JLabel("YURT  İŞLEMLERİNE  HOŞGELDİNİZ");
        baslik.setBounds(500, 50, 500, 200);
        Font  f3  = new Font(Font.DIALOG,  Font.BOLD, 25);
        baslik.setFont(f3);

    }

    public JButton getEkle() {
        this.setEkle();
        return ekle;
    }

    public void setEkle() {
        ekle = new JButton("Öğenci Ekle");
        ekle.setBounds(250, 200, 150, 40);

    }

    public JButton getSil() {
        this.setSil();
        return Sil;
    }

    public void setSil() {
        Sil = new JButton("Öğrenci Sil");
        Sil.setBounds(500, 200, 150, 40);
    }

    public JButton getGuncelle() {
        this.setGuncelle();
        return Guncelle;
    }

    public void setGuncelle() {

        Guncelle = new JButton("Öğrenci Güncelle");
        Guncelle.setBounds(750, 200, 150, 40);
    }

    public JButton getOgrgetir() {
        this.setOgrgetir();
        return ogrgetir;
    }

    public void setOgrgetir() {
        ogrgetir = new JButton("Öğrenci Listele");
        ogrgetir.setBounds(1000, 200, 150, 40);

    }

    public JFrame getJframe() {
        return jframe;
    }

    public void setJframe(JFrame jframe) {
        this.jframe = jframe;
    }

    public JButton getPekle() {
        this.setPekle();
        return pekle;
    }

    public void setPekle() {
        pekle = new JButton("Personel Ekle");
        pekle.setBounds(250, 320, 150, 40);

    }

    public JButton getpSil() {
        this.setpSil();
        return pSil;
    }

    public void setpSil() {

        pSil = new JButton("Personel Sil");
        pSil.setBounds(500, 320, 150, 40);

    }

    public JButton getpGuncelle() {
        this.setpGuncelle();
        return pGuncelle;
    }

    public void setpGuncelle() {
        pGuncelle = new JButton("Personel Güncelle");
        pGuncelle.setBounds(750, 320, 150, 40);
    }

    public JButton getPgetir() {
        this.setPgetir();
        return pgetir;
    }

    public void setPgetir() {
        pgetir = new JButton("Personel Listele");
        pgetir.setBounds(1000, 320, 150, 40);

    }

}
