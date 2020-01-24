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
public class PalomaMensajera implements Comunicacion
{

    @Override
    public void mandarMensaje(String mensaje) 
    {
        System.out.println("El mensaje: '" + mensaje + "' ha sido enviado a traves de una Paloma Mensajera");
    }
    
}
