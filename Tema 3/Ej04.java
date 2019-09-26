public class Ej04 {
  public static void main(String[] args) {
    System.out.println("Puedo sumar, restar, multiplicar y dividir dos numeros enteros");
    System.out.println("Introduce el primer numero: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el segundo numero: ");
    int numero2 = Integer.parseInt(System.console().readLine());
    int suma = numero1 + numero2;
    int resta = numero1 - numero2;
    int multiplicacion = numero1 * numero2;
    double division = (double) numero1 / (double) numero2;
    
    System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + suma);
    System.out.println("La resta de " + numero1 + " y " + numero2 + " es " + resta);
    System.out.println("La multiplicacion de " + numero1 + " y " + numero2 + " es " + multiplicacion);
    System.out.println("La division de " + numero1 + " y " + numero2 + " es " + division);
  }
}
