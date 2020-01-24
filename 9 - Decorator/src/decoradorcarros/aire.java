/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoradorcarros;

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
        System.out.println("Se ha agregado aire al auto");
    }

    @Override
    public int getPrecio() 
    {
        this.addAire();
        return this.referencia.getPrecio()+3500;
    }
    
    
    
    
}
