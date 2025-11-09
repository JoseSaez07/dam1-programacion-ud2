public class GestorTareas {

    public static void main(String[] args) {

        // ================================
        // EJERCICIO 1: Bienvenida
        // ================================
        // Crea un método llamado que muestre un mensaje de bienvenida al programa.
        // No necesita devolver nada, solo imprimir por consola.
        bienvenida("Jose");
        bienvenida("Ana");
        // Tu código aquí ↓

        // ================================
        // EJERCICIO 2: Duración total
        // ================================
        // Crea un método que reciba la duración (en minutos) de dos tareas
        // y devuelva el total de minutos.
        // Llama al método con 45 y 30 y muestra el resultado en consola.
        // Tu código aquí ↓
        int resultado = duracion(45, 30);
        System.out.println("El total de minutos es " + resultado);

        // ================================
        // EJERCICIO 3: Conversión de tiempo
        // ================================
        // Crea un método que reciba una cantidad de minutos
        // y muestre en pantalla cuántas horas y minutos son.
        // Ejemplo: 150 minutos → "Son 2 horas y 30 minutos".
        // No tiene que devolver nada.
        horas(150);

        // Tu código aquí ↓

        // ================================
        // EJERCICIO 4: Recordatorios
        // ================================
        // Crea un método que reciba el nombre de una tarea y una prioridad (1–3)
        // y muestre un mensaje como:
        // "📌 [Prioridad 2] Revisar correo".
        // Solo muestra el mensaje, no devuelve nada.
        prioridad("Mirar el correo", 1);

        // Tu código aquí ↓

        // ================================
        // EJERCICIO 5: Estado de tareas
        // ================================
        // Crea un método que reciba un valor booleano que indique si la tarea está
        // completada.
        // Debe devolver un texto: "✅ Completada" o "⏳ Pendiente".
        // Muestra el resultado de llamar al método con ambos casos.

        // Tu código aquí ↓
        System.out.println(valor(true));
        System.out.println(valor(false));

        // ================================
        // EJERCICIO 6: Productividad
        // ================================
        // Crea un método que reciba el número total de tareas y las completadas
        // y devuelva el porcentaje de avance (por ejemplo, 70.0 si 7/10).
        // Muestra el resultado en consola.
        porcentaje(10, 7);

        // Tu código aquí ↓

        // ================================
        // EJERCICIO 7: Sobrecarga
        // ================================
        // Crea dos métodos con el mismo nombre:
        // - uno sin parámetros, que muestre un mensaje genérico (ejemplo: "Hola crack";
        // - otro con parámetros (nombre de usuario, número de tareas completadas) "Hola
        // {usuario} completaste {numero} de tareas"
        // que muestre un resumen personalizado.
        // Llama a ambos desde main.

        // Tu código aquí ↓
        System.out.println(saludo());
        System.out.println(saludo("Jose", 1));

        // ================================
        // EJERCICIO 8: Bonus - Planificación
        // ================================
        // Crea un método que reciba el nombre de una tarea y su duración en minutos,
        // y devuelva un texto con la planificación:
        // "La tarea [nombre] durará aproximadamente X horas y Y minutos."
        // Muestra el texto en pantalla.

        // Tu código aquí ↓

    }

    // Aquí debéis crear los métodos fuera del main ↓↓↓
    // ================================
    // EJERCICIO 1: Bienvenida
    // ================================
    public static void bienvenida(String nombre) {
        System.out.println("Ejercicio 1 ");
        System.out.println("Bienvenido " + nombre);
    }

    // ================================
    // EJERCICIO 2: Duración total
    // ================================
    public static int duracion(int a, int b) {
        System.out.println("Ejercicio 2");
        return (a + b);
    }

    // ================================
    // EJERCICIO 3: Conversión de tiempo
    // ================================
    public static void horas(int minutos) {
        System.out.println("Ejercicio 3");
        int horas = (minutos / 60);
        int minutosRestantes = (minutos % 60);
        System.out.println("Son " + horas + " horas y " + minutosRestantes + " minutos.");
    }

    // ================================
    // EJERCICIO 4: Recordatorios
    // ================================-

    public static void prioridad(String tarea, int prioridad) {
        System.out.println("Ejercicio 4");
        System.out.println("📌 [Prioridad " + prioridad + "] " + tarea);
    }

    // ================================
    // EJERCICIO 5: Estado de tareas
    // ================================
    // Crea un método que reciba un valor booleano que indique si la tarea está
    // completada.
    // Debe devolver un texto: "✅ Completada" o "⏳ Pendiente".
    // Muestra el resultado de llamar al método con ambos casos.
    public static String valor(boolean completada) {
        System.out.println("Ejercicio 5");
        if (completada) {
            return "✅ Completada";
        } else {
            return "⏳ Pendiente";

        }
    }

    // ================================
    // EJERCICIO 6: Productividad
    // ================================
    public static void porcentaje(int tareas, int completada) {
        System.out.println("Ejercicio 6");
        double porcentaje = ((double) completada / tareas) * 100;
        System.out.println("Has completado el " + porcentaje + "% de tus tareas.");
    }

    // ================================
    // EJERCICIO 7: Sobrecarga
    // ================================
    public static String saludo() {
        return "Hola crack";
    }

    public static String saludo(String nombre, int numero) {
        return "Hola " + nombre + ", te quedan " + numero + " tareas pendientes.";
    }

}
