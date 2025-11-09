import utilidades.CuentaBancaria;

public class CuentaBancaria222 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        // ================================
        // EJERCICIO 1: Uso de atributos
        // ================================
        // 1. Intenta acceder directamente al atributo saldo:
        // System.out.println(cuenta.saldo);
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
        // System.out.println(cuenta.saldo); esto da error por que saldo es privado

        // ================================
        // EJERCICIO 2: Métodos públicos
        // ================================
        // 1. Ingresa 100€ usando depositar().
        // 2. Retira 30€ usando retirar().
        // 3. Imprime el saldo con getSaldo().

        // Tu código aquí ↓
        cuenta.depositar(100);
        cuenta.retirar(30);
        System.out.println("Saldo actual:" + cuenta.getSaldo() + "$");
        // Por que no me deja llamarlo si es un public

        // ================================
        // EJERCICIO 3: Métodos privados
        // ================================
        // 1. Intenta llamar al método registrarOperacion("Hackeo", 9999).
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
        // cuenta.registrarOperacion("Hackeo", 9999); // Esto da error porque es private

        // ================================
        // EJERCICIO 4: Libre
        // ================================
        // Puedes hacer pruebas adicionales con los métodos disponibles
        // para asegurarte de que comprendes la diferencia entre public y private.
    }
}

// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿por qué no puedo acceder al saldo directamente?
// Respuesta: ....................................................
// Porque saldo es private y solo se puede usar dentro de la clase.
// Ejercicio 2: ¿por qué sí puedo usar los métodos depositar(), retirar() y
// getSaldo()?
// Respuesta: Porque son public y se pueden usar desde otras clases de forma
// segura.

// Ejercicio 3: ¿qué significa el error al intentar llamar a
// registrarOperacion()?
// Respuesta: Que el método es private y solo puede usarse dentro de la clase.

// Ejercicio 4:
// - Ventajas de que saldo sea private: Protege los datos de cambios indebidos.
// - Qué pasaría si fuera public: Cualquiera podría modificarlo y causar
// errores.
// - Por qué registrarOperacion es private: Es interno, no debe usarse desde
// fuera.