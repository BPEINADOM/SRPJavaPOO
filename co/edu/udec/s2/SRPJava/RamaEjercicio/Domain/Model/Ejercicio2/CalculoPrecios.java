package Ejercicio2;

public class CalculoPrecios {

    public double calcularPrecios(Producto producto) {
        return producto.getPrecio() + (producto.getPrecio() * 0.19); // Calculando el precio con el IVA de 19%
    }
}
