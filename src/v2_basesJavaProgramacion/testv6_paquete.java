package v2_basesJavaProgramacion;

// Importar módulos en java
import java.math.BigDecimal;
// Todos los elementos de un módulo
import java.math.*;

public class testv6_paquete {
    // Un módulo se fragmenta en paquetes
    // Paquete/package => forma de encapsular nuestra programación
    // Package va a agrupar todas las clases
    // Clase => agrupar tareas comunes

    // Punto de entrada para poder ejecutar la clase [Método]
    // Método público, que no devuelve nada (void), main (cualquier elemento es lo primero que se ejecuta)
    // Argumentos para que pueda capturarlos y ejecutarlos correctamente
    public static void main (String[] args) {
        // Indicaciones del método
        // System.out.println("Hola Selenium!");

        // Manejo de excepciones o errores
        try {
            int[] numeros = {1,2,3};
            System.out.println(numeros[22]);

        } catch(Exception error) {
            // Capturamos el error, teniendo un control y asegurando que la app no se bloquea
            System.out.println("Algo ha salido mal");
            throw error;
        }
    }


}
