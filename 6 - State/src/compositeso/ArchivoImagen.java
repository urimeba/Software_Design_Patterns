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
public abstract class ArchivoImagen extends Archivo
{
    private int sizeX;
    private int sizeY;

    public ArchivoImagen(int sizeX, int sizeY, String nombre, float size, String extension) 
    {
        super(nombre, size, extension);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    
    public int getSizeX() 
    {
        return sizeX;
    }

    public void setSizeX(int sizeX) 
    {
        this.sizeX = sizeX;
    }

    public int getSizeY() 
    {
        return sizeY;
    }

    public void setSizeY(int sizeY) 
    {
        this.sizeY = sizeY;
    }
}
