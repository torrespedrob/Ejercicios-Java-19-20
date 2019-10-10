public class ej18 {
  public static void main(String[] args) {
    System.out.println("Puedo sumar los 100 números siguientes a un número introducido");
    System.out.println("Introduce un número entero positivo: ");
    int numero = Integer.parseInt(System.console().readLine());
    if (numero >= 0) {
          int suma = 0;
    for (int i = 0; i < 100; i ++) {
        suma += numero;
      }
    }
  }
}
