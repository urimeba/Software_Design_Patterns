/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaconexion;

import java.util.ArrayList;

/**
 *
 * @author Urimeba
 */
public class AdminConexiones 
{
    private static ArrayList<String> bufferConsultas=new ArrayList();
    //Static indica que el metodo siempre se hara
    private static AdminConexiones conn=null;

    private AdminConexiones() 
    {
        
    }
    
    public static AdminConexiones getAdminConexiones()
    {          
        if(conn==null)
        {
            AdminConexiones.conn= new AdminConexiones();
        }
        return AdminConexiones.conn;
        
    }
    
    public static void addConsulta(String query)
    {
        bufferConsultas.add(query);
    }
    
    public void consultar() throws InterruptedException
    {
        for(String a: this.bufferConsultas)
        {                 
            boolean buscarConexion=true;
            
            while(buscarConexion==true)
            {
                buscarConexion=!Conexion.consultar(a);
            }
                            
        }
           System.out.println("No hay mas consultas");     
    }       
}
