/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadadecoradorcarros;

/**
 *
 * @author Urimeba
 */
public class fachada 
{
    private civic civic;
    private mazda mazda;
    private moto moto;

    public fachada() 
    {
        this.civic=new civic();
        this.mazda=new mazda();
        this.moto=new moto();
    }
    
    public void comprarAutoSencillo(String nombre)
    {
        if(nombre=="Civic")
        {
            componente auto = new aire(civic);
            System.out.println(nombre);
            System.out.println(auto.getPrecio());
            
        }
        else if(nombre=="Mazda")
        {
            componente auto = new aire(mazda);
            System.out.println(nombre);
            System.out.println(auto.getPrecio());
        }
        
    }
    
    public void comprarAutoSemiEquipado(String nombre)
    {
        if(nombre=="Civic")
        {
            componente auto = new aire(civic);
            auto = new audio(auto);
            auto = new rines(auto);
            System.out.println(nombre);
            System.out.println(auto.getPrecio());
        }
        else if(nombre=="Mazda")
        {
            componente auto = new aire(mazda);
            auto = new audio(auto);
                        auto = new rines(auto);

            System.out.println(nombre);
            System.out.println(auto.getPrecio());
        }
    }
    
    public void comprarAutoEquipado(String nombre)
    {
        if(nombre=="Civic")
        {
            componente auto = new aire(civic);
            auto = new audio(auto);
            auto=new alarma(auto);
            auto=new rines(auto);
            System.out.println(nombre);
            System.out.println(auto.getPrecio());
        }
        else if(nombre=="Mazda")
        {
            componente auto = new aire(mazda);
            auto = new audio(auto);
            auto=new alarma(auto);
            auto=new rines(auto);
            System.out.println(nombre);
            System.out.println(auto.getPrecio());
        }
    }
    
    public void comprarMoto()
    {
        componente auto = new alarma(moto);
        System.out.println(moto.getNombre());
        System.out.println(auto.getPrecio());
    }
    
    
    
    
}
