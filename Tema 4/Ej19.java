public class Ej19 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Puedo saber cuantos digitos tiene un número entero");
    System.out.println("Introduce un numero (máximo 5 dígitos): ");
    int numero = Integer.parseInt(System.console().readLine());
    
    //Cálculo
    
    //Cálculo para negativos
    if (numero < 0) {
      numero = -numero;
    }
    
    if (numero < 10) {
      System.out.println("El número introducido tiene 1 cifra");
    } else if (numero < 100) {
      System.out.println("El número introducido tiene 2 cifras");
    } else if (numero < 1000) {
      System.out.println("El número introducido tiene 3 cifras");
    } else if (numero < 10000) {
      System.out.println("El número introducido tiene 4 cifras");
    } else {
      System.out.println("El número introducido tiene 5 cifras");
    }
  }
}
