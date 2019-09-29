public class Ej03 {
  public static void main(String[] args) {
    System.out.println("Conversor de pesetas a euros");
    System.out.println("Introduce la cantidad en pesetas: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    double conversion = 166.386;
    double calculo = numero1 / conversion;
    System.out.printf("%d pesetas son %.2f euros", numero1, calculo);
  }
}
