import java.util.Scanner;
public class Ej10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Genero arrays con numeros aleatorios y ordeno los pares");
    int[] primero = new int[20];
    int[] auxiliar = new int [20];
    int[] auxiliar2 = new int[20];
    for (int i = 0; i < 20; i++) {
      primero[i] = (int)(Math.random() * 100);
      if (primero[i] % 2 == 0) {
        auxiliar[i] = primero[i];
      } else {
        auxiliar2[i] = primero[i];
      }
    }
    
    for (int i = 0; i < 20; i++) {
      System.out.println("Par: " + auxiliar[i]);
    }
    for (int i = 0; i < 20; i++) {
      System.out.println("Impar: " + auxiliar2[i]);
    }
  }
}
