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
public class Tiempo_ciber {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la hora para comenzar(use el formato hh:mm en 24 horas))");
        String pinhora=teclado.next();
        String shorita=pinhora.substring(0, 1);
        String sminutos=pinhora.substring(3, 4);
        Integer horita= Integer.parseInt(shorita);               //Hora de inicio
        Integer minutitos=Integer.parseInt(sminutos);            //Minutos de inicio
        System.out.println("Ingrese la hora para terminar(use el formato hh:mm en 24 horas))");
        String horafin=teclado.next();
        String horitafin=horafin.substring(0, 1);
        String minutosfin=horafin.substring(3, 4);
        Integer horahorafin= Integer.parseInt(horitafin);        //Hora fin
        Integer minutsfin=Integer.parseInt(minutosfin);          //Minutos fin
        if ((horita>=0)&&(horita<24)&&(minutitos>=0)&&(minutitos<60)&&(horahorafin>=0)&&(horahorafin<24)&&(minutsfin>=0)&&(minutsfin<60)){
            Integer horafinal= 0;
            Integer minutosfinales=0;
            if (minutsfin<minutitos){
                horafinal=horafinal-1;
                minutosfinales=60-minutosfinales;
                System.out.println("Se ha utilizado la computadora por "+horafinal+" horas "+minutosfinales+" minutos");
            }else{
                horafinal=horahorafin-horita;
                minutosfinales=minutsfin-minutitos;
                System.out.println("Se ha utilizado la computadora por "+horafinal+" horas "+minutosfinales+" minutos");
            }
        }else{
            System.out.println("Hora no válida");
        }
    }
}
