/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.DataAccess.concrates;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import yurt_otomasyonu.Person.Employee;
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class FileAccesReader {

    public Students[] StudentReader() throws FileNotFoundException {
        Students[] student = new Students[100];
        File file = new File("C:\\Users\\user\\OneDrive\\Belgeler\\Yurt otomasyonu\\yurt_otomasyonu\\src\\yurt_otomasyonu\\file\\Ogrenci.txt");
        Scanner reader = new Scanner(file);
        int i = 0;
        while (reader.hasNextLine()) {
            
            String veri = reader.nextLine();
            String[] parca = veri.split(",");
            int j = 0;
            student[i]=new Students();
            student[i].setName(parca[j++]);
            student[i].setSurname(parca[j++]);
            student[i].setTC(parca[j++]);
            student[i].setPhone(parca[j++]);
            student[i].setDogumtarihi(parca[j++]);
            student[i].setE_mail(parca[j++]);
            student[i].setBlokid(Integer.parseInt(parca[j++]));
            student[i].setBlood_group(parca[j++]);
            student[i].setAdress(parca[j++]);
            student[i].setOdano(Integer.parseInt(parca[j++]));
            student[i].setVeliadsoyad(parca[j++]);
            student[i].setVelitelefon(Integer.parseInt(parca[j++]));
            i++;
        }

        return student;
    }
    public Employee[] EmployeeReader() throws FileNotFoundException{
          Employee[] employee = new Employee[1000];
        File file = new File("C:\\Users\\user\\OneDrive\\Belgeler\\Yurt otomasyonu\\yurt_otomasyonu\\src\\yurt_otomasyonu\\file\\Calisan.txt");
        Scanner reader = new Scanner(file);
        int i = 0;
        while (reader.hasNextLine()) {
            
            String veri = reader.nextLine();
            String[] parca = veri.split(",");
            int j = 0;
            employee[i]=new Employee();
            employee[i].setName(parca[j++]);
            employee[i].setSurname(parca[j++]);
            employee[i].setTC(parca[j++]);
            employee[i].setPhone(parca[j++]);
            employee[i].setDogumtarihi(parca[j++]);
            employee[i].setSalary(Integer.parseInt(parca[j++]));
            employee[i].setE_mail(parca[j++]);
            employee[i].setTask(parca[j++]);
            employee[i].setBlood_group(parca[j++]);
            employee[i].setAdress(parca[j++]);
            i++;
        }
      return employee;
    }

}
