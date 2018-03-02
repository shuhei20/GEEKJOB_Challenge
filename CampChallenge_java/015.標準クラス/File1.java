/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author shuhei01
 */
public class File1 {
    
    public static void main(String[] args) throws IOException {
        
        File fp = new File("test.txt");
        
        FileWriter fw = new FileWriter(fp);
        
        fw.write("染川脩平です。よろしくお願いします。");
        
        fw.close();
    }
    
}
