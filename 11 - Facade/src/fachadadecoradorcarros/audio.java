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
public class audio extends decorador
{
    
    public audio(componente referencia) 
    {
        super(referencia);
    }
    
    public void addAudio()
    {
        System.out.println("Se ha agregado un sistema de sonido");
    }

    @Override
    public int getPrecio() 
    {
        this.addAudio();
        return this.referencia.getPrecio()+6000;
    }
    
    
    
}
