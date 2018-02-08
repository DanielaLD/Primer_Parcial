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
public class Meses {
    public static void main (String[]args){
        Scanner teclado= new Scanner (System.in);
        System.out.println("Dime un número del 1 al 12");
        Integer numerito=teclado.nextInt();
        if ((numerito>1)&&(numerito<=12)){
            switch (numerito){
                case 1:
                    System.out.println("El número "+numerito+" corresponde a el mes de enero y tiene 31 días");
                    break;
                case 2:
                    System.out.println("Escribe un año para hacer el cálculo");
                    Integer año=teclado.nextInt();
                    if ((año%4==0)&&(año%100!=0)){
                        System.out.println("El número "+numerito+" corresponde a el mes de febrero, y es un año bisiesto tiene 29 días");
                    }else{
                        System.out.println("El número "+numerito+" corresponde a el mes de febrero, y no es un año bisiesto tiene 28 días");
                    }
                    break;
                case 3:
                    System.out.println("El número "+numerito+" corresponde a el mes de marzo y tiene 31 días");
                    break;
                case 4:
                    System.out.println("El número "+numerito+" corresponde a el mes de abril y tiene 30 días");
                    break;
                case 5:
                    System.out.println("El número "+numerito+" corresponde a el mes de mayo y tiene 31 días");
                    break;
                case 6:
                    System.out.println("El número "+numerito+" corresponde a el mes de junio y tiene 30 días");
                    break;
                case 7:
                    System.out.println("El número "+numerito+" corresponde a el mes de julio y tiene 31 días");
                    break;
                case 8:
                    System.out.println("El número "+numerito+" corresponde a el mes de agosto y tiene 31 días");
                    break;
                case 9:
                    System.out.println("El número "+numerito+" corresponde a el mes de septiembre y tiene 30 días");
                    break;  
                case 10:
                    System.out.println("El número "+numerito+" corresponde a el mes de octubre y tiene 31 días");
                    break;
                case 11:
                    System.out.println("El número "+numerito+" corresponde a el mes de noviembre y tiene 30 días");
                    break;
                case 12:
                    System.out.println("El número "+numerito+" corresponde a el mes de dicimebre y tiene 31 días");
                    break;    
            }
        }else{
            System.out.println("Que no sabes leer? número no válido");
        }
    }
}
