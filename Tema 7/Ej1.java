import java.util.Scanner;
public class Ej1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] num;
    num = new int[10];
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 16;
    num[8] = 5;
    num[9] = 120;
    
    for (int i = 0; i < 9; i++) {
      System.out.println(num[i]);
    }
  }
}
