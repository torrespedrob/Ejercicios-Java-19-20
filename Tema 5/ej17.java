public class ej17 {
  public static void main(String[] args) {
    System.out.println("Puedo sumar los 100 números siguientes a un número introducido");
    System.out.println("Introduce un número entero positivo: ");
    int numero = Integer.parseInt(System.console().readLine());
    int suma = 0;
    
    if (numero >= 0) {
      for (int i = 0; i < 100; i ++) {
        suma += numero;
        
      }
    }
  }
}
