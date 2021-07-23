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

import java.io.Console;

public class EjConsole {
    public static void main (String [] args){
        Console con = System.console();
        System.out.println("Usuario: ");
        String s = con.readLine();
        System.out.println(s);
        System.out.println("Contraseña: ");
        char [] s2 = con.readPassword();
        System.out.println(s2);
    }
}
