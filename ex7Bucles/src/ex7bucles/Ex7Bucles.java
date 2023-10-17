package ex7bucles;
import java.util.Scanner;
public class Ex7Bucles {
public static void main(String[] args) {
  Scanner sc=new Scanner (System.in);
  

    int cont , par=0, inpar=0;
    
    for (cont=100; cont <=200; cont++)
    {
        System.out.println("contador -------" + cont);   
    
        if (cont%2 ==0)
        {
        par=par + cont;
        }
        
        else if (cont%2 !=0)
        {
        inpar = inpar + cont;        
        }
        }
    System.out.println(""); 
    System.out.println("La suma de los pares"+ par);
   System.out.println("La suma de los inpares"+ inpar);
}
    
}
