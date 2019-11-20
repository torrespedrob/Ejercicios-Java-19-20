import java.util.Scanner;
public class Ej02_Bi {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int [][] num = new int[4][5];
    for (int i = 0; i < 5; i++) {
      System.out.print("Introduce un numero para " + num[0][i]]);
      num[0][i] = Integer.parseInt(s.nextLine());
      
    }
  }
}
