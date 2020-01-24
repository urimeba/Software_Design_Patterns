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
public abstract class ArchivoAudio extends Archivo
{
    private float duracion;

    public ArchivoAudio(float duracion, String nombre, float size, String extension) 
    {
        super(nombre, size, extension);
        this.duracion = duracion;
    }

    public float getDuracion() 
    {
        return duracion;
    }

    public void setDuracion(float duracion) 
    {
        this.duracion = duracion;
    }
    
    
}
