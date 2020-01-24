/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeso;

import java.util.ArrayList;

/**
 *
 * @author Urimeba
 */
public class Folder extends Componente
{
    private ArrayList<Componente> elementos = new ArrayList();

    public Folder(String nombre) 
    {
        super(nombre);
    }
    
    //Agregamos archivos a esta carpeta, ya sea de tipo Carpeta o de tipo Archivo
    public void addElemento(Componente elemento)
    {
        elementos.add(elemento);
    }

    public float getSize()
    {
        float sumaSize=0;
        
        for(Componente elemento:elementos)
        {
            sumaSize+=elemento.getSize();
        }
        
        return sumaSize;
    }
    
    public void verElementos()
            {
                for(Componente elemento: elementos)
                {                    
                    System.out.println(elemento);                    
                }
            }

    public void info()
    {
        System.out.println("Carpeta: " + this.getNombre() + " con " + this.elementos.size() + " elementos");
        for(Componente elemento: elementos)
        {
            elemento.info();
        }
    }
    
    //Este es el metodo abstracto de la clase Componente
    
    @Override
    public void abrir() 
    {
        this.getActual().abrir();
        this.setActual(this.getAbierto());
    }

    @Override
    public void cambiarNombre(String nombre) 
    {
        System.out.println("Nombre cambiado exitosamente");
        this.setNombre(nombre);
    }

    @Override
    public void cerrar() 
    {
        this.getActual().cerrar();
        this.setActual(this.getCerrado());
    }
    
    @Override
    public String toString() 
    {
        return "(C) " + this.getNombre() + " " + this.elementos.size() + " elementos";
    }
}
