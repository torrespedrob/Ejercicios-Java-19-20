import java.util.Scanner;
public class Ej3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa recoge diez numeros y los muestra en orden inverso");
    int[] num = new int[10];
    
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un numero: ");
      num[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println("Esos numeros, en orden inverso, son: ");
    for (int i = 10; i > 0; i--) {
      System.out.println(num[i-1]);
    }
  }
}
