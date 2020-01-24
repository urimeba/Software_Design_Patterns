/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementorectangulo;

import java.util.ArrayList;

/**
 *
 * @author Urimeba
 */
class GestorRecuerdos 
{
    private ArrayList<Recuerdo> recuerdos = new ArrayList();
    private Integer pivote=null;

    public GestorRecuerdos() 
    {
        
    }
    
    public void addRecuerdo(Rectangulo r)
    {
        recuerdos.add(new Recuerdo(r.getCoorX(),r.getCoorY()));
        
        if(pivote==null)
        {
            pivote=0;
        }
        else
        {
            pivote++;
        }
    }
    
    public Recuerdo getRecuerdoAnterior()
    {
        Recuerdo rec = null;
        
        if(!recuerdos.isEmpty() && pivote>0)
        {
            rec=recuerdos.get(this.pivote-1);
            //this.pivote--;
        }
        
        return rec;
        
    }
    
    public Recuerdo getRecuerdoSiguiente()
    {
        Recuerdo rec = null;
        
        if(!recuerdos.isEmpty() && pivote>(this.recuerdos.size()-1))
        {
            rec=recuerdos.get(this.pivote+1);
            //pivote++;
        }
        
        return rec;
    } 

    public ArrayList<Recuerdo> getRecuerdos() 
    {
        return recuerdos;
    }
    
    
}
