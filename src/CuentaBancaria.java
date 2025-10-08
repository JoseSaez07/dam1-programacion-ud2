import utilidades.CuentaBancaria;
public class Main {
public static void main(String[] args) {
CuentaBancaria cuenta = new CuentaBancariaCuentaBancaria();  
       // ================================
      // EJERCICIO 1: Uso de atributos
     // ================================
    // 1. Intenta acceder directamente al atributo saldo:
   //    System.out.println(cuenta.saldo);
  // 2. Observa el error de compilación.
System.out.println(cuenta.saldo);

         // ================================
        // EJERCICIO 2: Métodos públicos
       // ================================
      // 1. Ingresa 100€ usando depositar().
     // 2. Retira 30€ usando retirar().
     // 3. Imprime el saldo con getSaldo().
 class CuentaBancaria {
    private double saldo;

    public void depositar(double cantidad) {  
        saldo += cantidad;
    }

    public void retirar(double cantidad) {  
        if (saldo >= cantidad) saldo -= cantidad;
        else System.out.println("Saldo insuficiente");
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(100);          
        cuenta.retirar(30);             
        System.out.println(cuenta.getSaldo());
    }
}
    // ================================
   // EJERCICIO 3: Métodos privados
  // ================================
 // 1. Intenta llamar al método registrarOperacion("Hackeo", 9999).
// 2. Observa el error de compilación. 
cuenta registrarOperacion("Hackeo", 9999);
}
}
// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿por qué no puedo acceder al saldo directamente? 
// Respuesta: Porque es private, solo se puede acceder mediante métodos públicos.

// Ejercicio 2: ¿por qué sí puedo usar los métodos depositar(), retirar() y getSaldo()? 
// Respuesta: Porque son públicos y permiten modificar o consultar el saldo de forma segura.

// Ejercicio 3: ¿qué significa el error al intentar llamar a registrarOperacion()? 
// Respuesta: Que es un método private y no se puede usar desde fuera de la clase.

// Ejercicio 4: 
// - ¿Qué ventajas tiene que saldo sea private?  Protege los datos y evita errores.
// - ¿Qué pasaría si saldo fuera public?  Se podría modificar sin control, causando fallos.
// - ¿Por qué registrarOperacion es private en lugar de public?  Porque es interno y no debe usarse desde fuera.