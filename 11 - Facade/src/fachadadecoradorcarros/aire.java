/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadadecoradorcarros;

/**
 *
 * @author Urimeba
 */
public class aire extends decorador
{

    public aire(componente referencia) 
    {
        super(referencia);
    }

    public void addAire()
    {
        if(this.referencia instanceof moto)
        {
            System.out.println("No se puede agregar aire a una moto");
        }
        else
        {
            System.out.println("Se ha agregado aire al auto");
        }
        
    }

    @Override
    public int getPrecio() 
    {
        if(this.referencia instanceof moto)
        {
            this.addAire();
            return this.referencia.getPrecio();
        }
        else
        {
            this.addAire();
            return this.referencia.getPrecio()+3500;
        }
        
    }
    
    
    
    
}
