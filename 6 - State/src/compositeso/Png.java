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
public class Png extends ArchivoImagen
{
    private int transparencia=0;
    
    public Png(int sizeX, int sizeY, String nombre, float size) 
    {
        super(sizeX, sizeY, nombre, size, ".png");
    }

    public int getTransparencia() 
    {
        return transparencia;
    }

    public void setTransparencia(int transparencia) 
    {
        this.transparencia = transparencia;
    }
    
    public static Png parsePng(ArchivoImagen imagen)
    {
        return new Png(imagen.getSizeX(),imagen.getSizeY(),imagen.getNombre(),imagen.getSize());
    }

    @Override
    public String toString() 
    {
        return super.toString() + " Transparencia: " + this.transparencia + "%"; 
    }
}
