public class ej03 {
  public static void main(String[] args) {
    System.out.println("De 0 a 100 con múltiplos de 5");
    int numero = 0;
    
    do {
      System.out.println(numero);
      numero += 5;
    } while (numero <= 100);
  }
}
