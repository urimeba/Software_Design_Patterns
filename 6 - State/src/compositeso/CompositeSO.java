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
public class CompositeSO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("----------PATRON COMPOSITE---------------");
        Folder principal = new Folder("C://");

        Archivo archivoJPG = new Jpg(500,400,"playa",(float)3.5);
        principal.addElemento(archivoJPG);
        
        Folder carpetaUsuario = new Folder("Usuario");
        principal.addElemento(carpetaUsuario);
        
        Archivo archivoMP3 = new Mp3 ((float)3.5,"sonido-Banda",(float)5);
        carpetaUsuario.addElemento(archivoMP3);
        carpetaUsuario.addElemento(new Rutina("Baja las pelis",(float)8));
        
        principal.info();
        
        System.out.println();
        System.out.println();
        
        Jpg imagenConFondo = new Jpg(400,400,"imagen1",(float)5);
        System.out.println(imagenConFondo.toString());
        
        Png imagenSinFondo = new Png(400,400,"imagen2",(float)3.5);
        imagenSinFondo.setTransparencia(50);
        System.out.println(imagenSinFondo.toString());
        
        Jpg imagenConvertida = Jpg.parseJpg(imagenSinFondo);
        System.out.println(imagenConvertida.toString());
        
        Png imagenReconvertida = Png.parsePng(imagenSinFondo);
        System.out.println(imagenReconvertida.toString());
        
        imagenReconvertida.setTransparencia(70);
        System.out.println(imagenReconvertida.toString());
        
        //
        
        System.out.println("-------------PATRON STATE ---------------");
        
        System.out.println("Se crea una imagen JPG");
        Jpg imagen = new Jpg(1,1,"Imagen", 2);
            
        System.out.println("\nSe crea una carpeta");
        Folder carp = new Folder("Carpeta");
        
        System.out.println("\nSe crea una rutina");
        Rutina rut = new Rutina("rutina",2);
        
        
        System.out.println("\n-----Imagen (JPG)-----");
        System.out.println("\nAbrimos la imagen");
        imagen.abrir();
        
        System.out.println("\nTratamos de abrir la imagen nuevamente");
        imagen.abrir();
        
        System.out.println("\nTratamos de cambiar el nombre de la imagen");
        imagen.cambiarNombre("a");
        
        System.out.println("\nCerramos la imagen");
        imagen.cerrar();
        
        System.out.println("\nTratamos de cambiar el nombre de la imagen");
        imagen.cambiarNombre("a");
        
        System.out.println("\n-----CARPETA-----");
        System.out.println("\nAbrimos una carpeta");
        carp.abrir();
        
        System.out.println("\nTratamos de cambiar el nombre de la carpeta");
        carp.cambiarNombre("CopiadeCarpeta");
        
        System.out.println("\nCerramos la carpeta");
        carp.cerrar();
        
        System.out.println("\n-----RUTINA-----");
        
        System.out.println("\nAbrimos la rutina");
        rut.abrir();
        
        System.out.println("\nCerramos la rutina");
        rut.cerrar();
        
        System.out.println("\nAbrimos la rutina");
        rut.abrir();
        
        System.out.println("\nTratamos de cambiar el nombre de la rutina");
        rut.cambiarNombre("copiaRutWina");
        
        System.out.println("\nCerramos la rutina");
        rut.cerrar();
        
        System.out.println("\nTratamos de cambiar el nombre de la rutina");
        rut.cambiarNombre("copiaRutina");
        
        System.out.println("\nCerramos la rutina");
        rut.cerrar();
        
        
        
        
    }
    
}
