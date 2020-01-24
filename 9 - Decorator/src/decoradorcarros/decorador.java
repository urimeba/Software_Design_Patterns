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
public abstract class decorador implements componente
{
    protected componente referencia;

    public decorador(componente referencia) 
    {
        this.referencia = referencia;
    }

    public componente getReferencia() 
    {
        return referencia;
    }

    public void setReferencia(componente referencia) 
    {
        this.referencia = referencia;
    }

    @Override
    public int getPrecio()
    {
        return this.referencia.getPrecio();
    }
    
    
    
}
