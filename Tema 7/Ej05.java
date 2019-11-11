//Imports
import java.util.ArrayList;
import java.util.Scanner;

//Programa
public class Ej05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] entrada = new int[10];
    int i;
    int minimo = Integer.MIN_VALUE;
    int maximo = Integer.MAX_VALUE;
    
    //Entrada y calculo
    for (i = 0; i < 10; i++) {
      System.out.print("Introduzca un numero: ");
      entrada[i] = Integer.parseInt(s.nextLine());
      
      if (entrada[i] < minimo) {
        minimo = entrada[i];
      }
      
      if (entrada[i] > maximo) {
        maximo = entrada[i];
      }
    }
    
    System.out.println();
    
    for (i = 0; i < 10; i++) {
      System.out.print(entrada[i]);
      if (entrada[i] == maximo) {
        System.out.print(" maximo");
      }
      
      if (entrada[i] == minimo) {
        System.out.print(" minimo");
      }
      System.out.println();
    }
  }
}
