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

public class CreadorConcreto extends Creador
{
    PalomaMensajera paloma = null;
    TelefonoCelular telefono = null;

    public CreadorConcreto() 
    {
        
    }

    
    
    @Override
    public Comunicacion crearComunicador(String tipo) 
    {
        if(tipo=="paloma")
            {
                paloma = new PalomaMensajera();
                return paloma;
            }
            else
            {
                telefono = new TelefonoCelular();
                return telefono;
            }
    }
    
}
