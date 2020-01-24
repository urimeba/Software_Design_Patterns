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
public class VendedorAvanzado extends Vendedor
{
    private Celular dispositivo;

    public VendedorAvanzado(Celular dispositivo, String nombre, String apellido, String correo, int numeroTrabajador, float sueldo) 
    {
        super(nombre, apellido, correo, numeroTrabajador, sueldo);
        this.dispositivo = dispositivo;
    }
    
    public VendedorAvanzado(String nombre, String apellido, String correo, int numeroTrabajador, float sueldo) 
    {
        super(nombre, apellido, correo, numeroTrabajador, sueldo);
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
    public float getSueldo() 
    {
        return super.getSueldo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void verInfo() 
    {
        System.out.println(toString());
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
    public String toString() 
    {
        String cel=null;
        if(this.dispositivo!=null)
        {   
             cel="Celular: " + this.dispositivo.getNumeroTelefonico();
        }
        else
        {
            cel= "Celular: No tiene celular";
        }
        
        return "\nVendedor Avanzado: " + this.getNombre() + " " + this.getApellido()+"\nCorreo: " + this.getCorreo() +"\n"+cel + "\nNumero de Trabajador: " + this.getNumeroTrabajador() + "\nSueldo: $" + this.getSueldo()+ "\nNumero de Ventas: " + this.getNumeroVentas();
    }
    
    
    public VendedorAvanzado parseVendedor(Lider empleado)
    {
        VendedorAvanzado a;
        
        if(empleado.getDispositivo()!=null)
        {
            a = new VendedorAvanzado(empleado.getDispositivo(),empleado.getNombre(),empleado.getApellido(),empleado.getCorreo(),empleado.getNumeroTrabajador(),empleado.getSueldo() );
        }
        else
        {
            a = new VendedorAvanzado(empleado.getNombre(),empleado.getApellido(),empleado.getCorreo(),empleado.getNumeroTrabajador(),empleado.getSueldo() );
        }
        return a;
    }
    
    
    
    
    
}
