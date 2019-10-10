public class ej13 {
  public static void main(String[] args) {
    System.out.println("Puedo saber si 10 números son positivos o negativos");
    int num = 0;
    for (int i = 0; i < 10; i++) {
      num = Integer.parseInt(System.console().readLine());
      if (num >= 0) {
        System.out.println("El número " + num + " es positivo");
      } else {
        System.out.println("El número " + num + " es negativo");
      }
    }
  }
}
