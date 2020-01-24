/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositetarea;

/**
 *
 * @author Urimeba
 */
public abstract class Personas extends Activo
{
    private String nombre;
    private String apellido;
    private String correo;
    private int numeroTrabajador;
    private float sueldo;

    public Personas(String nombre, String apellido, String correo, int numeroTrabajador, float sueldo) 
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numeroTrabajador = numeroTrabajador;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(int numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
}
