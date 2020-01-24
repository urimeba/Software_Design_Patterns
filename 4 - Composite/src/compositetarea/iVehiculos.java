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
public class iVehiculos implements Iterador
{
    
    private int puntero=0;
    private ArrayList<Vehiculos> listaVehiculos=null;

    public iVehiculos(ArrayList<Vehiculos> listaVehiculos) 
    {
        this.listaVehiculos=listaVehiculos;
    }
    
    @Override
    public Personas siguiente() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personas actual() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean vacio() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
