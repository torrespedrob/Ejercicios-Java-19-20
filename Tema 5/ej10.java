public class ej10 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Puedo hacer la media de varios números");
    int numero = 0;
    int suma = 0;
    int cuentaNumero = 0;
    do {
      System.out.println("Introduce un numero entero: ");
      numero = Integer.parseInt(System.console().readLine());
      suma += numero;
      cuentaNumero++;
    } while (numero >= 0);
    
    double media = ((double) suma / (double) cuentaNumero);
    System.out.println("La media de esos números es " + media);
    
  }
}
