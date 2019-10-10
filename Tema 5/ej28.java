public class ej23 {
  public static void main(String[] args) {
    System.out.println("Ve introduciendo números por teclado");
    int suma = 0;
    double media = 0;
    int cuentaNumeros = 0;
    int numero = 0;
    
    for (int i = 0; suma < 10000; i++) {
      System.out.println("Introduzca un número: ");
      numero = Integer.parseInt(System.console().readLine());
      suma += numero;
      cuentaNumeros++;
    }
    
    System.out.println("Has introducido " + cuentaNumeros + " números");
    System.out.println("El total introducido vale " + suma);
    System.out.print("La media de todos los números es " + (suma/cuentaNumeros));
    
  }
}
