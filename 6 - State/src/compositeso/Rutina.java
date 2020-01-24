/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeso;

/**
 *
 * @author Urimeba
 */
public class Rutina extends Componente
{

    public Rutina(String nombre, float size) 
    {
        super(nombre, size);
    }

    @Override
    public void info() 
    {
        System.out.println("(r) " + this.getNombre() + " (" + this.getSize() + ")");
    }
    
    @Override
    public void abrir() 
    {
        this.getActual().abrir();
        this.setActual(this.getAbierto());
    }

    @Override
    public void cambiarNombre(String nombre) 
    {
        if(this.getActual()==this.getAbierto())
        {
            System.out.println("Cierra la rutina para cambiar el nombre");
        }
        else if(this.getActual() == this.getCerrado())
        {
            this.setNombre(nombre);
            System.out.println("Nombre de la rutina cambiado exitosamente");
        }
        
    }

    @Override
    public void cerrar() 
    {
        this.getActual().cerrar();
        this.setActual(this.getCerrado());
    }
    
}
