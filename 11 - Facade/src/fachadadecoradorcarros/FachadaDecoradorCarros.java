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
public class FachadaDecoradorCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        // TODO code application logic here
        
        /*System.out.println("-------------MAZDA-----------------");
        componente mazda = new mazda();
        mazda carro = (mazda)mazda;
        String automatico;
        
        System.out.println("Modelo: " + carro.getNombre());
        System.out.println("Año: " + carro.getAño());
        System.out.println("Gasolina: " + carro.getGasolina());
        if(carro.isAutomatico())
        {
            automatico="SI";
        }
        else
        {
            automatico="NO";
        }
        System.out.println("Automatico: " + automatico);
        System.out.println("Precio Total: $" + carro.getPrecio() );
        
        componente dos = new aire(carro);
        
        System.out.println(dos.getPrecio());
        
        dos = new alarma(dos);
        
        System.out.println(dos.getPrecio());
        
        dos = new audio(dos);
        
        System.out.println(dos.getPrecio());
        
        dos = new rines(dos);
        
        System.out.println(dos.getPrecio());
        
        System.out.println("\n-------------CIVIC-----------------");
        
        componente civic = new civic();
        
        civic carroDos = (civic)civic;
        
        System.out.println("Modelo: " + carroDos.getNombre());
        System.out.println("Año: " + carroDos.getAño());
        System.out.println("Gasolina: " + carroDos.getGasolina());
        if(carroDos.isAutomatico())
        {
            automatico="SI";
        }
        else
        {
            automatico="NO";
        }
        System.out.println("Automatico: " + automatico);
        System.out.println("Precio Total: $" + carroDos.getPrecio() );
       
        componente auto = new aire(civic);
        
        System.out.println(auto.getPrecio());
        
        auto = new alarma(auto);
        
        System.out.println(auto.getPrecio());
        
        auto = new audio(auto);
        
        System.out.println(auto.getPrecio());
        
        auto = new rines(auto);
        
        System.out.println(auto.getPrecio());
        
        System.out.println("----------MOTO---------");
        componente moto = new moto();
        componente mot = new alarma(moto);
        System.out.println(moto.getPrecio());
        System.out.println(mot.getPrecio());
        mot = new aire(mot);
        System.out.println(mot.getPrecio());*/
        
        fachada fachada = new fachada();
        
        //Tipo de auto: Civic o Mazda
        
        fachada.comprarAutoSemiEquipado("Civic");
        
        fachada.comprarMoto();
        
        fachada.comprarAutoEquipado("Mazda");
        
        
    }
    
}
