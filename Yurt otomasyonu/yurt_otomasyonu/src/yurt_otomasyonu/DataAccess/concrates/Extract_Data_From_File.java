/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.DataAccess.concrates;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import yurt_otomasyonu.Person.Employee;

/**
 *
 * @author user
 */
public class Extract_Data_From_File {
    public String extract_data() throws FileNotFoundException{
        File file=new File("deneme.txt");
        Scanner reader=new Scanner(file);
        String mesaj="";
        while(reader.hasNextLine()){
            mesaj+=reader.nextLine();
        }
        reader.close();
        
        return mesaj;   
    }
}
