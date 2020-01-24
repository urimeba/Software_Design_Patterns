/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptadorethernet1;

/**
 *
 * @author Urimeba
 */
public class cableCoaxial implements coaxial
{
    String tipo = coaxial.tipo;

    public cableCoaxial() 
    {
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
}
