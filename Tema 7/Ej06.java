import java.util.Scanner;
public class Ej06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] entrada = new int[16];
    int aux;
    
    for (int i = 0; i < 15; i++) {
      System.out.print("Introduzca un numero: ");
      entrada[i] = Integer.parseInt(s.nextLine());
      aux = entrada[i];
      
      entrada[i + 1] = aux;
    }
    entrada[0] = entrada[15];
    for (int i = 0; i < 15; i++) {
      System.out.print(entrada[i]);
    }
  }
}
