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
public class mazda implements componente
{
    public mazda() 
    {
        
    }
    
    public String getNombre() 
    {
        return "Mazda 3";
    }

    
    public int getAño() {
        return 2015;
    }

    public String getGasolina() {
        return "Premium";
    }

    public boolean isAutomatico() {
        return true;
    }

    @Override
    public int getPrecio() 
    {
        return 350000;
    }
}
