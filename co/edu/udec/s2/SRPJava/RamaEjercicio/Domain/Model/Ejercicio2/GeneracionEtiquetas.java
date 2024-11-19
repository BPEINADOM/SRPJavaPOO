package Ejercicio2;

public class GeneracionEtiquetas {

    public void generarEtiqueta(Producto producto) {
        System.out.println("Etiqueta:");
        System.out.println(producto.getNombre());
        System.out.println("- Codigo: " + producto.getCodigo());
        System.out.println("- Precio: $" + producto.getPrecio());
    }
    
}
