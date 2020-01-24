/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoradorcarros;

/**
 *
 * @author Urimeba
 */
public class DecoradorCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        System.out.println("-------------MAZDA-----------------");
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
        
        dos = new aire(dos);
        
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
        
    }
    
    
}
