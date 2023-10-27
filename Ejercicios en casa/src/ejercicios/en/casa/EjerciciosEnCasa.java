package ejercicios.en.casa;
import java.util.Scanner;
public class EjerciciosEnCasa {
 public static void main(String[] args) {

     Scanner sc =new Scanner(System.in);
     
     System.out.println(" ingresa un numero entero ");
 int numero= sc.nextInt();
 int signo = dimesigno (numero);
 if (signo ==-1)
 {
     System.out.println(" El numero es negativo ");
 } else if  (signo ==0)
 {
     System.out.println(" El numero es igual a 0 ");
 } else {
     System.out.println(" El numero es postivo ");
  }
 }
  public static int dimesigno(int a)
  {
  if (a<0){
  return -1 ;
  } else if (a==0)
  {
  return 0;
  } else {
  return 1;
   }
  } 
 }


