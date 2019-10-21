public class ej62 {
  public static void main(String[] args) {
    System.out.println("Puedo saber si un numero es afortunado");
    System.out.print("Introduce un numero entero: ");
    long n = Long.parseLong(System.console().readLine());
    long copia = n;
    int afortunado = 0;
    int desafortunado = 0;
    
    while (n > 0) {
      int digito = (int)(n % 10);
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
        afortunado++;
      } else {
        desafortunado++;
      }
      n /= 10;
    }
    
    if (afortunado > desafortunado) {
      System.out.println("El numero introducido es afortunado");
    } else {
      System.out.println("El numero introducido es desafortunado");
    }
  }
}
