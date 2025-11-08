import utilidades.Cancion;
import utilidades.DemoMetodos;

public class TrabajandoConMetodos {
    public static void main(String[] args) {
        DemoMetodos method = new DemoMetodos();

        // ================================
        // EJERCICIO 1: Métodos void
        // ================================
        // 1. Llama al método saludar() de la clase DemoMetodos.
        // Tu código aquí ↓
        System.out.println("Ejercicio 1");
        method.saludar();

        // ================================
        // EJERCICIO 2: Métodos con retorno
        // ================================
        // 1. Llama al método sumar(5, 3).
        // 2. Guarda el resultado en una variable e imprímelo.
        // 3. Llama al método presentar("Lucía") e imprime el resultado.
        // Tu código aquí ↓
        System.out.println("Ejercicio 2");
        method.sumar(5, 3);
        int resultado = method.sumar(5, 3);
        System.out.println(resultado);
        System.out.println(method.presentar("Lucía"));

        // ================================
        // EJERCICIO 3: Paso por valor (primitivos)
        // ================================
        // 1. Declara una variable int n = 10.
        // 2. Llama a method.incrementar(n).
        // 3. Imprime n después de llamar al método.
        // Tu código aquí ↓
        System.out.println("Ejercicio 3");
        int n = 10;
        method.incrementar(n);
        System.out.println(n);
        // ================================
        // EJERCICIO 4: Paso por referencia (objetos)
        // ================================
        // 1. Crea un objeto Cancion con título "Original" - Usa el constructor
        // parametrizado
        // que recibe 2 argumentos: título y artista.
        // 2. Llama a method.cambiarTitulo(cancion).
        // 3. Imprime la canción después.
        // Tu código aquí ↓
        System.out.println("Ejercicio 4");
        Cancion c1 = new Cancion("Original", "Jose");
        method.cambiarTitulo(c1);
        System.out.println(c1);

    }
}

// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿Qué ocurre al llamar a un método void como saludar()?
// Respuesta:El metodo se ejecuta, pero como es void no devuelve nada. Luego las
// acciones que tiene se ejecutan.

// Ejercicio 2: ¿Qué diferencia hay entre un método void y uno con retorno?
// Respuesta:Un método void no devuelve ningún valor, solo ejecuta acciones,
// mientras que un método con retorno devuelve un valor que puede ser usado o
// asignado a una variable.

// Ejercicio 3: ¿Ha cambiado la variable n fuera del método incrementar()?
// ¿Por qué?
// Respuesta: No, la variable n sigue igual porque al pasarla al método se envía
// una copia, no la variable original.

// Ejercicio 4: ¿Qué ha ocurrido con el título de la Cancion al usar
// cambiarTitulo()?
// ¿Por qué es diferente al caso del int?
// Respuesta: El título cambió porque los objetos se pasan por referencia, a
// diferencia del int que se pasa por valor.