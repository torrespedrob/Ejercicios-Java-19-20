public class ej22 {
  public static void main(String[] args) {
    System.out.println("Muestra por pantalla los primos de 2 a 100");

    for (int i = 2; i <= 100; i++ ) {
      if ((i % 2) == 0) {
        System.out.println("El número " + i + " es primo");
      }
      i++;
    }
  }
}
