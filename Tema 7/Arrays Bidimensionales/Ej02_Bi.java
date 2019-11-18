import java.util.Scanner;
public class Ej02_Bi {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int [][] num = new int[4][5];
    for (int i = 0; i < 4; i++) {
      System.out.print("Introduce un numero para la fila " + num[i] + ": ");
      num[i][0] = Integer.parseInt(s.nextLine());
      
    }
  }
}
