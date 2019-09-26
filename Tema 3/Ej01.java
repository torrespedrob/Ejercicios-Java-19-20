public class Ej01 {
  public static void main(String[] args) {
    System.out.println("Puedo multiplicar dos numeros enteros");
    System.out.println("Introduce el primer numero: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el segundo numero: ");
    int numero2 = Integer.parseInt(System.console().readLine());
    int multiplicacion = numero1 * numero2;
    
    System.out.println("La multiplicacion de " + numero1 + " y " + numero2 + " es " + multiplicacion);
  }
}
