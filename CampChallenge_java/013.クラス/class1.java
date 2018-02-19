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
class Human{
    
    public String name = "";
    public int age = 0;
    
    public void setHuman(String n, int a){
    
        this.name = n;
        this.age = a;
    }
    
    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class class1 {
    
    public static void main(String[] args) {
        
        Human hito = new Human();
        hito.setHuman("山田太郎", 18);
        hito.print();
    }
    
}
