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
public class Conexion 
{
    //    private boolean disponible=false;
//    private String ip;
//    private String user;
//    private String pass;
//    private String bd;
//    
//    //Esto sirve para la cantidad de instancias que queremos definir
//    private static ArrayList<Conexion> conexiones = new ArrayList();
//    
//    
//    private Conexion(String ip, String user, String pass, String bd)
//    {
//        this.ip=ip;
//        this.user=user;
//        this.pass=pass;
//        this.bd=bd;
//    }
//    
//    public static void crearConexion(String ip, String user, String pass, String bd)
//    {
//        if(conexiones.size()<2)
//        {
//            conexiones.add(new Conexion(ip, user, pass, bd));
//        }
//        else
//        {
//            System.out.println("NO se pueden establecer nuevas conexiones");
//            
//            for(Conexion obj: conexiones)
//            {
//                System.out.println(obj);
//            }
//        }
//    }
//    
//    public static void habilitarConexion(String ip)
//    {
//        for(Conexion obj: conexiones)
//            {
//                if(obj.getIp()==ip)
//                {
//                    obj.setDisponible(true);
//                }
//                
//            }
//    }
//    
//    public static void deshabilitarConexion(String ip)
//    {
//        for(Conexion obj: conexiones)
//            {
//                if(obj.getIp()==ip)
//                {
//                    obj.setDisponible(false);
//                }
//                
//            }
//    }
//
//    public void setDisponible(boolean disponible) {
//        this.disponible = disponible;
//    }
//
//    public void setIp(String ip) {
//        this.ip = ip;
//    }
//
//    public void setUser(String user) {
//        this.user = user;
//    }
//
//    public void setPass(String pass) {
//        this.pass = pass;
//    }
//
//    public void setBd(String bd) {
//        this.bd = bd;
//    }
//
//    public boolean isDisponible() {
//        return disponible;
//    }
//
//    public String getIp() {
//        return ip;
//    }
//
//    public String getUser() {
//        return user;
//    }
//
//    public String getPass() {
//        return pass;
//    }
//
//    public String getBd() {
//        return bd;
//    } 
    
    private static ArrayList<Conexion> conexiones=new ArrayList() ;
    private static boolean disponible = false;
    private static boolean consultando = false;
    private String user;
    private String ip;
    private String pass;
    private String bd;
        
    private Conexion(String ip, String user, String pass, String bd) 
    {
        this.ip=ip;
        this.user=user;        
        this.pass=pass;
        this.bd=bd;
    }
    
    
    public static void crearConexion(String ip, String user, String pass, String bd)
    {           
        if(conexiones.size()<2)
        {
            synchronized(Conexion.class)
                    {
                        conexiones.add(new Conexion(ip, user, pass, bd));                        
                    }           
        }
        else
        {
            System.out.println("No se pueden crear mas conexiones");
        }
    }
    
    public void deshabilitarConexion(String ip)
    {
        for(Conexion a:conexiones)
        {
            if(a.getIp().equals(ip))
            {
                a.setDisponible(false);
            }
        }
    }
    
    public static void habilitarConexion(String ip)
    {
        for(Conexion a:conexiones)
        {
            if(a.getIp().equals(ip))
            {
                a.setDisponible(true);                                
            }
        }
    }
    
    public static boolean consultar(String query) throws InterruptedException 
    {
        for(Conexion a:conexiones)
        {            
            if(a.disponible==true)
            {
                if(a.consultando==false)
                {
                    System.out.println(a.getIp() + " ejecuta " + query);   
                    a.setConsultando(true);
                    Hilo ejecucion = new Hilo(a);                    
                    ejecucion.start();                       
                    return true;                      
                }                  
            } 
        }
        return false;
    }
    
    public static void mostrarConexiones()
    {
        for(Conexion a:conexiones)
        {
            System.out.println("* " + a.getIp());
        }
    }
    
    public boolean isDisponible() 
    {
        return disponible;
    }

    public void setDisponible(boolean disponible) 
    {
        this.disponible = disponible;
    }

    public boolean isConsultando() 
    {
        return consultando;
    }

    public void setConsultando(boolean consultando) 
    {
        this.consultando = consultando;
    }

    public String getUser() 
    {
        return user;
    }

    public void setUser(String user) 
    {
        this.user=user;
    }

    public String getIp() 
    {
        return ip;
    }

    public void setIp(String ip) 
    {
        this.ip=ip;
    }

    public String getPass() 
    {
        return pass;
    }

    public void setPass(String pass) 
    {
        this.pass=pass;
    }

    public String getBd() 
    {
        return bd;
    }

    public void setBd(String bd) 
    {
        this.bd=bd;
    }
    
    
}
