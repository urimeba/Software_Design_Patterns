/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicador;

/**
 *
 * @author Urimeba
 */
public abstract class Creador 
{

    public Creador() 
    {
        
    }
    
    public abstract Comunicacion crearComunicador(String tipo);
    
}
