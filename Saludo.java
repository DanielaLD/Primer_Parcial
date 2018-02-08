/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sala-Pc
 */
import java.util.Scanner;
public class Saludo {
    public static void main (String[]args){
        Scanner teclado= new Scanner (System.in);
        System.out.println("Hola! Cúal es tu nombre?");
        String nombre=teclado.nextLine();
        System.out.println("Cual es tu apellido?");
        String apellido=teclado.nextLine();
        System.out.println("Mucho gusto " + nombre + " " + apellido);
    }
}
