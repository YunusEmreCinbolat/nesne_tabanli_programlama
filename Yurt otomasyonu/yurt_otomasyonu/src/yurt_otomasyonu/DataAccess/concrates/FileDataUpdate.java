/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.DataAccess.concrates;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import yurt_otomasyonu.Person.Employee;
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class FileDataUpdate {

    public void Studentwrite(Students[] student, int sayac) {
        BufferedWriter file;
        BufferedWriter dsy;
        try {
            File dosya = new File("C:\\Users\\user\\OneDrive\\Belgeler\\Yurt otomasyonu\\yurt_otomasyonu\\src\\yurt_otomasyonu\\file\\Ogrenci.txt");
            dosya.delete();
            File ds = new File("C:\\Users\\user\\OneDrive\\Belgeler\\Yurt otomasyonu\\yurt_otomasyonu\\src\\yurt_otomasyonu\\file\\Ogrenci.txt");

            if (sayac == 0) {
                file = new BufferedWriter(new FileWriter(ds));
                String girdi = "";
                file.write(girdi);
                file.close();
            } else {
                dsy=new BufferedWriter(new FileWriter(ds));
                  String bos = "";
                dsy.write(bos);
                dsy.close();
                file = new BufferedWriter(new FileWriter(ds, true));
              
                for (int i = 0; i < sayac; i++) {

                    String girdi = student[i].getName() + "," + student[i].getSurname() + "," + student[i].getTC() + "," + student[i].getPhone() + "," + student[i].getDogumtarihi() + "," + student[i].getE_mail()
                            + "," + Integer.toString(student[i].getBlokid()) + "," + student[i].getBlood_group() + "," + student[i].getAdress() + "," + Integer.toString(student[i].getOdano()) + ","
                            + student[i].getVeliadsoyad() + "," + Integer.toString(student[i].getVelitelefon());
                    file.write(girdi);
                    file.newLine();
                    System.out.println(i);
                }
                file.close();
            }

        } catch (IOException ex) {

            Logger.getLogger(FileDataUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Employeewrite(Employee[] employee, int sayac) {

        BufferedWriter file;
        BufferedWriter dsy;
        try {
            File dosya = new File("C:\\Users\\user\\OneDrive\\Belgeler\\Yurt otomasyonu\\yurt_otomasyonu\\src\\yurt_otomasyonu\\file\\Calisan.txt");
            dosya.delete();
            File ds = new File("C:\\Users\\user\\OneDrive\\Belgeler\\Yurt otomasyonu\\yurt_otomasyonu\\src\\yurt_otomasyonu\\file\\Calisan.txt");

            if (sayac == 0) {
                file = new BufferedWriter(new FileWriter(ds));
                String girdi = "";
                file.write(girdi);
                file.close();
            } else {
                  dsy=new BufferedWriter(new FileWriter(ds));
                  String bos = "";
                dsy.write(bos);
                dsy.close();
                file = new BufferedWriter(new FileWriter(ds, true));

                for (int i = 0; i < sayac; i++) {
                    
                    String girdi = employee[i].getName() + "," + employee[i].getSurname() + ","
                            + employee[i].getTC() + "," + employee[i].getPhone() + "," + employee[i].getDogumtarihi() + ","
                            + employee[i].getSalary() + "," + employee[i].getE_mail() + "," + employee[i].getTask() + ","
                            + employee[i].getBlood_group() + "," + employee[i].getAdress();
                    System.out.println(girdi);
                    file.write(girdi);
                    file.newLine();
                }
                file.close();

            }

        } catch (IOException ex) {

            Logger.getLogger(FileDataUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
