public class Ej02 {
  public static void main(String[] args) {
    System.out.println("Conversor de euros a pesetas");
    System.out.println("Introduce la cantidad en euros: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    double peseta = 166.386;
    double calculo = numero1 * peseta;
    System.out.println(numero1 + " euros son " + calculo + " pesetas");
  }
}
