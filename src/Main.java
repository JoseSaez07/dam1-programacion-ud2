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

    

}
}
// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿por qué no puedo acceder al saldo directamente? 
// Respuesta: Tiene por ejmplo que no puedes acceder directamente, solo acceso a través  de métodos públicos de la clase. 

// Ejercicio 2: ¿por qué sí puedo usar los métodos depositar(), retirar() y getSaldo()?
// Respuesta: 

// Ejercicio 3: ¿qué significa el error al intentar llamar a registrarOperacion()?
// Respuesta: ....................................................

// Ejercicio 4: 
// - ¿Qué ventajas tiene que saldo sea private?  QUE NO SE 
// - ¿Qué pasaría si saldo fuera public?
// - ¿Por qué registrarOperacion es private en lugar de public?
// Respuesta: ....................................................