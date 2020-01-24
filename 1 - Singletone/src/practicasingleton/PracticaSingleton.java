/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasingleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Urimeba
 */
public class PracticaSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        // TODO code application logic here
        
        BufferedReader Console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresa la instancia a crear (1 o 2)");
        int numInstancia = Integer.parseInt(Console.readLine());
        
        if(numInstancia==1)
        {
            Conexion principal = Conexion.getInstancia(1);
            
            System.out.println("Ingresa la IP de la Base de Datos");
            String IP = Console.readLine();
            principal.setIP(IP);
            
            System.out.println("\nIngresa el Usuario de la Base de Datos");
            String usuario = Console.readLine();
            principal.setNombreUsuario(usuario);
            
            System.out.println("\nIngresa la contraseña de la Base de Datos");
            String contraseña = Console.readLine();
            principal.setContraseña(contraseña);
            
            System.out.println("\nIngresa el nombre de la Base de Datos");
            String base = Console.readLine();
            principal.setBaseDeDatos(base);
            
            principal.setConectada(false);
            
            System.out.println(principal.ejecutarConsulta());
            
        }
        else if(numInstancia==2)
        {
            Conexion principal = Conexion.getInstancia(2);
        }
        else
        {
            System.err.println("NO PUEDES EJECUTAR MAS DE DOS INSTANCIAS");
        }
    }
    
}
