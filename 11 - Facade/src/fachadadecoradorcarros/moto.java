/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadadecoradorcarros;

/**
 *
 * @author Urimeba
 */
public class moto implements componente
{

    public static String getNombre() 
    {
        return "Yamaha FZ";
    }

    public static int getAño() 
    {
        return 2018;
    }

    public static String getGasolina() 
    {
        return "Premium";
    }

    public static boolean isAutomatico() 
    {
        return false;
    }
    

    @Override
    public int getPrecio() 
    {
        return 45000;
    }
    
}
