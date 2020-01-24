/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementorectangulo;

/**
 *
 * @author Urimeba
 */
public class MementoRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Rectangulo rec= new Rectangulo(50,50);
                
        rec.setCoorX(40);
        
        rec.regresar();
        
        rec.setCoorY(60);
        
        rec.regresar();
        
        rec.setCoords(55,55);
        
        rec.regresar();
        
        rec.siguiente();
    }
    
}
