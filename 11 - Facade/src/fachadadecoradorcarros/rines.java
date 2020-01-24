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
public class rines extends decorador
{
    
    public rines(componente referencia) 
    {
        super(referencia);
    }
    
    public void addRines()
    {
        System.out.println("Se agregan rines al auto");
    }

    @Override
    public int getPrecio() 
    {
        this.addRines();
        return this.referencia.getPrecio()+3500;
    }
    
    
    
}
