public class ej08 {
  public static void main(String[] args) {
    System.out.println("Tabla de multiplicar");
    System.out.print("Introduce el número que quieres saber: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i <= 10; i++) {
      System.out.println(numero + " * " + i + " = " + (numero*i));
    }
  }
}
