import utilidades.Cancion;
import utilidades.Pelicula;

public class instanciacionReferenciaYComparacion {
public static void main(String[] args) {
// ================================== //
// EJERCICIO 1: Crear objetos con new //
// ================================== //
Cancion c1 = new Cancion();

public Cancion() {
private String titulo;
private String artista;
this.titulo ="Con título";
this.titulo ="Sin título"; 

// =============================== //
// EJERCICIO 2: Comparación con == //
// =============================== //
 Cancion c3 = new Cancion("Clocks", "Coldplay");
 Cancion c4 = new Cancion("Clocks", "Coldplay");
System.out.println(c3 == c4);

// ================================
// EJERCICIO 3: Comparación con equals()
// ================================
// 1. Usando los mismos objetos c3 y c4 del ejercicio anterior,
//  imprime el resultado de (c3.equals(c4)).
System.out.println((c3.equals(c4)));

   // ================================
  // EJERCICIO 4: Comparación en Pelicula
 // ================================
// 1. Crea dos objetos Pelicula (p1 y p2) con el mismo título y año.
// 2. Imprime ambas películas por consola.

System.out.println(p1);
System.out.println(p2);
Pelicula p1 = new Cancion("kill bill", "2003");
Pelicula p2 = new Cancion("Kill bill", "2003");

  
     // ================================
    // EJERCICIO 5: Referencias
   // ================================
  // 1. Crea un objeto Cancion (c5) con el constructor parametrizado.
 // 2. Declara otra variable Cancion (c6) y haz que apunte al mismo objeto que c5.
// 3. Imprime (c5 == c6).
// 4. Cambia el título de la canción desde c6.
// 5. Imprime c5 de nuevo.

Cancion c5 = new Cancion("Viva la Vida", "Coldplay");
Cancion c6 = c5;
System.out.println(c5 == c6);
System.out.println(c5);

        // ================================
        // EJERCICIO 6: null
        // ================================
        // 1. Declara una variable Pelicula (p3) y asígnale null.
        // 2. Imprime p3 por consola.
        // 3. Ahora intenta acceder a un método de p3 (ejemplo p3.getTitulo()).
        //    Comenta la línea después de probar, porque lanzará un error.
Pelicula c5 = new Pelicula("Old Henry", "2001");
Pelicula p3 = null;
System.out.println(p3);
}

}
}
// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================

// Ejercicio 1: ¿Qué diferencia hay entre el constructor por defecto y el parametrizado?
// Respuesta:  El por defecto no pide datos. El parametrizado si puede , como título y autor.

// Ejercicio 2: ¿Por qué da false al comparar con == dos objetos con los mismos datos?
// Respuesta:  Porque == compara si son el mismo objeto, no si tienen los mismos datos.

// Ejercicio 3: ¿Qué diferencia hay entre == y equals()? ¿Por qué ahora sí devuelve true?
// Respuesta:  == compara referencias. equals() compara contenido.  Si los datos son iguales, equals da true.

// Ejercicio 4: ¿Por qué en Pelicula equals no funciona como en Cancion?
// Respuesta:  Porque Pelicula no tiene el método equals personalizado. 

// Ejercicio 5: ¿Qué ocurre cuando modificas el objeto a través de c6? ¿Qué demuestra?
// Respuesta:  Cambia también en c5.  Demuestra que c5 y c6 apuntan al mismo objeto.

// Ejercicio 6: ¿Qué error aparece al acceder a un método de p3 siendo null?
// ¿Qué significa realmente que una variable valga null?
// Respuesta:  Da NullPointerException.  
//  null significa que no hay ningún objeto guardado en esa variable.
