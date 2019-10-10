public class ej27 {
  public static void main(String[] args) {
    System.out.println("Puedo saber los múltiplos de 3 hasta un número introducido");
    int numero = Integer.parseInt(System.console().readLine());
    
    for (int i = 3; i < numero; i++) {
      if ((i % 3) == 0) {
        System.out.println("El número " + i + " es múltiplo de 3");
      }
    }
  }
}
