/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasingleton;

/**
 *
 * @author Urimeba
 */
public class Conexion 
{
    private static Conexion instanciaPrimaria = null;
    private static Conexion instanciaSecundaria = null;
    
    private static String IP;
    private static String nombreUsuario;
    private static String contraseña;
    private static String baseDeDatos;
    private boolean conectada;
    
    private Conexion(String IP, String nombreUsuario, String contraseña, String baseDeDatos)
    {
        this.IP=IP;
        this.nombreUsuario=nombreUsuario;
        this.contraseña=contraseña;
        this.baseDeDatos=baseDeDatos;
    }
    
    public static Conexion getInstancia(int numInstancia)
 {
     if(numInstancia==1)
     {
             if (Conexion.instanciaPrimaria == null)
                {
                    Conexion.instanciaPrimaria = new Conexion(IP,nombreUsuario,contraseña,baseDeDatos);

                    return Conexion.instanciaPrimaria;
                }
         return Conexion.instanciaPrimaria;
     }
     else if(numInstancia==2)
     {
         if (Conexion.instanciaSecundaria == null)
                {
                    Conexion.instanciaSecundaria = new Conexion(IP,nombreUsuario,contraseña,baseDeDatos);

                    return Conexion.instanciaSecundaria;
                }
         return Conexion.instanciaSecundaria;
     }
     else
     {
         System.err.println("No se retorno instancia");
         return null;
     }  
 }
    
    public String ejecutarConsulta()
    {
        if (Conexion.instanciaPrimaria == null)
                {
                   conectada = false;
                    System.out.println("Tu consulta NO fue exitosa");
                }
        else if(Conexion.instanciaPrimaria!=null)
             {
                 conectada=true;
                 System.out.println("Tu consulta fue exitosa");
             }
        else if (Conexion.instanciaSecundaria == null)
                {
                    conectada=false;
                    System.out.println("Tu consulta NO fue exitosa");
                }
         else if (Conexion.instanciaSecundaria != null)
         {
             conectada=true;
             System.out.println("Tu consulta fue exitosa");
         }
         
        
        return "Tu consulta fue:\nIP: " + this.IP + "\nUsuario: " + this.nombreUsuario + "\nContraseña: " + this.contraseña + "\nBase de Datos: " + this.baseDeDatos;

    }

    public void setConectada(boolean conectada) 
    {
             if (Conexion.instanciaPrimaria == null)
                {
                   conectada = false;
                }
             else
             {
                 conectada=true;
             }

         if (Conexion.instanciaSecundaria == null)
                {
                    conectada=false;
                }
         else
         {
             conectada=true;
         }
    }

    public static void setIP(String IP) 
    {
        Conexion.IP = IP;
    }

    public static void setNombreUsuario(String nombreUsuario) 
    {
        Conexion.nombreUsuario = nombreUsuario;
    }

    public static void setContraseña(String contraseña) 
    {
        Conexion.contraseña = contraseña;
    }

    public static void setBaseDeDatos(String baseDeDatos) 
    {
        Conexion.baseDeDatos = baseDeDatos;
    }
    
    
}
