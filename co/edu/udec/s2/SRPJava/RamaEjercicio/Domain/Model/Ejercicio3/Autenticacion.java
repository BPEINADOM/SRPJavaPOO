package Ejercicio3;

public class Autenticacion {
    public static boolean autenticar(Usuario usuario, String email, String contraseña) {
        return usuario.getNombre().equals("JohnDev") && email.equals("JohnHernandez99@hotmail.com") && contraseña.equals("J2345");
    }
}
