import Ejercicio1.GeneracionReportes;
import Ejercicio1.GuardarBaseDeDatos;
import Ejercicio1.Libro;
import Ejercicio1.ManejarInformacion;

public class LibroSRP {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");
        
        Libro libro = new Libro("Biografia", "Juan Manuel", 200);

        // Manejar la informacion
        ManejarInformacion manejarInformacion = new ManejarInformacion();
        manejarInformacion.mostrarInformacion(libro);

        System.out.println("*********************************************");

        // Generar reporte
        GeneracionReportes generacionReportes = new GeneracionReportes();
        generacionReportes.generarReportes(libro);


        // Guardar en la base de datos
        GuardarBaseDeDatos guardarBaseDeDatos = new GuardarBaseDeDatos();
        guardarBaseDeDatos.guardarBaseDeDatos();

        System.out.println("*********************************************");

        
    }
}
