package yurt_otomasyonu.GUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class HomeGUIaction implements ActionListener {

    Home home;

    public HomeGUIaction(Home home) {
        this.home = home;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == home.ekle) {

            new Record();
        }
        if (e.getSource() == home.Sil) {
            try {
                new Delete();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomeGUIaction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == home.Guncelle) {

            new Update();
        }
        if (e.getSource() == home.ogrgetir) {
            try {
                new SAllsee();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomeGUIaction.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (e.getSource() == home.pekle) {
            new PRecord();
        }
        if (e.getSource() == home.pSil) {
            try {
                new PDelete();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomeGUIaction.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
        }
        if (e.getSource() == home.pGuncelle) {
            new PUpdate();
            new Record();
        }
        if (e.getSource() == home.pgetir) {

            try {
                new Pallsee();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomeGUIaction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
