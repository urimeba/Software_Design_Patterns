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
public class iPersonas implements Iterador
{
    private int puntero=0;
    private ArrayList<Personas> listaPersonas=null;

    public iPersonas(ArrayList<Personas> listaPersonas)  
    {
        this.listaPersonas=listaPersonas;
    }

    @Override
    public Personas siguiente() 
    {
        if(!this.vacio() && listaPersonas.size() > puntero+1)
        {
            puntero++;
            return this.actual();
        }
        else
        {
            return null;
        }
    }

    @Override
    public Personas actual() 
    {
        return (!this.vacio() ? listaPersonas.get(puntero) : null);
    }

    @Override
    public boolean vacio() 
    {
        return !(this.listaPersonas.size()>0);
    }
    
    public ArrayList<Personas> byNombre(String nombre)
    {
        ArrayList<Personas> personas = new ArrayList();
        
        for(Personas persona: listaPersonas)
        {
            if(persona.getNombre()==nombre)
            {
                personas.add(persona);
            }
        }
        return personas;
    }
    
    /*FILTROS*/
    public ArrayList<Personas> bySueldo(float sueldo)
    {
        ArrayList<Personas> personas = new ArrayList();
        
        for(Personas persona: listaPersonas)
        {
            if(persona.getSueldo()==sueldo)
            {
                personas.add(persona);
            }
        }
        
        return personas;
    }
    
    public ArrayList<Personas> byDispositivo()
    {
        ArrayList<Personas> personas = new ArrayList();
        
        for(Personas persona: listaPersonas)
        {
            if(persona instanceof VendedorAvanzado)
            {
                if(((VendedorAvanzado)persona).getDispositivo()!=null)
                {
                    personas.add(persona);
                }
            }
            else if(persona instanceof Lider)
            {
                if(((Lider)persona).getDispositivo()!=null)
                {
                    personas.add(persona);
                }
            }
        }
        
        return personas;
    }
    
    /*public void verElementos()
    {
        for(Personas persona: listaPersonas)
        {
            System.out.println(persona.getNombre());
        }
    }*/
}
