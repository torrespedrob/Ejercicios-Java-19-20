public class Ej02 {
  public static void main(String[] args) {
    System.out.println("Conversor de euros a pesetas");
    System.out.println("Introduce la cantidad en euros: ");
    double numero1 = Double.parseDouble(System.console().readLine());
    double peseta = 166.386;
    double calculo = numero1 * peseta;
    System.out.printf(numero1 + " euros son " + (int) calculo + " pesetas");
  }
}
