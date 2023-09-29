
package ejercicio15;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        
 System.out.println("ingrese el primer numero: ");
        double num1 = sc.nextDouble();
        
       //ingrese el segundo numero     
        System.out.println("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();  
        
      //ingrese el segundo numero     
        System.out.println("Ingrese el tercer numero: ");
        double num3 = sc.nextDouble();       


//verificar 

if (num1>=num2 && num1>=num3){
    System.out.println(" valor mas grande : " + num1);
}

else if (num2>=num1 && num2>=num3)
{
    System.out.println("valor mas grande : " +num2);
}

else if (num3>=num2 && num3>=num1){

    System.out.println("muestra el valor  mas grande" + num3 );
}


    }    
}
