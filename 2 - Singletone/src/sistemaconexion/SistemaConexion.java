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
public class SistemaConexion 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException 
    {
        // TODO code application logic here
    AdminConexiones ejecutor = AdminConexiones.getAdminConexiones();
    
    Conexion.crearConexion("127.0.0.2", "usuario", "contraseña", "base");
    Conexion.crearConexion("localhost", "user", "contraseña", "base");
    
    Conexion.habilitarConexion("127.0.0.2");
    Conexion.habilitarConexion("localhost");
        
    String query=null;
    ejecutor.addConsulta(query = "Select * from clientes");
    ejecutor.addConsulta(query = "Select * from productos");
    ejecutor.addConsulta(query = "Select * from empleados");
    ejecutor.addConsulta(query = "Select * from pedidos");
    
    ejecutor.consultar();   
        
    }
    
}
