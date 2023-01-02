/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.Controller.concrates;

import yurt_otomasyonu.DataAccess.concrates.FileDataUpdate;
import yurt_otomasyonu.Person.Employee;
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class DataUpdate {
    public void StudentUpdate(Students[] student){
        int uzunluk=0;
        while(student[uzunluk]!=null){
            uzunluk++;
        }
        for(int i=0;i<uzunluk;i++){
                 if(student[i].getTC().length()>10){
                return;
            }
            if(student[i].getDogumtarihi().length()>9){
                return;
            }
            if(student[i].getBlokid()>5){
                  return;
            }
            if(student[i].getPhone().length()>10){
                return;
            }
            FileDataUpdate fdu=new FileDataUpdate();
            fdu.Studentwrite(student, uzunluk);
        }
    }
    public void EmployeeUpdate(Employee[] employee){
        int uzunluk=0;
        while(employee[uzunluk]!=null){
            uzunluk++;
        }
        for(int i=0;i<uzunluk;i++){
              if(employee[i].getTC().length()>10){
                return;
            }
            if(employee[i].getDogumtarihi().length()>9){
                return;
            }
            if(employee[i].getPhone().length()>10){
                return;
            }
            if(employee[i].getSalary()<8501){
                return;
            }
        }
          FileDataUpdate fdu=new FileDataUpdate();
            fdu.Employeewrite(employee, uzunluk);
        
    }
}
