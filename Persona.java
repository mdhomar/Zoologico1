/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2Laboratorio4Ejercicio1;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author MarceloDavid
 */
public abstract class Persona {
    private String nombre;
    private Date fechaDeNacimiento;
SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
String fechaDeNacimientoStr = f.format (fechaDeNacimiento);
    public String getNombre() {
        return nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getFechaDeNacimientoStr() {
        return fechaDeNacimientoStr;
    }

   public void setFechaDeNacimientoStr(String fechaDeNacimientoStr) {
        this.fechaDeNacimientoStr = fechaDeNacimientoStr;
    }
    

    public Persona(String nombre, String fechaDeNacimientoStr) {
        this.nombre = nombre;
        this.fechaDeNacimientoStr = fechaDeNacimientoStr;
    }

    
    
}
