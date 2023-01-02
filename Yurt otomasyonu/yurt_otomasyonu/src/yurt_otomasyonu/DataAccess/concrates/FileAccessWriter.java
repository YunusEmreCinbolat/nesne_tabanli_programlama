/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.DataAccess.concrates;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import yurt_otomasyonu.Person.Employee;
import yurt_otomasyonu.Person.Person;
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class FileAccessWriter extends File_procedures {

    @Override
    public void Studentwrite(Students student) {
        System.out.println("gfdbvcs");
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter("C:\\Users\\user\\OneDrive\\Belgeler\\Yurt otomasyonu\\yurt_otomasyonu\\src\\yurt_otomasyonu\\file\\Ogrenci.txt", true));

            String girdi = student.getName() + "," + student.getSurname() + "," + student.getTC() + "," + student.getPhone() + "," + student.getDogumtarihi() + "," + student.getE_mail()
                    + "," + Integer.toString(student.getBlokid()) + "," + student.getBlood_group() + "," + student.getAdress() + "," + Integer.toString(student.getOdano()) + ","
                    + student.getVeliadsoyad() + "," + Integer.toString(student.getVelitelefon());

            file.write(girdi);
            file.newLine();
            file.close();
        } catch (IOException ex) {
            Logger.getLogger(FileAccessWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Employeewrite(Employee employee) {
        System.out.println(employee.getName());
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter("C:\\Users\\user\\OneDrive\\Belgeler\\Yurt otomasyonu\\yurt_otomasyonu\\src\\yurt_otomasyonu\\file\\Calisan.txt", true));
            String girdi = employee.getName() + "," + employee.getSurname() + ","
                    + employee.getTC() + "," + employee.getPhone() + "," + employee.getDogumtarihi() + ","
                    + employee.getSalary() + "," + employee.getE_mail() + "," + employee.getTask() + ","
                    + employee.getBlood_group() + "," + employee.getAdress();
            file.write(girdi);
            file.newLine();

            file.close();

        } catch (IOException ex) {
            Logger.getLogger(FileAccessWriter.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
