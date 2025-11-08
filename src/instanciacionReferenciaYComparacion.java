import utilidades.Cancion;
import utilidades.Pelicula;

public class instanciacionReferenciaYComparacion {
        public static void main(String[] args) {

                // ================================
                // EJERCICIO 1: Crear objetos con new
                // ================================
                // 1. Crea un objeto Cancion (c1) usando el constructor por defecto.
                // 2. Crea otro objeto Cancion (c2) usando el constructor parametrizado,
                // por ejemplo: "Clocks", "Coldplay".
                // 3. Muestra por consola ambas canciones con System.out.println().
                // 4. Observa qué valores se imprimen en cada caso.

                // Tu código aquí ↓

                System.out.println("Ejercicio 1:");
                Cancion c1 = new Cancion();
                Cancion c2 = new Cancion("Clocks", "Coldplay");
                System.out.println(c1);
                System.out.println(c2);

                // ================================
                // EJERCICIO 2: Comparación con ==
                // ================================
                // 1. Crea dos objetos Cancion (c3 y c4) distintos, con los mismos valores.
                // 2. Imprime el resultado de (c3 == c4).

                // Tu código aquí ↓

                System.out.println("Ejercicio 2:");
                Cancion c3 = new Cancion("On Earth", "The Sundays");
                Cancion c4 = new Cancion("On Earth", "The Sundays");
                System.out.println(c3 == c4);

                // ================================
                // EJERCICIO 3: Comparación con equals()
                // ================================
                // 1. Usando los mismos objetos c3 y c4 del ejercicio anterior,
                // imprime el resultado de (c3.equals(c4)).

                // Tu código aquí ↓
                System.out.println("Ejercicio 3:");
                System.out.println(c3.equals(c4));

                // ================================
                // EJERCICIO 4: Comparación en Pelicula
                // ================================
                // 1. Crea dos objetos Pelicula (p1 y p2) con el mismo título y año.
                // 2. Imprime ambas películas por consola.
                // 3. Imprime (p1 == p2).
                // 4. Imprime (p1.equals(p2)).

                // Tu código aquí ↓
                System.out.println("Ejercicio 4:");
                Pelicula p1 = new Pelicula("Rango", 2011);
                Pelicula p2 = new Pelicula("Rango", 2011);
                System.out.println(p1);
                System.out.println(p2);
                System.out.println(p1 == p2);
                System.out.println(p1.equals(p2));

                // ================================
                // EJERCICIO 5: Referencias
                // ================================
                // 1. Crea un objeto Cancion (c5) con el constructor parametrizado.
                // 2. Declara otra variable Cancion (c6) y haz que apunte al mismo objeto que
                // c5.
                // 3. Imprime (c5 == c6).
                // 4. Cambia el título de la canción desde c6.
                // 5. Imprime c5 de nuevo.

                // Tu código aquí ↓
                Cancion c5 = new Cancion("Goodbye", "The Sundays");
                Cancion c6 = c5;
                System.out.println(c6 == c5);
                c6.setTitutlo("On earth");
                System.out.println(c5);
                // ================================
                // EJERCICIO 6: null
                // ================================
                // 1. Declara una variable Pelicula (p3) y asígnale null.
                // 2. Imprime p3 por consola.
                // 3. Ahora intenta acceder a un método de p3 (ejemplo p3.getTitulo()).
                // Comenta la línea después de probar, porque lanzará un error.

                // Tu código aquí ↓
                Pelicula p3 = null; // No hay película, la variable está vacía.
                System.out.println(p3); // Imprime "null", no da error.
                p3.getTitulo(); // intenta usar algo que no existe osea da error.

        }
}
// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿Qué diferencia hay entre el constructor por defecto y el
// parametrizado?
// Constructor por defecto: crea un objeto vacío (sin valores iniciales).
// Constructor parametrizado: crea un objeto con los valores que le das desde el
// principio.

// Ejercicio 2: ¿Por qué da false al comparar con == dos objetos con los mismos
// datos?
// Aunque los objetos tengan los mismos datos, apuntan a lugares distintos en
// memoria, por eso da false, aunque tengan el mismo titulo y artista puede
// haber muchos titulos o muchos artistas similares .

// Ejercicio 3: ¿Qué diferencia hay entre == y equals()? ¿Por qué ahora sí
// devuelve true?
// == mira si es el mismo objeto, equals() mira si los datos son iguales.
// Imprime true porque los datos de c3 y c4 son iguales.

// Ejercicio 4: ¿Por qué en Pelicula equals no funciona como en Cancion?
// Porque la clase Pelicula no tiene sobrescrito equals().

// Ejercicio 5: ¿Qué ocurre cuando modificas el objeto a través de c6? ¿Qué
// demuestra?
// Lo que ocurre es que al cambiar el objeto por c6 también cambia c5.

// Ejercicio 6: ¿Qué error aparece al acceder a un método de p3 siendo null?
// Creo que da NullPointerException ( No estoy muy seguro).
// Significa que la variable no apunta a ningún objeto, está vacía..