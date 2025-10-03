import java.util.Scanner;
import utilidades.ProcesadorTexto;
import utilidades.Usuario;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.print("Introduce tu correo electronico: ");
        String email = sc.nextLine();

        if (ProcesadorTexto.esEmailValido(email)) {
            Usuario usuario = new Usuario(nombre, edad, email);
            usuario.mostrarInformacion();
        } else {
            System.out.println("No se puede crear por que el usuario no es valido");

        }
        sc.close();
    }
}
