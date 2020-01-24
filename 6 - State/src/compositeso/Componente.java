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
public abstract class Componente 
{
    private float size = 0;
    private String nombre;
    
    private Estado actual;
    private EstadoAbierto abierto;
    private EstadoCerrado cerrado;

    //Ponemos el nombre, por que no podemos asignar un tamaño 0 a la carpeta
    public Componente(String nombre) 
    {
        this.nombre = nombre;
        abierto=new EstadoAbierto(this);
        cerrado=new EstadoCerrado(this);
        
        actual=cerrado;
    }
    
    //Este constructor es para el arhivo, ya que si necesita un tamaño 
    public Componente(String nombre, float size) 
    {
        this.nombre = nombre;
        this.size = size;
        abierto=new EstadoAbierto(this);
        cerrado=new EstadoCerrado(this);
        
        actual=cerrado;
    }

    public Estado getActual() {
        return actual;
    }

    public EstadoAbierto getAbierto() {
        return abierto;
    }

    public EstadoCerrado getCerrado() {
        return cerrado;
    }

    public void setActual(Estado actual) {
        this.actual = actual;
    }
    
    public float getSize() 
    {
        return size;
    }

    public void setSize(float size) 
    {
        this.size = size;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    //Se hace abstracta para que los hijos de la herencia definan el metodo
    public abstract void abrir();
    public abstract void cerrar();
    
    //Regresa informacion abstracta
    public abstract void info();
    
    //cambiamos el nombre
    public abstract void cambiarNombre(String nombre);
}
