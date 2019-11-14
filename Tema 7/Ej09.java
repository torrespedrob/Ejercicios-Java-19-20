import java.util.Scanner;
public class Ej09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Pido 8 numeros y digo si son pares o impares");
    int[] entrada = new int[8];
    
    for (int i = 0; i < 8; i++) {
      System.out.print("Introduce un numero entero: ");
      entrada[i] = Integer.parseInt(s.nextLine());
      if (entrada[i] % 2 == 0) {
        System.out.println("El " + entrada[i] + " es par");
      } else {
        System.out.println("El " + entrada [i] + " es impar");
      }
    }
  }
}
