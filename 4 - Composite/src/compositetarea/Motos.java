
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
public class Motos extends Vehiculos
{

    public Motos(int numPlaca, String modelo) 
    {
        super(numPlaca, modelo);
    }

    @Override
    public String toString() 
    {
        return "\nMoto: " + this.getModelo() + " - " + this.getNumPlaca();
    }

    @Override
    public void notificar(String mensaje) 
    {
        System.out.println("No se puede enviar un mensaje a un vehiculo");
    }

    @Override
    public void verInfo() 
    {
        System.out.println(toString());
    }

    //QUE PUEDO HACER SI TENGO QUE REGRESAR UN FLOAT?
    @Override
    public float getSueldo() 
    {
        return 0;
    }

    
    
    
}
