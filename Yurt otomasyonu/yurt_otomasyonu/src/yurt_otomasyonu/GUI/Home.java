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

    public Home() {

        jframe = new JFrame("ANASAYFA");
        jframe.setSize(400, 400);

        jframe.add(this.getBaslik());
        jframe.add(this.getEkle());
        jframe.add(this.getPekle());
        jframe.add(this.getpSil());
        jframe.add(this.getpGuncelle());
        jframe.add(this.getPgetir());
        jframe.add(this.getSil());
        jframe.add(this.getGuncelle());
        jframe.add(this.getOgrgetir());
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
                new Delete();
            }
        });

        Guncelle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Update();
            }
        });
        ogrgetir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new SAllsee();
            }
        });
        pekle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new PRecord();
            }
        });
        pSil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new PDelete();
            }
        });

        pGuncelle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new PUpdate();
            }
        });
        pgetir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Pallsee();
            }
        });
    }

    public JLabel getBaslik() {
        this.setBaslik();
        return baslik;
    }

    public void setBaslik() {
        baslik = new JLabel("Yurt İslemlerine Hos Geldiniz");
        baslik.setBounds(500, 50, 500, 200);

    }

    public JButton getEkle() {
        this.setEkle();
        return ekle;
    }

    public void setEkle() {
        ekle = new JButton("Öğrenci Ekle");
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