public class ej55 {
  public static void main(String[] args) {
    System.out.println("Puedo desplazar números");
    System.out.print("Introduce un número entero: ");
    int n = Integer.parseInt(System.console().readLine());
    int dividido = n / 10;
    int ultimo = n % 10;
    
    System.out.println("El numero " + n + " se convierte en " + ultimo + "" + dividido);
    
  }
}
