/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositetarea;

/**
 *
 * @author Urimeba
 */
public class Lider extends Personas
{
    private String nombreProyecto;
    private Celular dispositivo;

    public Lider(String nombreProyecto, Celular dispositivo, String nombre, String apellido, String correo, int numeroTrabajador, float sueldo) 
    {
        super(nombre, apellido, correo, numeroTrabajador, sueldo);
        this.nombreProyecto = nombreProyecto;
        this.dispositivo = dispositivo;
    }
    
    public Lider(String nombreProyecto, String nombre, String apellido, String correo, int numeroTrabajador, float sueldo) 
    {
        super(nombre, apellido, correo, numeroTrabajador, sueldo);
        this.nombreProyecto = nombreProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) 
    {
        this.nombreProyecto = nombreProyecto;
    }

    public Celular getDispositivo() 
    {
        return dispositivo;
    }

    public void setDispositivo(Celular dispositivo) 
    {
        this.dispositivo = dispositivo;
    }

    @Override
    public void notificar(String mensaje) 
    {
        System.out.print("El mensaje ha sido enviado a " + this.getNombre() + " " + this.getApellido());
        
        if(this.dispositivo!=null)
        {
            System.out.println(" mediante el telefono " + this.dispositivo.getNumeroTelefonico());
        }
        else
        {
            System.out.println(" mediante a el correo "+ this.getCorreo());
        }
    }

    @Override
    public void verInfo() 
    {
        System.out.println(toString());
    }

    @Override
    public String toString() 
    {
        String cel=null;
        
        if(this.dispositivo!=null)
        {   
             cel="Celular: " + this.dispositivo.getNumeroTelefonico();
        }
        else
        {
            cel="Celular: No tiene celular";
        }
        
        return "\nLider: " + this.getNombre() + " " + this.getApellido() + "\nProyecto: " + this.getNombreProyecto()  +"\nCorreo: " + this.getCorreo() + "\n"+ cel+ "\nNumero de Trabajador: " + this.getNumeroTrabajador() + "\nSueldo: $" + this.getSueldo();
        
    }
    
    public Lider parseLider(Vendedor empleado)
    {
        return new Lider("Proyecto sin definir",empleado.getNombre(),empleado.getApellido(),empleado.getCorreo(),empleado.getNumeroTrabajador(), empleado.getSueldo());
    }
    
    public Lider parseLider(VendedorAvanzado empleado)
    {
        if(empleado.getDispositivo()!=null)
        {
            return new Lider("Proyecto sin definir",empleado.getDispositivo(),empleado.getNombre(),empleado.getApellido(),empleado.getCorreo(),empleado.getNumeroTrabajador(), empleado.getSueldo());
        }
        else
        {
            return new Lider("Proyecto sin definir",empleado.getNombre(),empleado.getApellido(),empleado.getCorreo(),empleado.getNumeroTrabajador(), empleado.getSueldo());
        }
    }
    
    

}
