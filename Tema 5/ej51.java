public class ej51 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero (mayor que cero): ");
    int entrada = Integer.parseInt(System.console().readLine());
    int numero = entrada;
    int volteado = 0;
    boolean numeroComido = false;
    
    while (numero > 0) {
      if ((numero % 10 != 0) && (numero % 10 != 8)) {
        volteado = (volteado * 10) + (numero % 10);
      } else {
        numeroComido = true;
      }
      numero /= 10;
    }

    numero = volteado;
    volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }

    if (numeroComido) {
      System.out.print("Después de haber sido comido por el gusano numérico");
      System.out.println(" se queda en " + volteado);
    } else {
      System.out.println("El gusano numérico no se ha comido ningún dígito.");
    }
  }
}
