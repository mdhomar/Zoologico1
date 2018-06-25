/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2Laboratorio4Ejercicio1;
import static Laboratorio2Laboratorio4Ejercicio1.Zoologico.cantidadAnimales;
import static Laboratorio2Laboratorio4Ejercicio1.Zoologico.racionesAnimal;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author MarceloDavid
 */
@SuppressWarnings("InitializerMayBeStatic")
public class Cuidador extends Persona{
    private int cantidadDeRaciones;
    
    public int getCantidadDeRaciones() {
        return cantidadDeRaciones;
    }

    public void setCantidadDeRaciones(int cantidadDeRaciones) {
        this.cantidadDeRaciones = cantidadDeRaciones;
    }
    
    public void alimentarAnimales (){
        if(cantidadDeRaciones >= cantidadAnimales * racionesAnimal){
            System.out.println("Se alimento a todos los Animales");
        }else{
            System.out.println("No se alcanzó a alimentar a todos los animales");
        }
}

    public Cuidador(int cantidadDeRaciones, String nombre, String fechaDeNacimientoStr) {
        super(nombre, fechaDeNacimientoStr);
        this.cantidadDeRaciones = cantidadDeRaciones;
    }

    
    }

    
    
    
    
    

