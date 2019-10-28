public class Ej06 { // Clase principal
  public static void main(String[] args) {
    boolean acertado = false;
    int solucion = (int)(Math.random() * 101);
    int oportunidades = 5;
    System.out.println("Numero de 0 a 100, tienes 5 intentos");
    do {
      System.out.print("Introduce un numero de 0 a 100: ");
      int numero = Integer.parseInt(System.console().readLine());
      if (numero == solucion) {
        acertado = true;
      }
      if (!acertado) {
        System.out.println("Lo siento, ese no es el numero");
        oportunidades--;
      } else if (acertado) {
        System.out.println("Enhorabuena, lo has acertado");
      }
    } while ((oportunidades != 0 && !acertado));
    if (oportunidades == 0) {
      System.out.print("Se han acabado los intentos");
    }
  }
}
