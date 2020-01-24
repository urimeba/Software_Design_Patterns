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
public class adaptador 
{
    private cableCoaxial cc;
    private cableWifi cw;

    public adaptador(cableCoaxial cc) 
    {
        this.cc = cc;
    }

    public adaptador(cableWifi cw) 
    {
        this.cw = cw;
    }
    
    public String conectarCoaxial(cableCoaxial cc)
    {
        if(cc.getTipo()!="Ethernet")
        {
            cc.setTipo("Ethernet");
            return cc.getTipo();
        }
        else
        {
            return cc.getTipo();
        }
    }
    
    public String conectarWifi (cableWifi cw)
    {
        if(cw.getTipo()!="Ethernet")
        {
            cw.setTipo("Ethernet");
            return cw.getTipo();
        }
        else
        {
            return cw.getTipo();
        }
    }
    
    
}
