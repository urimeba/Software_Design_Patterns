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
public class civic implements componente
{

    public civic() 
    {
        
    }

    public static String getNombre() 
    {
        return "Civic";
    }

    public static int getAño() 
    {
        return 2017;
    }

    public static String getGasolina() 
    {
        return "Magna";
    }

    public static boolean isAutomatico() 
    {
        return false;
    }
    
    @Override
    public int getPrecio() 
    {
        return 250000;
    }
    
}
