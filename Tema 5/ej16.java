public class ej16 {
  public static void main(String[] args) {
    System.out.println("Puedo saber si un número es o no primo");
    int numero = 0;
    
    do {
      System.out.println("Introduce un número: ");
      numero = Integer.parseInt(System.console().readLine());
      if ((numero % 2) == 0) {
        System.out.println("El número " + numero + " es primo");
      } else {
        System.out.println("El número " + numero + " no es primo");
      }
    } while (numero >= 0);
  }
}
