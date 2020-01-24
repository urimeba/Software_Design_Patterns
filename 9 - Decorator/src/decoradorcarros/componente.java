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
public interface componente 
{
    public String nombre=null;
    public int año=0;
    public int precio=0;
    public String gasolina=null;
    public boolean automatico=false;
    
    public int getPrecio();
}
