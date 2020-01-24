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
public class cableWifi implements wifi
{
    String tipo=wifi.tipo;

    public cableWifi() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
