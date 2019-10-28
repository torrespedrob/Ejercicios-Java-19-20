public class Ej09 { // Clase principal
  public static void main(String[] args) {
    int exacto = 24;
    boolean acertado = false;
    int generado;
    int cuentaPares = 0;
    do {
      generado = (int)(Math.random()*101);
      if ((generado % 2) == 0) {
        cuentaPares++;
        if (generado == exacto) {
          acertado = true;
          System.out.println("Ya ha aparecido el 24");
          System.out.println("Se han calculado " + cuentaPares + " numeros pares");
        }
      }
    } while ((!acertado));
  }
}
