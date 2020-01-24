    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeso;

/**
 *
 * @author Urimeba
 */
public class Jpg extends ArchivoImagen
{
    
    public Jpg(int sizeX, int sizeY, String nombre, float size) 
    {
        super(sizeX, sizeY, nombre, size, ".jpg");
    }
    
    public static Jpg parseJpg (ArchivoImagen imagen)
    {
        return new Jpg(imagen.getSizeX(),imagen.getSizeY(),imagen.getNombre(),imagen.getSize());
    }

    
}
