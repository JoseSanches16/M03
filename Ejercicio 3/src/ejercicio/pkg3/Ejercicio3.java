package ejercicio.pkg3;
import java.util.Scanner;
public class Ejercicio3 {
    
    

    public static void main(String[] args) {
        // Declarar variables para los lados y el área
        double lado1, lado2, area;
        
        // Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        //  el primer lado del rectángulo
        System.out.print("Ingrese el valor del primer lado: ");
        lado1 = scanner.nextDouble();
        
        //  el segundo lado del rectángulo
        System.out.print("Ingrese el valor del segundo lado: ");
        lado2 = scanner.nextDouble();
        
        // Calcular el área del rectángulo
        area = lado1 * lado2;
        
        // Mostrar el área del rectángulo
        System.out.println("El área del rectángulo es: " + area);
   
    }
    
}
