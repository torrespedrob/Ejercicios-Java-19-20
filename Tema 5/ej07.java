public class ej07 {
  public static void main(String[] args) {
    System.out.println("Caja fuerte cifrada");
    System.out.println("Intenta adivinar el código de 4 cifras de la caja fuerte. Tienes 4 intentos.");
    int solucion = 8888;
    int entrada = 0;
    int intentos = 4;
    
    do {
      System.out.println("Introduce el codigo de la caja fuerte: ");
      entrada = Integer.parseInt(System.console().readLine());
      if (entrada == solucion) {
        System.out.println("Enhorabuena, lo has adivinado");
        break;
      } else {
        System.out.println("Ese no es el codigo");
        intentos--;
      }
    } while (intentos > 0);
    
    if (intentos == 0) {
      System.out.print("Lo siento, no lo has adivinado");
    }
  }
}
