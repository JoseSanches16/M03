
package horastrabajadas;
import java.util.Scanner;
public class HorasTrabajadas {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

      /*   // Tarifas
        double tarifaNormal = 20.0; // Tarifa por horas normales
        double tarifaExtras = 35.0; // Tarifa por horas extras

        // Preguntar al usuario por las horas trabajadas
        System.out.print("Ingrese las horas trabajadas: ");
        double horasTrabajadas = sc.nextDouble();

        // Calcular el salario
        double salario = 0.0;

        // Preguntar si se han trabajado horas extras
        System.out.print(" Se han trabajado horas extras? (Si: 1 / No: 0): ");
        int horasExtrasOp = sc.nextInt();

        if (horasExtrasOp == 0) {
            // Si no se han trabajado horas extras, se aplican tarifas normales
            salario = horasTrabajadas * tarifaNormal;
        } else if (horasExtrasOp == 1) {
            // Si se han trabajado horas extras, preguntar por las horas extras
            System.out.print("Ingrese las horas extras trabajadas: ");
            double horasExtras = sc.nextDouble();

            // Calcular el salario considerando horas normales y extras
            salario = (horasTrabajadas * tarifaNormal) + (horasExtras * tarifaExtras);
        } else {
            System.out.println("Opción no válida.");
        }

        // Mostrar el salario
        System.out.println("El salario es: " + salario);

    } 
 } */
      
      int horas, h_extra; //Es enter perque no tractem amb mitjes hores
        int HORAS_NORMAL = 35; //es enter perque no te sentit que sigui hores partides
        double T_NORMAL = 20; //el fico double, perque et podrien pagar la hora a 10.5
        double PRECIOS_EXTRA = 1.5;
        double salario, salario_extra, salario_normal; //
      //  Scanner sc = new Scanner(System.in);
        System.out.print("Quantes hores has treballat?...");
        horas = sc.nextInt();
        
        if (horas>HORAS_NORMAL)
        { //tinc que pagar hores extres
            h_extra = horas - HORAS_NORMAL;
            //System.out.println("horas extra" + h_extra);
            salario_extra = h_extra*T_NORMAL*PRECIOS_EXTRA;
            salario_normal = HORAS_NORMAL*T_NORMAL;
            salario = salario_extra + salario_normal;
            System.out.println("Tu salario es... " + salario);
        }
        else
        { //tarifa normal
            //no definicio de variables
            salario = horas * T_NORMAL;
            System.out.println("Tu salario es... " + salario);
        }
        
        
        
        
    }
    
}
