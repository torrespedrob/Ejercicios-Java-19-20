public class Ej17 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Puedo saber cuál es la última cifra de un número entero introducido");
    System.out.println("Introduce un número entero: ");
    int entrada = Integer.parseInt(System.console().readLine());
    
    //Cálculo
    System.out.println("La última cifra del número introducido es " + (entrada % 10));
  }
}
