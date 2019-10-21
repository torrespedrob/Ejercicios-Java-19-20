import java.util.Scanner;

public class PiramideMaya {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Puedo dibujar una pirámide maya");
    System.out.println("Introduce la altura de la pirámide maya: ");
    
    int altura = Integer.parseInt(s.nextLine());
    
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < altura - i; j++) {
        System.out.print(" ");
      }
      
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      
      System.out.print(i % 2 == 0 ? "****" : "    ");
      
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      
      System.out.println();
    }
  }
}
