/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeso;

/**
 *
 * @author Urimeba
 */
public abstract class Estado 
{
    protected Componente contexto;

    public Estado (Componente contexto) 
    {
        this.contexto=contexto;
    }
    
    public abstract void abrir();
    public abstract void cerrar();
}
