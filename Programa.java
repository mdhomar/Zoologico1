/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2Laboratorio4Ejercicio1;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author MarceloDavid
 */
public class Programa {



    /**
     * @param args the command line arguments
     */
//String fo =(String)SimpleDateFormat(f);
    public static void main(String[] args) {
        Zoologico zoo1 = new Zoologico(false);
        Cuidador cuidador1 = new Cuidador(125,"Nuñez","26/05/1966");
        System.out.println(cuidador1.getFechaDeNacimiento());
    }
    
}
