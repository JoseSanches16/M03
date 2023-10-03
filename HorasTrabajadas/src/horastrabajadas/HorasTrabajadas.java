
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
      
int horas , h_extra; 
int  HORAS_NORMAL= 35;
 double T_NORMAL = 20;
 double PRECIOS_EXTRA = 1.5;
 double salario_normal , salario_extra , salario_extra ;
 scanner sc = new Scanner(System.in);
 
 
        System.out.println("cuantas horas has trabjado?");
         horas = sc.next();
         
         
         if (horas>35)
         {//tenog que pagar horas eztras}
 
         h_extra = horas - HORAS_NORMAL;
         
                 salario_extra =h_extra*T_NORMAL*PRECIOS_EXTRA;
                 salario_normal = HORAS_NORMAL*T_NORMAL;
            }
         
         
             else { /*tarifa normal  */
                   salario = horas * T_Normal ;}
          
                   System.out.println("Tu salario es " + salario );          
                     
      

   } 
 }