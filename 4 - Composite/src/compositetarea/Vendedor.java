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
public class Vendedor extends Personas
{
    private int numeroVentas=0;

    public Vendedor(String nombre, String apellido, String correo, int numeroTrabajador, float sueldo) 
    {
        super(nombre, apellido, correo, numeroTrabajador, sueldo);
    }
    
    public void vender(int ventas)
    {
        this.numeroVentas+=ventas;
    }

    @Override
    public String toString() 
    {
        return "\nVendedor: " + this.getNombre() + " " + this.getApellido() +"\nCorreo: " + this.getCorreo() + "\nNumero de Trabajador: " + this.getNumeroTrabajador() + "\nSueldo: $" + this.getSueldo() + "\nNumero de Ventas: " + this.getNumeroVentas();
    }
    
    public int getNumeroVentas() 
    {
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) 
    {
        this.numeroVentas = numeroVentas;
    }

    @Override
    public void notificar(String mensaje) 
    {
        System.out.println("El mensaje ha sido enviado a " + this.getNombre() + " mediante el correo " + this.getCorreo());
    }

    @Override
    public void verInfo() 
    {
        System.out.println(toString());
    }
}
