import java.util.Scanner;

import Ejercicio3.Autenticacion;
import Ejercicio3.Usuario;

public class UsuarioSRP {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        System.out.println("Ingrese nombre de usuario:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese email:");
        String email = scanner.nextLine();

        System.out.println("Ingrese contraseña");
        String contraseña = scanner.nextLine();

        Usuario usuario = new Usuario(nombre, email, contraseña);

        // Metodo que arroja un mensaje dependiendo del resultado de la auntenticacion
        if (Autenticacion.autenticar(usuario, email, contraseña)) {
            System.out.println("Ingreso de sesion exitoso!");
        } else {
            System.out.println("Datos ingresados no validos. Verifique si estan correctamente.");
        }

        System.out.println("*********************************************");

        scanner.close();
    }
}
