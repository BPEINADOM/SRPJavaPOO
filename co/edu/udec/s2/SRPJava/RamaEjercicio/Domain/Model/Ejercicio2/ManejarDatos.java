package Ejercicio2;

public class ManejarDatos {

    public void mostrarDatos(Producto producto) {
        System.out.println("Nombre: " + producto.getNombre() + ", Codigo: " + producto.getCodigo());
        System.out.println("Precio: " + producto.getPrecio());
    }
}
