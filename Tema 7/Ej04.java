import java.util.Arrays;
import java.util.Scanner;
public class Ej04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    for (int i =0; i< 20; i++) {
      numero[i] = (int)(Math.random() * 100);
      cuadrado[i] = (int)(numero[i] * numero[i]);
      cubo[i] = (int)(numero[i] * numero[i] * numero[i]);
    }
    
    System.out.println(Arrays.toString(numero));
    System.out.println(Arrays.toString(cuadrado));
    System.out.println(Arrays.toString(cubo));
    
  }
}
