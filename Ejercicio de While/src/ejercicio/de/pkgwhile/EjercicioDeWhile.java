package ejercicio.de.pkgwhile;
import java.util.Scanner;
public class EjercicioDeWhile {

 public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);

 
 
 int cont =1;
// 
// int cont=1;
// 
// while (cont<=10)
// {
//     System.out.println("Contador ->" + cont);
// cont = cont +1;
// }
//     System.out.println("*******************");      
       
   boolean end = false ;
   
   cont = 1;
   while (!end)
        
        System.out.println("Contador ->" + cont);
        cont = cont + 1;
        
        
        if (cont>10)
        {
            System.out.println("Activo variable end ...");
            end = true;
        }
        
        
        
        
        
    }
}
