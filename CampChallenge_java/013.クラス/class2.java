/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp;

/**
 *
 * @author shuhei01
 */
class Test {
    
    public String name = "no.name";
    public int age = 0;

    public void setHuman(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public void getHuman() {
        System.out.println(name + age);
    }
    
}

class NotHuman extends Test {
    
    public void clear(NotHuman h) {
        h.setHuman("",0);
    }
    
}

public class class2 {
    
    public static void main(String[] args) {
        
        NotHuman namae = new NotHuman();
        namae.setHuman("山田太郎", 18);
        
        namae.getHuman();
        namae.clear(namae);
        namae.getHuman();
    }
    
}
