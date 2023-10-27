package ejercicio.pkg5.pkg7.de.funciones.uf2;
import java.util.Scanner;
public class Ejercicio57DeFuncionesUF2 {
public static void main(String[] args) {

  double  ancho , alto;
    System.out.println("pon un ancho ");
    ancho=pedirDatosEnteroPositivo();
    System.out.println("pon alto");
    alto=pedirDatosEnteroPositivo();
    double perimetro=perimetroRectangulo(ancho , alto);
    double area= arearectangulo(ancho , alto)
            
    }

public static double  perimetroRectangulo(double ancho , double alto)
{
double perimetro = (ancho+alto) *2;
return perimetro;
}

public static double  areaRectangulo(double ancho , double alto)
{
double area = ancho*alto;
return area;

}
 public static int pedirDatosEnteroPositivo()
 {
 Scanner sc=new Scanner(System.in);
 int num;
 do{
     System.out.println("El valor a 0 "); 
     num=sc.nextInt();
     
 }while (num<=0);
 
 
}
