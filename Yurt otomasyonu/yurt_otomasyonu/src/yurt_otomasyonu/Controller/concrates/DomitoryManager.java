/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.Controller.concrates;

import java.util.List;
import yurt_otomasyonu.Person.Employee;

import yurt_otomasyonu.Person.Students;

/**
 *
 * @author user
 */
public class DomitoryManager implements IDomitoryManager {

    public DomitoryManager() {

    }

    public String Scontrol(Students student) {
        String hata;
        if (student.getTC().length() < 12 && student.getTC().charAt(student.getTC().length() - 1) % 2 == 0) {
            return "Yanlis tc formati";
        }
        if (student.getPhone() > 10) {
            return "Yanlis telefon formati";
        }
        if (student.getVelitelefon() > 10) {
            return "Yanlis telefon formati";
        }

        return null;
    }

    public String Econtrol(Employee employee) {
        String hata;
        if (employee.getTC().length() < 12 && employee.getTC().charAt(employee.getTC().length() - 1) % 2 == 0) {
            return "Yanlis tc formati";
        }
        if (employee.getPhone() > 10) {
            return "Yanlis telefon formati";
        }

        return null;
    }

    @Override
    public void getall() {

    }

}
