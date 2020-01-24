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
public class Mp3 extends ArchivoAudio
{
    
    public Mp3(float duracion, String nombre, float size) 
    {
        super(duracion, nombre, size, ".mp3");
    }
}
