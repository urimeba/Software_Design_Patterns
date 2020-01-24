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
public abstract class Archivo extends Componente
{
    private String extension;

    public Archivo(String nombre, float size, String extension) 
    {
        super(nombre, size);
        this.extension=extension;
    }
    
    /*GETTERS Y SETTERS*/

    public String getExtension() 
    {
        return extension;
    }

    public void setExtension(String extension) 
    {
        this.extension = extension;
    }

    /*Sobreescribiendo los metodos abstractos*/
    
    public void info()
    {
        System.out.println(toString());
    }
    
    @Override
    public String toString() 
    {
        return "(A) " + this.getNombre() + this.getExtension() + " (" + this.getSize() + "MB)";
    }
    
    public void abrir()
    {
        this.getActual().abrir();
        this.setActual(this.getAbierto());
    }

    public void cerrar()
    {
        this.getActual().cerrar();
        this.setActual(this.getCerrado());
    }
    
    public void cambiarNombre(String nombre)
    {
        if(this.getActual()== this.getAbierto())
        {
            System.out.println("Cierra primero el archivo para cambiar el nombre");
        }
        else if(this.getActual() == this.getCerrado())
        {
            this.setNombre(nombre);
            System.out.println("Nombre cambiado exitosamente");
        }
        
    }
    
}
