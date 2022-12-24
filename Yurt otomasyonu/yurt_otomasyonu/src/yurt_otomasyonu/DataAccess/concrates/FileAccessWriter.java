/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurt_otomasyonu.DataAccess.concrates;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author user
 */
public class FileAccessWriter {
    public void Fileacces(String girdi) throws IOException{
        BufferedWriter write=new BufferedWriter(new FileWriter("kayit.txt"));
        write.write(girdi);
    
    }
}
