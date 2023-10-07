package Calcular.Impuestos;
import java.util.Scanner;
public class CalcularImpuestos {
  public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
  
  
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
            System.out.println("Tu salario BRUTO es... " + salario);
            
            
            
            
final int SALARIO_SIN_IMPUESTOS =500;            
final int SALARIO_TOPE_IMPUESTOS =900;
double impuestos=0 , impuestos_25;

double salario_impuestos , salario-tope_impuestos;
// calcul de impostos 
            
if (salario>SALARIO_SIN_IMPUESTOS)            


//he superado el tope  y tengo que aplicar el 45%

salario_tope_impuestos = salario - SALARIO_TOPE_IMPUESTOS:
impuestos = salario_tope_impuestos*0.45; 
//impuesto de lo que sea pasa al tope

{
//tengo impuestos 
    salario_impuestos = salario - SALARIO_SIN_IMPUESTOS;
    impuestos = (salario_impuestos * 25)/100; //* 0.25
    System.out.println("impuestos " + impuestos);
}

else { 
        //no tengo 
         impuestos = 0;    
        }

salario = salario - impuestos;
            System.out.println("Salario NETO " + salario);
    }    
        
        
        
        
        
        
  }
}
