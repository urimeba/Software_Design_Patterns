/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeso;

/**
 *
 * @author Urimeba
 */
public class EstadoAbierto extends Estado
{

    public EstadoAbierto(Componente contexto) 
    {
        super(contexto);
    }

    @Override
    public void abrir() 
    {
        if(this.contexto instanceof Archivo)
        {
            System.out.println("El archivo ya esta abierto. Cierralo primero");
        }
        else if(this.contexto instanceof Folder)
        {
            System.out.println("La carpeta ha sido abierta con exito");
            this.contexto.setActual(this.contexto.getAbierto());
        }
        else if(this.contexto instanceof Rutina)
        {
            System.out.println("La rutina ya esta abierta. Cierrala primero");
        }
        
    }

    @Override
    public void cerrar() 
    {
        if(this.contexto instanceof Archivo)
        {
            System.out.println("El archivo ha sido cerrado exitosamente");
            this.contexto.setActual(this.contexto.getCerrado());
        }
        else if(this.contexto instanceof Folder)
        {
            System.out.println("Carpeta cerrada");
            this.contexto.setActual(this.contexto.getCerrado());
        }
        else if(this.contexto instanceof Rutina)
        {
            System.out.println("La rutina ha sido cerrada exitosamente");
            this.contexto.setActual(this.contexto.getCerrado());
        }
    }
}
