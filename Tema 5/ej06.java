public class ej06 {
  public static void main(String[] args) {
    System.out.println("De 320 a 160 de 20 en 20");
    int numero = 320;
    
    do {
      System.out.println(numero);
      numero -= 20;
    } while (numero >= 160);
  }
}
