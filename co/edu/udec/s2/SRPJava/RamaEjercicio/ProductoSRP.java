import Ejercicio2.CalculoPrecios;
import Ejercicio2.GeneracionEtiquetas;
import Ejercicio2.ManejarDatos;
import Ejercicio2.Producto;

public class ProductoSRP {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        Producto producto = new Producto("Laptop ASUS", 25567834, 2400000.0);

        // Manejar los datos del producto
        ManejarDatos manejarDatos = new ManejarDatos();
        manejarDatos.mostrarDatos(producto);

        System.out.println("*********************************************");

        // Generar etiqueta del producto
        GeneracionEtiquetas generacionEtiquetas = new GeneracionEtiquetas();
        generacionEtiquetas.generarEtiqueta(producto);

        // Calcular el precio del producto
        CalculoPrecios calculoPrecios = new CalculoPrecios();
        double calculoPrecio = calculoPrecios.calcularPrecios(producto);
        System.out.println("- Precio con IVA: $" + calculoPrecio);

        System.out.println("*********************************************");

    }
}
