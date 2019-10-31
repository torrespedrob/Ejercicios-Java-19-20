public class Ej14 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce el numero(0 a 100) en el que estes pensando: ");
    int entrada = Integer.parseInt(System.console().readLine());
    System.out.println("Ahora intentare adivinar el numero");
    int oportunidades = 5;
    int generado;
    do {
      generado = (int)(Math.random()*101);
      System.out.println("Es el " + generado + "?");
      if (generado == entrada) {
        System.out.print("Lo he adivinado");
      }
    } while(oportunidades > 5);
  }
}
