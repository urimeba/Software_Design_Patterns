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
public class AdaptadorEthernet1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Computadora compu = new Computadora();
        cableEthernet ce = new cableEthernet();
        cableCoaxial cc = new cableCoaxial();
        cableWifi cw = new cableWifi();
        
        adaptador a = new adaptador(cc);
        
        System.out.println("Mensaje en Ethernet");
        compu.mandarMensaje("Hola", cc.tipo);
        
        System.out.println("Mensaje en coaxial");
        compu.mandarMensaje("Adios", a.conectarCoaxial(cc));
        
        System.out.println("Mensaje en Wifi");
        compu.mandarMensaje("Hey", a.conectarWifi(cw));
        
        
    }
    
}
