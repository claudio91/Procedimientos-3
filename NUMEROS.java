/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;
import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class NUMEROS {

    
    public static void main(String[] args) {
       
        System.out.println("Ingrese numero ; "); // mostramos por pantalla que ingrese un numero
        Scanner sc = new Scanner(System.in); // creamos un objeto llamado sc para luego utilizarlo
        int numero=sc.nextInt(); // iniciamos numero, con el valor de el metodo para capturar por el teclado
        numero(numero); // invocamos nuestro metodo llamado nuemero
        
    
    }
    public static void numero(int numero){ // creamos nuestro medotodo llamado
    
    for (int i=0;i<=numero;i++){ // cramos una iteracion para que cumpla una condicion hasta que i sea menor o igual a el numero ingrasado,si no, se suma 1 a i(ESTO SE REPETIRA HASTA QUE SE CUMPLA)
         
     if (numero<=0){  // luego si numero ingresado es menor o igual a 0 entonces sera "ERROR"
        System.out.println("ERROR ");// SALIDA ESTANDAR 
      }else 
        System.out.print( i + ",");// FINALMENTE SI EL NUMERO ES MAYOR QUE 0, ENTONCES MOSTRARA LA CANTIDAD DE NUMEROS QUE HAY ENTRE EL NUMERO INGRESADO Y EL CERO,CONCATENANDO DE LA SIGUIENTE MANERA
    
        
    }

    }
}
