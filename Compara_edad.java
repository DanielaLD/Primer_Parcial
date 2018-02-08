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
public class Compara_edad {
    public static void main(String[]args){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Qué edad tienes?");
        Integer edad=teclado.nextInt();
        if (edad<=0){
            System.out.println("Ni existes");
        }else if(edad<10){
            System.out.println("Eres un mocoso");
        }else if(edad <16){
            System.out.println("Eres un puberto");
        }else if(edad<19){
            System.out.println("Casi eres legal");
        }else if(edad<25){
            System.out.println("Eres cool");
        }else if(edad <45){
            System.out.println("Eres un chavoruco");
        }else if(edad <60){
            System.out.println("Eres un ñor");
        }else if(edad <80){
            System.out.println("Eres un ruco");
        }else if (edad<100){
            System.out.println("Ya estás más paya' que paca'");
        }else if (edad<=100){
            System.out.println("Eres una reliquia");
        }
    }
}
