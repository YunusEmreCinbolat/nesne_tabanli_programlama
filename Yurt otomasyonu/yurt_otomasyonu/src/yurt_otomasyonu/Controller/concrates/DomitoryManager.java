/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.Controller.concrates;

import java.util.List;
import yurt_otomasyonu.DataAccess.concrates.FileAccessWriter;
import yurt_otomasyonu.Person.Employee;
import yurt_otomasyonu.Person.Person;

import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class DomitoryManager extends Domitory_Procedures  {
     FileAccessWriter fac;
    public DomitoryManager() {

    }

    @Override
    public void studentController(Students student) {
            if(student.getTC().length()>10){
                return;
            }
            if(student.getDogumtarihi().length()>9){
                return;
            }
            if(student.getBlokid()>5){
                  return;
            }
            if(student.getPhone().length()>10){
                return;
            }
           
            
            fac=new FileAccessWriter();
            fac.Studentwrite(student);
        
    }
    @Override
    public void employeeController(Employee employee) {
         if(employee.getTC().length()>10){
                return;
            }
            if(employee.getDogumtarihi().length()>9){
                return;
            }
            if(employee.getPhone().length()>10){
                return;
            }
            if(employee.getSalary()<8501){
                return;
            }
            fac=new FileAccessWriter();
            fac.Employeewrite(employee);
        }
    }

  


