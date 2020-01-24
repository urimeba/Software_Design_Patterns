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
public class Comunicador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        CreadorConcreto c = new CreadorConcreto();
        PalomaMensajera paloma = (PalomaMensajera)c.crearComunicador("paloma");
        TelefonoCelular telefono = (TelefonoCelular) c.crearComunicador("telefono");
        
        paloma.mandarMensaje("Hola");
        telefono.mandarMensaje("Adios");
        
    }
    
}
