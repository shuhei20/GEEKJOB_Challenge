/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author shuhei01
 */
public class File2 {
    
    public static void main(String[] args) throws IOException {
        
        File fp = new File("test.txt");
        
        FileReader fr = new FileReader(fp);
        BufferedReader br = new BufferedReader(fr);
        
        System.out.println(br.readLine());
        
        br.close();
    
    }
}    
