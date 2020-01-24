/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositetarea;

import java.util.ArrayList;

/**
 *
 * @author Urimeba
 */
public interface Iterador 
{
    public Personas siguiente();
    public Personas actual();
    public boolean vacio();
}
