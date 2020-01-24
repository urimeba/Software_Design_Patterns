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
public abstract class Vehiculos extends Activo
{
    private int numPlaca;
    private String modelo;

    public Vehiculos(int numPlaca, String modelo) 
    {
        this.numPlaca = numPlaca;
        this.modelo = modelo;
    }

    public int getNumPlaca() 
    {
        return numPlaca;
    }

    public void setNumPlaca(int numPlaca) 
    {
        this.numPlaca = numPlaca;
    }

    public String getModelo() 
    {
        return modelo;
    }

    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    }
}
