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
public class Computadora 
{
    

    public Computadora() 
    {
        
    }
    
    public void conectar(String tipo)
    {
        if(tipo=="Ethernet")
        {
            System.out.println("Interfaz conectada");
        }
        else
        {
            System.out.println("No puedes conectar otra interfaz que no sea Ethernet a esta PC");
        }
    }
    
    public void mandarMensaje(String mensaje, String tipo)
    {
        if(tipo=="Ethernet")
        {
            System.out.println("Interfaz conectada");
            System.out.println("Mensaje: '"+mensaje + "' enviado\n");
        }
        else
        {
            System.out.println("No puedes conectar otra interfaz que no sea Ethernet a esta PC");
        }
        
    }
 
    
}
