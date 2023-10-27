package ejercicios.de.reforzamiento;
import java.util.Scanner;
public class EjerciciosDeReforzamiento {
 public static void main(String[] args) {
    
   Scanner scanner = new Scanner(System.in);
        String nombre;

        // Ejercicio 1: Leer un nombre e indicar si es positivo o negativo.
        // El proceso se repetirá hasta que se introduzca un 0.
        do {
            System.out.print("Introduce un nombre (0 para salir): ");
            nombre = scanner.nextLine();

            if (!nombre.equals("0")) {
                if (nombre.length() > 0) {
                    System.out.println("Nombre positivo.");
                } else {
                    System.out.println("Nombre negativo.");
                }
            }
        } while (!nombre.equals("0"));

        // Ejercicio 2: Pedir números hasta que se introduzca el 0 y mostrar cuántos números se han introducido.
        int contador = 0;
        int numero;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                contador++;
            }
        } while (numero != 0);

        System.out.println("Se han introducido " + contador + " números.");

        // Ejercicio 3: Pedir números hasta que se introduzca un número negativo y calcular la media de los números introducidos.
        int suma = 0;
        int contadorMedia = 0;

        do {
            System.out.print("Introduce un número (número negativo para salir): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                suma += numero;
                contadorMedia++;
            }
        } while (numero >= 0);

        if (contadorMedia > 0) {
            double media = (double) suma / contadorMedia;
            System.out.println("La media de los números introducidos es: " + media);
        } else {
            System.out.println("No se introdujeron números válidos.");
        }

        // Ejercicio 4: Pedir un PIN hasta 3 intentos o acertar el PIN.
        final int PIN_CORRECTO = 1234;
        int intentos = 0;

        while (intentos < 3) {
            System.out.print("Introduce el PIN: ");
            int pinIngresado = scanner.nextInt();

            if (pinIngresado == PIN_CORRECTO) {
                System.out.println("¡PIN correcto! Acceso permitido.");
                break;
            } else {
                System.out.println("PIN incorrecto. Intento " + (intentos + 1) + " de 3.");
                intentos++;
            }
        }

        if (intentos == 3) {
            System.out.println("Has superado el número máximo de intentos. Acceso bloqueado.");
        }

        // Ejercicio 5: Pedir la edad y el año en que nos encontramos y mostrar la edad del usuario en cada año hasta su nacimiento.
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingresa el año actual: ");
        int añoActual = scanner.nextInt();

        int añoNacimiento = añoActual - edad;
        for (int año = añoNacimiento; año <= añoActual; año++) {
            System.out.println("Año: " + año + ", Edad: " + (añoActual - año));
        }

        // Ejercicio 6: Pedir al usuario una letra y el número de veces que debe mostrarse.
        // Después se deberá mostrar la letra tantas veces como se haya indicado.
        System.out.print("Ingresa una letra: ");
        char letra = scanner.next().charAt(0);

        System.out.print("Ingresa el número de veces que deseas mostrar la letra: ");
        int numeroVeces = scanner.nextInt();

        for (int i = 0; i < numeroVeces; i++) {
            System.out.print(letra);
        }

        System.out.println(); // Salto de línea al final

        // Ejercicio 7: Pedir al usuario un número del 1 al 10 y mostrar la tabla de multiplicar de ese número.
        System.out.print("Ingresa un número del 1 al 10: ");
        int numeroTabla = scanner.nextInt();

        if (numeroTabla >= 1 && numeroTabla <= 10) {
            System.out.println("Tabla de multiplicar del " + numeroTabla + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numeroTabla * i;
                System.out.println(numeroTabla + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("Número fuera de rango.");
        }

        // Ejercicio 8: Modificar el programa anterior para que muestre las tablas de multiplicar del 1 al 5.
        for (int numero = 1; numero <= 5; numero++) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
            System.out.println(); // Salto de línea entre tablas
        }

        // Ejercicio 9: Mostrar el código ASCII de los caracteres de la 'A' a la 'Z'.
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            int codigoAscii = (int) letra;
            System.out.println(letra + " - Código ASCII: " + codigoAscii);
        }

        // Ejercicio 10: Crear un menú para la nueva versión de FIFA.
        String opcionFIFA;

        do {
            System.out.println("**** Bienvenido a FIFA ****");
            System.out.println("* A - Jugar                  *");
            System.out.println("* B - Entrenar              *");
            System.out.println("* C - Jugar Partido Online *");
            System.out.println("* D - Salir                 *");
            System.out.print("Escoge Opción: ");
            opcionFIFA = scanner.next().toUpperCase();

            switch (opcionFIFA) {
                case "A":
                    System.out.println("Estás jugando.");
                    break;
                case "B":
                    System.out.println("Estás entrenando.");
                    break;
                case "C":
                    System.out.println("Estás jugando un partido en línea.");
                    break;
                case "D":
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!opcionFIFA.equals("D"));
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 }
    
}
