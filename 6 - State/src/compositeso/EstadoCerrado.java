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
public class EstadoCerrado extends Estado
{

    public EstadoCerrado(Componente contexto) 
    {
        super(contexto);
    }


    @Override
    public void abrir() 
    {
        if(this.contexto instanceof Archivo)
        {
            System.out.println("El archivo ha sido abierto con exito");
            this.contexto.setActual(this.contexto.getAbierto());
        }
        else if(this.contexto instanceof Folder)
        {
            System.out.println("La carpeta ha sido abierta con exito");
            this.contexto.setActual(this.contexto.getAbierto());
        }
        else if(this.contexto instanceof Rutina)
        {
            System.out.println("La rutina ha sido abierta con exito");
            this.contexto.setActual(this.contexto.getAbierto());
        }
        
    }

    @Override
    public void cerrar() 
    {
        if(this.contexto instanceof Archivo)
        {
            System.out.println("Este elemento esta cerrado. Abrelo primero");
        }
        else if(this.contexto instanceof Folder)
        {
            System.out.println("Se abre la carpeta");
        }
        else if(this.contexto instanceof Rutina)
        {
            System.out.println("Este elemento esta cerrado. Abrelo primero");
        }
        
    }
    
    
}
