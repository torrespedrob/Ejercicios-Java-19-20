public class Ej6 {
  public static void main(String[] args) {
    double base = 12.25;
    System.out.printf("%-20s %-10s\n", "BASE IMPONIBLE", base);
    System.out.printf("%-20s %-10s\n", "IVA (21%)", (base * 0.21));
    System.out.println("---------------------------");
    System.out.printf("%-20s %-10s", "TOTAL", (base * 1.21));
  }
}
