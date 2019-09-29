public class Ej07 {
  public static void main(String[] args) {
    System.out.print("Introduce el precio sin IVA del producto: ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.printf("%-15s %10.2f\n", "BASE IMPONIBLE", base);
    System.out.printf("%-15s %10.2f\n", "IVA", (base * 0.21));
    System.out.printf("--------------------------\n");
    System.out.printf("%-15s %10.2f\n", "TOTAL", (base * 1.21));
  }
}
