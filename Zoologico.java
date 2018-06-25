/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2Laboratorio4Ejercicio1;

/**
 *
 * @author MarceloDavid
 */
public class Zoologico {
  public static int cantidadAnimales = 25;
  public static int racionesAnimal = 5;
  private boolean abierto;

    public boolean isAbierto() {
        return abierto;
    }

  
    
    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }
  
  public boolean abrirCerrar (){
   if (abierto == false ) {
       System.out.println("El Zoologico está ABIERTO");
       return true;    
       }else
          System.out.println("El Zoologico está CERRADO");
      return false;
   }
  public void alimentarAnimales (int unaCantidadDeRaciones, Cuidador cuidador ){
      
  }

    public Zoologico(boolean abierto) {
        this.abierto = abierto;
    }

    
    }

    



