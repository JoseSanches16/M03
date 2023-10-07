package descuentos;
import java.util.Scanner;

public class Descuentos {
public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
  //  ingrese el importe gastado
        System.out.print("Ingrese el importe gastado: ");
        double importeGastado = sc.nextDouble();

        //  importe y sus respectivos descuentos
        double descuento = 0.0;

        if (importeGastado < 800) {
            descuento = 0.0;
        } else if (importeGastado >= 800 && importeGastado <= 1500) {
            descuento = 6.0;
        } else if (importeGastado > 1500 && importeGastado <= 3000) {
            descuento = 8.0;
        } else {
            descuento = 10.0;
        }

        // Calcular el dinero descontado en euros
        double dineroDescontado = (importeGastado * descuento) / 100.0;

        // Calcular el total a pagar después del descuento
        double totalAPagar = importeGastado - dineroDescontado;

        // Mostrar el resultado 
        System.out.println("El importe gastado esta en la categoria correspondiente.");
        System.out.println("El descuento aplicado sera del " + descuento + "%.");
        System.out.println("El dinero descontado sera de " + dineroDescontado);
        System.out.println("El total a pagar sera de " + totalAPagar);
    }
}
