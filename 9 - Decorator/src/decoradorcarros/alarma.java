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
public class alarma extends decorador
{
    
    public alarma(componente referencia) 
    {
        super(referencia);
    }
    
    public void addAlarma()
    {
        System.out.println("Se ha agregado alarma al auto");
    }

    @Override
    public int getPrecio() 
    {
        int a=0;
        if(this.referencia.automatico==true)
        {
            a= this.referencia.getPrecio()+8000;
        }
        else if(this.referencia.automatico==false)
        {
            a= this.referencia.getPrecio()+5000;
        }
        this.addAlarma();
        return a;
    }
}
