/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositetarea;

import java.util.ArrayList;

/**
 *
 * @author Urimeba
 */
public class Grupos extends Activo
{
    private String nombre;
    
    private ArrayList<Activo> elementos = new ArrayList();
    private ArrayList<Personas> personas = new ArrayList();
    private ArrayList<Vehiculos> vehiculos = new ArrayList();
 
    public Grupos(String nombre) 
    {
        this.nombre = nombre;
    }

    public void addElemento(Activo elemento)
    {
        elementos.add(elemento);
        
        if(elemento instanceof Personas)
        {
            personas.add((Personas)elemento);
        }
        
        if(elemento instanceof Vehiculos)
        {
            vehiculos.add((Vehiculos)elemento);
        }
        
        if(elemento instanceof Grupos)
        {            
            for(Activo a: ((Grupos)elemento).elementos)
            {
                        if(a instanceof Personas)
                {
                    personas.add((Personas)a);
                }
                        
                        if(a instanceof Grupos)
                        {
                            for(Activo b: ((Grupos)a).elementos)
                            {
                                if(b instanceof Personas)
                                {
                                    personas.add((Personas)b);
                                }
                            }
                        }
            }
            
        }
    }
    
    public void verElementos()
    {
        for(Activo persona: elementos)
        {       
            System.out.println(persona);
        }
    }
    
    public iPersonas crearIteradorPersonas()
    {
        return new iPersonas(this.personas);
    }
    
    public iVehiculos crearIteradorVehiculos()
    {
        return new iVehiculos(this.vehiculos);
    }

    @Override
    public float getSueldo() 
    {
        return 0;
    }

    @Override
    public void verInfo() 
    {
        System.out.println(toString());
    }

    @Override
    public void notificar(String mensaje) 
    {
        for(Activo elemento:elementos)
        {
            elemento.notificar(mensaje);
        }
    }

    @Override
    public String toString() 
    {
        System.out.println("-------------------------------------------------------------" + "\nGrupo: " + this.nombre );
        
        for(Activo elemento:elementos)
        {
            elemento.verInfo();
        }
        return "";
    }

    public ArrayList<Personas> getPersonas() 
    {
        return personas;
    }

    public ArrayList<Vehiculos> getVehiculos() 
    {
        return vehiculos;
    }
    
    
}
