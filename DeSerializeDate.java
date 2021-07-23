
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop11;

/**
 *
 * @author DanielEsteban
 */

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class DeSerializeDate {
    DeSerializeDate(){
        Date d = null;
        System.out.println(d);
        try{
            FileInputStream f = new FileInputStream("date.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            d = (Date) s.readObject();
            s.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Deserialized Date object from date.ser");
        System.out.println("Date: "+d);
    }
    
    public static void main (String [] args){
        new DeSerializeDate();
    }
    
}