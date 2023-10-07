package Aumento.De.Sueldo;
import java.util.Scanner;
public class AumentoDeSueldo {
 public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     //  ingrese su sueldo actual
        System.out.print("Ingrese su sueldo actual: ");
        double sueldoActual = sc.nextDouble();

        // sueldo y sus respectivos incrementos
        double incremento = 0.0;

        if (sueldoActual < 18000) {
            incremento = 0.12;
        } else if (sueldoActual >= 18000 && sueldoActual < 30000) {
            incremento = 0.10;
        } else if (sueldoActual >= 30000 && sueldoActual < 45000) {
            incremento = 0.08;
        } else {
            incremento = 0.06;
        }

        // Calculamos el aumento de sueldo a fin de año
        double aumentoSueldo = sueldoActual * incremento;

        // Calculamos el sueldo del año siguiente
        double sueldoSiguiente = sueldoActual + aumentoSueldo;

        // Mostrar el resultado al usuario
        System.out.println("Su sueldo actual esta en la categoria correspondiente.");
        System.out.println("El incremento de sueldo a fin de ano sera del " + (incremento * 100) + "%.");
        System.out.println("Su aumento de sueldo a fin de ano sera de " + aumentoSueldo);
        System.out.println("Su sueldo para el proximo ano sera de " + sueldoSiguiente);
    }
}
    
     
    }
    
}
