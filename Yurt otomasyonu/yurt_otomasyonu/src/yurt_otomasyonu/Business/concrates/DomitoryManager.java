/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.Business.concrates;

import java.util.List;
import yurt_otomasyonu.DataAccess.concrates.InMemoryDomitoryRepository;
import yurt_otomasyonu.Person.Employee;

import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class DomitoryManager  {
    InMemoryDomitoryRepository inMemoryDomitoryRepository;
    public DomitoryManager( ){
        
    }

    
    public List getSAll(Students student) {
        return null;
    }

  
    public String Scontrol(Students student) {
        String hata;
        if(student.getTC().length()<12 && student.getTC().charAt(student.getTC().length()-1)%2==0){
            return "Yanlis tc formati" ;
        }
        if(student.getPhone()>10){
            return "Yanlis telefon formati";
        }
       if(student.getVelitelefon()>10){
            return "Yanlis telefon formati";
        }
        inMemoryDomitoryRepository= new InMemoryDomitoryRepository();
        
       
        
        return null;
    }

    
    public List getEAll(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public List Econtrol(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
   
}
