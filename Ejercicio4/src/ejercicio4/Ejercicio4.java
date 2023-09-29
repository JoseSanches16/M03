package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
   int valor1, valor2;
   int suma,resta,multi,division; 
   
        System.out.println("pon valor 1");
        valor1 = sc.nextInt();
        System.out.println("pon valor 2");
        valor2 = sc.nextInt();
        
        suma = valor1 + valor2;
        resta = valor1 - valor2;
        multi = valor1 * valor2;
        division=valor1 / valor2;
        
        System.out.println(" la suma de " + valor1 + "+"+ valor2 + " es "+ suma);
        System.out.println(" la resta de " + valor1 + "-"+ valor2 + " es "+ resta);
        System.out.println(" la multi " + valor1 + "*"+ valor2 + " es "+ multi );
        System.out.println(" la division " + valor1 + "/"+ valor2 + " es "+ division);
    }
    
}
    