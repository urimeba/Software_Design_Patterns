/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaconexion;

/**
 *
 * @author Urimeba
 */
public class Hilo extends Thread
{
    private Conexion conn=null;

    public Hilo(Conexion conn) 
    {
        this.conn = conn;
    }
    
    public Conexion getConn()
    {
        return conn;
    }
        
    public void setConn(Conexion conn)
    {
        this.conn=conn;
    }
    
    @Override
    public void run()
    {
        try
        {
            System.out.println(conn.isConsultando());
            int tiempoSegundos = (int)(Math.random()*1000);
            Thread.sleep(tiempoSegundos);
            System.out.println("El proceso se durmio durante: " + (tiempoSegundos/100) + " segundos\n");
            this.conn.setConsultando(false);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
}
