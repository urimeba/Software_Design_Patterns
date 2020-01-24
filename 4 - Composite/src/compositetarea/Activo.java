/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositetarea;

/**
 *
 * @author Urimeba
 */
public abstract class Activo 
{
    public Activo() 
    {
        
    }

    //Metodos abstractos, debido a que la mayoria de las clases lo ocuparan y cada una sobreescribira su metodo
    public abstract void notificar(String mensaje);
    public abstract void verInfo();
    public abstract float getSueldo();
}
