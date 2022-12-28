/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.Controller.concrates;

import java.io.FileNotFoundException;
import yurt_otomasyonu.DataAccess.concrates.FileAccesReader;
import yurt_otomasyonu.DataAccess.concrates.FileDataUpdate;
import yurt_otomasyonu.Person.Employee;
import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class DataDelete {
    FileAccesReader fc;
    FileDataUpdate fdu;
    public DataDelete() {
       
    }
    
    public void Studentdelete(String tc) throws FileNotFoundException{
        fc=new FileAccesReader();
        Students[] allStudent=new Students[100];
        allStudent=fc.StudentReader();
        int sayac=0;
        while(allStudent[sayac]!=null){
            sayac++;
        }
        for(int i=0;i<sayac;i++){

            if(allStudent[i].getTC().equals(tc)){
                for(int j=i;j<sayac-1;j++){
                    allStudent[j]=allStudent[j+1];

                }
                break;   
            
            }
            
        }
        fdu=new FileDataUpdate();
        fdu.Studentwrite(allStudent,sayac-1);
    }
    
    public void Employeedelete(String tc) throws FileNotFoundException{
        fc=new FileAccesReader();
        Employee[] allEmployee=new Employee[100];
        allEmployee=fc.EmployeeReader();
        int sayac=0;
        while(allEmployee[sayac]!=null){
            sayac++;
        }
        for(int i=0;i<sayac;i++){

            if(allEmployee[i].getTC().equals(tc)){
                for(int j=i;j<sayac-1;j++){
                    allEmployee[j]=allEmployee[j+1];

                }
                break;   
            
            }
            
        }
        fdu=new FileDataUpdate();
        fdu. Employeewrite(allEmployee,sayac-1);
    }
    
    
}
