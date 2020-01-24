/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementorectangulo;

/**
 *
 * @author Urimeba
 */
public class Rectangulo 
{
    private GestorRecuerdos gestorRecuerdos = new GestorRecuerdos();
    private int CoorX;
    private int CoorY;
    

    public Rectangulo(int CoorX, int CoorY) 
    {
        this.setCoords(CoorX, CoorY);
    }

    public int getCoorX() 
    {
        return CoorX;
    }

    public void setCoorX(int CoorX) 
    {
        this.CoorX = CoorX;
        this.gestorRecuerdos.addRecuerdo(this);
        this.propiedades();
    }

    public int getCoorY() 
    {
        return CoorY;
    }

    public void setCoorY(int CoorY) 
    {
        this.CoorY = CoorY;
        this.gestorRecuerdos.addRecuerdo(this);
        this.propiedades();
    }
    
    public void setCoords(int CoorX, int CoorY)
    {
        this.CoorX=CoorX;
        this.CoorY=CoorY;
        this.gestorRecuerdos.addRecuerdo(this);
        this.propiedades();
    }

    public void regresar()
    {
        /*for(Recuerdo r: gestorRecuerdos.getRecuerdos())
        {
            System.out.println("Recuerdo:");
            System.out.println(r.getCoordX());
            System.out.println(r.getCoordY());
        }*/
        
        Recuerdo rec=gestorRecuerdos.getRecuerdoAnterior();
        if(rec!=null)
        {
            System.out.print("Se regreso ha un estado anterior: ");
            this.setCoords(rec.getCoordX(),rec.getCoordY());
        }
        else
        {
            System.out.println("No existen imagenes anteriores");
        }
    }
    
    public void siguiente()
    {
        System.out.print("Se regreso al estado siguiente: ");
        
        Recuerdo rec=gestorRecuerdos.getRecuerdoSiguiente();
        
        if(rec!=null)
        {
            this.setCoords(rec.getCoordX(), rec.getCoordY());
        }
        else
        {
            System.out.println("No existen imagenes siguientes");
        }
    }

    @Override
    public String toString() 
    {
        return "CoorX= " + CoorX + ", CoorY= " + CoorY;
    }
    
    public void propiedades()
    {
        System.out.println(toString());
    }
}
