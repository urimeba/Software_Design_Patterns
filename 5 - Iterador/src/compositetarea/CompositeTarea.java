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
public class CompositeTarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        //Este es el apartado de ITERADOR. Ingresa los datos que desees buscar dentro de el.
        //Puedes buscar Personas por nombre, por Sueldo o dispositivo, o buscar Vehiculos
        String nombre = "Moises";
        float sueldo = 10000;
        
        //Creando los tres grupos
        Grupos Empresa = new Grupos("Empresa");
        Grupos GrupoA = new Grupos("Grupo A");
        Grupos Beta = new Grupos("Beta");
        
        //Objetos del Grupo Empresa
        Motos Yamaha = new Motos(12345,"FZ-2018");
        Lider Omar= new Lider("UAQ","Omar","Hernandez","omar@correo.com",8778,10000);
        Lider Omar2= new Lider("UTED","Omar","Perez","omar2@correo.com",1244,8000);
        Autos BMW = new Autos(87455,"M3");
        
        //Objetos del Grupo A
        Autos Pointer = new Autos(145522, "Pointer");
        Celular ArisCel = new Celular(442157448);
        Lider Aris = new Lider("CEMEX", ArisCel,"Aristides", "Camacho", "acamacho@correo.com",4526,25000);
        Vendedor Uriel = new Vendedor("Uriel", "Medina","uriel@correo.com",24778,15000);
        Uriel.vender(80);
        
        //Objetos del Grupo BETA
        Celular BrendaCel = new Celular(44788987);
        VendedorAvanzado Brenda = new VendedorAvanzado(BrendaCel,"Brenda","Garcia", "brenda@correo.com",8778,25000);
        Brenda.vender(101);
        Vendedor Moises = new Vendedor("Moises","Perez","moises@correo.com",7877,15000);
        Moises.vender(5);
        
        //Agregando los elementos a cada Grupo
        Beta.addElemento(Brenda);
        Beta.addElemento(Moises);
        
        GrupoA.addElemento(Pointer);
        GrupoA.addElemento(Aris);
        GrupoA.addElemento(Uriel);
        GrupoA.addElemento(Beta);
        
        Empresa.addElemento(Omar);
        Empresa.addElemento(Omar2);
        Empresa.addElemento(Yamaha);
        Empresa.addElemento(BMW);
        Empresa.addElemento(GrupoA);
        
        //Salida de informacion y metodos
        System.out.println("------MOSTRANDO LA INFORMACION DE LA EMPRESA---------");
        Empresa.verInfo();
        
        System.out.println("------MOSTRANDO LA INFORMACION DE GRUPO A ---------");
        GrupoA.verInfo();
        
        System.out.println("------ENVIANDO MENSAJE A TODO EL GRUPO A ---------");
        GrupoA.notificar("Reunion del Grupo A");
        
        System.out.println("\n------ENVIANDO MENSAJE A ARISTIDES UNICAMENTE ---------");
        Aris.notificar("Reunion urgente");
        
        
        System.out.println("\n\n------------------ITERADOR----------------");
        iPersonas personas = Empresa.crearIteradorPersonas();
        
        System.out.println("\n----- MOSTRANDO LAS PERSONAS DE: Empresa -----");
        for(Personas persona: Empresa.getPersonas())
        {
            System.out.println(persona);
        }
        
        System.out.println("\n----- MOSTRANDO LOS VEHICULOS DE: Empresa -----");
        for(Vehiculos vehiculo: Empresa.getVehiculos())
        {
            System.out.println(vehiculo);
        }
        
         System.out.println("\n----- MOSTRANDO LAS PERSONA CON DISPOSITIVO EN: Empresa -----");
      
        for(Personas persona: personas.byDispositivo())
        {
            System.out.println(persona);
        }
        
        System.out.println("\n----- BUSCANDO POR NOMBRE: " + nombre + " -----" );
        
        for(Personas persona: personas.byNombre(nombre))
        {
            System.out.println(persona);
        }
        
        System.out.println("\n----- BUSCANDO POR SUELDO: " + sueldo + " EN: Empresa -----");
        
        for(Personas persona: personas.bySueldo(sueldo))
        {
            System.out.println(persona);
        }
    }
}
