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
public class Recuerdo 
{
    private int CoordX;
    private int CoordY;

    public Recuerdo(int CoordX, int CoordY) 
    {
        this.CoordX = CoordX;
        this.CoordY = CoordY;
    }

    public int getCoordX() 
    {
        return CoordX;
    }

    public int getCoordY() 
    {
        return CoordY;
    }
}
